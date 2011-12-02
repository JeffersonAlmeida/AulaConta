package gui;

import classesBasicas.Conta;
import classesBasicas.ContaAbstract;

public class ContaCadastradaException extends Exception {
	
	private ContaAbstract conta;
	
	public ContaCadastradaException(){
		super("Conta ja cadastrada!");
	}
	
	public ContaCadastradaException(ContaAbstract conta){
		super("Conta ja cadastrada!");
		this.setConta(conta);
	}

	public ContaAbstract getConta() {
		return conta;
	}

	public void setConta(ContaAbstract conta) {
		this.conta = conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public void imprime(){
		System.out.println("Conta ja cadastrada ! Numero = " + getConta().getNumero() + " proprietario: " +  conta.getCliente().getNome());
	}
}
