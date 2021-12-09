package prova.questao.dao;

import java.util.List;
import prova.questao.domain.Pessoa;

public interface PessoaDao {

	void save(Pessoa pessoa);

	void update(Pessoa pessoa);

	void delete(Long id);

	Pessoa findById(Long id);

	List<Pessoa> findAll();

}
