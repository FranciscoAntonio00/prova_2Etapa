package prova.questao.service;

import java.util.List;
import prova.questao.domain.PessoaJuridica;

public interface PessoaJuridicaService {
	
	void salvar(PessoaJuridica pessoajuridica);

	void editar(PessoaJuridica pessoajuridica);

	void excluir(Long id);

	PessoaJuridica buscarPorId(Long id);

	List<PessoaJuridica> buscarTodos();
}
