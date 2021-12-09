package prova.questao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import prova.questao.domain.PessoaFisica;
import prova.questao.service.PessoaFisicaService;

@Controller
@RequestMapping("/pessoafisica")
public class PessoaFisicaController {

	@Autowired
	private PessoaFisicaService pessoafisicaService;

	@GetMapping("/cadastrar")
	public String cadastrar(PessoaFisica pessoafisica) {
		return "/pessoafisica/cadastro";
	}

	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("pessoafisica", pessoafisicaService.buscarTodos());
		return "/pessoafisica/lista";
	}

	@PostMapping("/salvar")
	public String salvar(PessoaFisica pessoafisica) {
		pessoafisicaService.salvar(pessoafisica);
		return "redirect:/pessoafisica/cadastrar";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("pessoafisica", pessoafisicaService.buscarPorId(id));
		return "/pessoafisica/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(PessoaFisica pessoafisica) {
		pessoafisicaService.editar(pessoafisica);
		return "redirect:/pessoafisica/listar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		pessoafisicaService.excluir(id);
		return listar(model);
		 
	}
	
}



