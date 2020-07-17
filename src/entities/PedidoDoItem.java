package entities;

public class PedidoDoItem {

	private Integer quantidade;
	private Produto produto;
	private Double preco;

	
	public PedidoDoItem(Integer quantidade, Produto produto, Double preco) {
		this.quantidade = quantidade;
		this.produto = produto;
		this.preco = preco;
	}
	
	public Double getPreco() {
		return preco;
	}

	public void setPreço(Double preco) {
		this.preco = preco;
	}

	public PedidoDoItem(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public double subTotal() {
		return preco * quantidade;
	}

	@Override
	public String toString() {
		return "Produto: " + produto.getNomeDoProduto() +"\n"+ 
				"Quantidade: " + quantidade +"\n"+
				"Preço: " + preco;
	}	

}
