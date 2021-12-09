package prova.questao.service;

import java.util.List;
import prova.questao.domain.PessoaFisica;

public interface PessoaFisicaService {
	
	void salvar(PessoaFisica pessoafisica);

	void editar(PessoaFisica pessoafisica);

	void excluir(Long id);

	PessoaFisica buscarPorId(Long id);

	List<PessoaFisica> buscarTodos();
}
