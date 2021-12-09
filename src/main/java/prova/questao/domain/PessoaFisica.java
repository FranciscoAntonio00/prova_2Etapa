package prova.questao.domain;

import java.time.LocalDate;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name = "PESSOA_FISICA")
public class PessoaFisica extends Pessoa {
	
	@Column
	private int rg;
	@Column
	private int cpf;
	@Column
	private String sexo;
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="datanasc", columnDefinition = "DATE")
	private LocalDate dataNasc;
	
	void ValidarCPF() {	
	}
	
	public int getRg() {
		return rg;
	}
	
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public LocalDate getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + cpf;
		result = prime * result + ((dataNasc == null) ? 0 : dataNasc.hashCode());
		result = prime * result + rg;
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		PessoaFisica other = (PessoaFisica) obj;
		if (cpf != other.cpf)
			return false;
		if (dataNasc == null) {
			if (other.dataNasc != null)
				return false;
		} else if (!dataNasc.equals(other.dataNasc))
			return false;
		if (rg != other.rg)
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "PessoaFisica [rg=" + rg + ", cpf=" + cpf + ", sexo=" + sexo + ", dataNasc=" + dataNasc + "]";
	}
	
	public PessoaFisica() {
		
	}
	
}
