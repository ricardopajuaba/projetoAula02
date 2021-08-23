package entities;

public class Pessoa {

	// atributos (dados -> campos)
	private Integer id;
	private String nome;
	private String cpf;

	// construtor default
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	// sobrecarga do método construtor
	public Pessoa(Integer id, String nome, String cpf) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}


