package prova.questao.dao;

import java.util.List;
import prova.questao.domain.PessoaJuridica;

public interface PessoaJuridicaDao {

	void save(PessoaJuridica pessoajuridica);

	void update(PessoaJuridica pessoajuridica);

	void delete(Long id);

	PessoaJuridica findById(Long id);

	List<PessoaJuridica> findAll();

}
