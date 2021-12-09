package prova.questao.dao;

import java.util.List;
import prova.questao.domain.PessoaFisica;


public interface PessoaFisicaDao {

	void save(PessoaFisica pessoafisica);

	void update(PessoaFisica pessoafisica);

	void delete(Long id);

	PessoaFisica findById(Long id);

	List<PessoaFisica> findAll();

}
