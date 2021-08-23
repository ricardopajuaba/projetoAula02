package entities;

import java.util.Date;

public class Funcionario extends Pessoa {

	private String matricula;
	private Double salario;
	private Date dataAdmissao;
	private Funcao funcao; // Associação (TER-1)

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Integer id, String nome, String cpf, String matricula, Double salario, Date dataAdmissao) {
		super(id, nome, cpf);
		this.matricula = matricula;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Date getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}

	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

}
