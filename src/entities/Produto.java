package entities;

public class Produto {

	private String nomeDoProduto;
	private Double pre�o;
	
	public Produto() {
	}

	public Produto(String nomeDoProduto, Double pre�o) {
		this.nomeDoProduto = nomeDoProduto;
		this.pre�o = pre�o;
	}

	public String getNomeDoProduto() {
		return nomeDoProduto;
	}

	public Double getPre�o() {
		return pre�o;
	}

	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
	}
	
}
