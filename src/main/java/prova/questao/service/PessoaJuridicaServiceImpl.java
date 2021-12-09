package prova.questao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import prova.questao.dao.PessoaJuridicaDao;
import prova.questao.domain.PessoaJuridica;


@Service
@Transactional(readOnly = false)
public class PessoaJuridicaServiceImpl implements PessoaJuridicaService{

	@Autowired
	private PessoaJuridicaDao dao;
	
	@Override
	public void salvar(PessoaJuridica pessoajuridica) {
		dao.save(pessoajuridica);
		
	}

	@Override
	public void editar(PessoaJuridica pessoajuridica) {
		dao.update(pessoajuridica);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public PessoaJuridica buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<PessoaJuridica> buscarTodos() {
		return dao.findAll();
	}

}
