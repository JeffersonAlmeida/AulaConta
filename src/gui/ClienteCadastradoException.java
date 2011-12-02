package gui;

import classesBasicas.Cliente;

public class ClienteCadastradoException extends Exception {
	   
	   private Cliente cliente;
	   
	   public Cliente getCliente() {
		return cliente;
	   }
		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
	   public ClienteCadastradoException(){
		   super("Cliente ja Cadastrado !");
	   }
	   public ClienteCadastradoException(Cliente cliente){
		   super("Cliente ja Cadastrado !");
		   this.cliente = cliente;
	   }
	   
	   public void imprimeMensagem(){
		   System.out.println("Cliente ja Cadastrado! Nome: " + getCliente().getNome() + " CPF: " + getCliente().getCpf());
	   }
}
