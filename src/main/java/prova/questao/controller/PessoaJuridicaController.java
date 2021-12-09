package prova.questao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import prova.questao.domain.PessoaJuridica;
import prova.questao.service.PessoaJuridicaService;

@Controller
@RequestMapping("/pessoajuridica")
public class PessoaJuridicaController {

	@Autowired
	private PessoaJuridicaService pessoajuridicaService;

	@GetMapping("/cadastrar")
	public String cadastrar(PessoaJuridica pessoaJuridica) {
		return "/pessoajuridica/cadastro";
	}

	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("pessoajuridica", pessoajuridicaService.buscarTodos());
		return "/pessoajuridica/lista";
	}

	@PostMapping("/salvar")
	public String salvar(PessoaJuridica pessoajuridica) {
		pessoajuridicaService.salvar(pessoajuridica);
		return "redirect:/pessoajuridica/cadastrar";
	}

	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("pessoajuridica", pessoajuridicaService.buscarPorId(id));
		return "/pessoajuridica/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(PessoaJuridica pessoajuridica) {
		pessoajuridicaService.editar(pessoajuridica);
		return "redirect:/pessoajuridica/listar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, ModelMap model) {
		pessoajuridicaService.excluir(id);
		return listar(model);
		 
	}
	
}

