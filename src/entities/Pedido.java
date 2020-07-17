package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entitiesEnum.StatudDoPedido;

public class Pedido {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); //declarando o formato da data.

	private Date momento;
	private StatudDoPedido status;
	
	private Cliente cliente;
	private List<PedidoDoItem> item = new ArrayList<>();
	
	public Pedido(Date momento, StatudDoPedido status, Cliente cliente) {
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatudDoPedido getStatus() {
		return status;
	}

	public void setStatus(StatudDoPedido status) {
		this.status = status;
	}
	
	public void addProduto(PedidoDoItem item) {
		this.item.add(item);
	}
	
	public void removerProduto(PedidoDoItem item) {
		this.item.remove(item);
	}
	
	public Double total() {
		double soma = 0.0;
		
		for(PedidoDoItem p: this.item) {
			soma += p.subTotal();
		}
		return soma;
	}
	
	public String toString() { 
		StringBuilder sb = new StringBuilder();
		sb.append("Data: ");
		sb.append(sdf.format(momento) + "\n");
		sb.append("Status: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Pedidos dos items :\n");
		for (PedidoDoItem p : this.item) {
			sb.append(p + "\n");
		}
		sb.append("Preço total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
}
