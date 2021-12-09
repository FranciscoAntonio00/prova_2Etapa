package prova.questao.service;

import java.util.List;
import prova.questao.domain.Pessoa;

public interface PessoaService {
	
	void salvar(Pessoa pessoa);

	void editar(Pessoa pessoa);

	void excluir(Long id);

	Pessoa buscarPorId(Long id);

	List<Pessoa> buscarTodos();
}
