package entities;

public class Produto {

	private String nomeDoProduto;
	private Double preço;
	
	public Produto() {
	}

	public Produto(String nomeDoProduto, Double preço) {
		this.nomeDoProduto = nomeDoProduto;
		this.preço = preço;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
}
