package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoDoItem;
import entities.Produto;
import entitiesEnum.StatudDoPedido;

/*
 * Este programa faz uma simulação de pedidos de um certo produto, 
 * em que o usuario colocara seus dados nome, email, data de nascimento, 
 * e preencherar um formulário de pedidos de um produdto, dando quantidade
 * e preço, que ao final da execução mostrarar o sumario dos pedidos.
 * 
 */


class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do cliente: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Data de nascimento (DD/MM/YYYY): ");
		Date nascimento = sdf.parse(sc.next());
		
		Cliente cliente = new Cliente(nome, email, nascimento);
		
		System.out.println("Entre com a ordem do pedido ");
		System.out.print("Status: ");
		StatudDoPedido status = StatudDoPedido.valueOf(sc.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);
		
		
		System.out.print("Entre com o numero de pedidos: ");
		int n = sc.nextInt();
		System.out.println();
		
		for(int i = 1 ; i <=n; i++) {
			System.out.println("Pedido numero #"+i+" dados do item");
			System.out.println("Nome do produto: ");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.println("Preço: ");
			double preço = sc.nextDouble();
			
			Produto produto = new Produto(nomeProduto, preço);
			
			System.out.println("Quantidade: ");
			int quant = sc.nextInt();
			
			PedidoDoItem pedidoItem = new PedidoDoItem(quant, produto, preço);
			pedido.addProduto(pedidoItem);
		}
		
		System.out.println();
		System.out.println("SUMARIO DO PEDIDO:");
		System.out.println(pedido.toString());
		
		
		sc.close();
	}

}
