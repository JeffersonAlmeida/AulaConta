package gui;

import classesBasicas.Cliente;
import classesBasicas.Conta;
import classesBasicas.ContaAbstract;
import fachada.Fachada;

public class Test {

	public static void main(String[] args) {
		
	    Conta conta = new Conta();
	    Cliente  cliente = new Cliente("JJ","12345678910");
	    conta.setCliente(cliente);
	    conta.setNumero("1");
	    conta.setSaldo(10.0);
	    
	    conta.creditar(10.0);
	    
	    
	    System.out.println(conta.toString());
	    double valor = 50.0;
	    try{	    	
	    	 conta.debitar(valor);
	    }catch (SaldoInsuficienteExcecao e) {
			e.imprimeMensagem(valor);
		}
	   	    
	    System.out.println("Tarefa Parte II ");
	    
	    Conta c2 = new Conta("2",5.0,new Cliente("PEDRO", "12345678091"));
	    Conta c3 = new Conta("3",10.0,new Cliente("Maria", "12342378091"));
	    
	    System.out.println("\nAntes\n");
	    System.out.println(c2.toString());
	    System.out.println(c3.toString());
	    
	    double valorDebito = 3.0;
	    try {
	    	 c2.transferir(valorDebito, c3); // transferencia
		} catch (SaldoInsuficienteExcecao e) {
			e.imprimeMensagem(valorDebito);
		}
	   
	    
	    System.out.println("\nDepois\n");
	    System.out.println(c2.toString());
	    System.out.println(c3.toString());
	    
	    
	    System.out.println(" Case1: saldo Insuficiente:\n");
	    double valorDesejado2 = 3.0;
	    try {
			c2.transferir(valorDesejado2, c3);
		} catch (SaldoInsuficienteExcecao e) {
			e.imprimeMensagem(valorDesejado2);
		}
	    
	    System.out.println("\n\nTestar Cliente Ja cadastrado e Conta ja cadastrada\n");
	    
	    Cliente cliente2 = new Cliente("Natalia", "1");
	    
	    Fachada fachada = Fachada.getInstance();
	    try{
	    	  fachada.cadastrarCliente(cliente2);
	    }catch(ClienteCadastradoException e){
	    	e.imprimeMensagem();
	    }
	    
	    Cliente clienteIgual = new Cliente("Natalia", "1");
	    try{
	    	  fachada.cadastrarCliente(cliente2);
	    }catch(ClienteCadastradoException e){
	    	e.imprimeMensagem();
	    }	
	    
	    
	    
	    ContaAbstract cc = new Conta("1",12.0,cliente2);
	    try {
			fachada.cadastrarConta(cc);
		} catch (ContaCadastradaException e) {
			e.imprime();
		}
	    
	    ContaAbstract ccIgual = new Conta("1",12.0,clienteIgual);
	    
	    try {
			fachada.cadastrarConta(ccIgual);
		} catch (ContaCadastradaException e) {
			e.imprime();
		}
	    
	}	

}
