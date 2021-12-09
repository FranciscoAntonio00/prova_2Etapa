package prova.questao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import prova.questao.dao.PessoaFisicaDao;
import prova.questao.domain.PessoaFisica;


@Service
@Transactional(readOnly = false)
public class PessoaFisicaServiceImpl implements PessoaFisicaService{

	@Autowired
	private PessoaFisicaDao dao;
	
	@Override
	public void salvar(PessoaFisica pessoafisica) {
		dao.save(pessoafisica);
		
	}

	@Override
	public void editar(PessoaFisica pessoafisica) {
		dao.update(pessoafisica);
		
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public PessoaFisica buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<PessoaFisica> buscarTodos() {
		return dao.findAll();
	}

}
