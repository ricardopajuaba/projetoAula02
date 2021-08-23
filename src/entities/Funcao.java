package entities;

public class Funcao {

	private Integer id;
	private String sigla;
	private String descricao;

	public Funcao() {
		// TODO Auto-generated constructor stub
	}

	public Funcao(Integer id, String sigla, String descricao) {
		super();
		this.id = id;
		this.sigla = sigla;
		this.descricao = descricao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

