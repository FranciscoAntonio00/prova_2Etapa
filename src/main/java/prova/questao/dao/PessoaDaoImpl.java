package prova.questao.dao;

import org.springframework.stereotype.Repository;
import prova.questao.domain.Pessoa;

@Repository
public class PessoaDaoImpl extends AbstractDao<Pessoa, Long> implements PessoaDao{

}
