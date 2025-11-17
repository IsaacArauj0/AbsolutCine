package web.model;

public enum StatusTag {

	PUBLICO("publico"),
	PRIVADO("privado");
	
	private String descricao;
	
	private StatusTag(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
