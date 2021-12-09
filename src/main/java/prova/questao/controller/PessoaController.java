package prova.questao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import prova.questao.domain.Pessoa;
import prova.questao.service.PessoaService;

@Controller
@RequestMapping("/pessoas")
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	@GetMapping("/cadastrar")
	public String cadastrar(Pessoa pessoa) {
		return "/pessoa/cadastro";
	}

	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("pessoas", pessoaService.buscarTodos());
		return "/pessoa/lista";
	}

	@PostMapping("/salvar")
	public String salvar(Pessoa pessoa) {
		pessoaService.salvar(pessoa);
		return "redirect:/pessoas/cadastrar";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("pessoa", pessoaService.buscarPorId(id));
		return "/pessoa/cadastro";
	}

	@PostMapping("/editar")
	public String editar(Pessoa pessoa) {
		pessoaService.editar(pessoa);
		return "redirect:/pessoas/listar";
	}

	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		pessoaService.excluir(id);
		return listar(model);

	}

}