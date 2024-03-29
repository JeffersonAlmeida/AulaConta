package fachada;

import classesBasicas.Cliente;
import classesBasicas.Conta;
import classesBasicas.ContaAbstract;
import gui.ClienteCadastradoException;
import gui.ContaCadastradaException;
import negocio.CadastroCliente;
import negocio.CadastroConta;

public class Fachada {

	 private static final Fachada instance = new Fachada();  // early initialization
	 private CadastroCliente cadastroCliente;
	 private CadastroConta cadastroConta;
	 
	 private Fachada(){
		 super();
		 this.setCadastroCliente(new CadastroCliente());
		 this.setCadastroConta(new CadastroConta());
	 }
	
	 public static Fachada getInstance(){
		 return instance;
	 }

	public CadastroCliente getCadastroCliente() {
		return cadastroCliente;
	}

	public void setCadastroCliente(CadastroCliente cadastroCliente) {
		this.cadastroCliente = cadastroCliente;
	}

	public CadastroConta getCadastroConta() {
		return cadastroConta;
	}

	public void setCadastroConta(CadastroConta cadastroConta) {
		this.cadastroConta = cadastroConta;
	}
	
	// Cliente
	
	public void cadastrarCliente(Cliente c) throws ClienteCadastradoException{
		this.cadastroCliente.cadastrar(c);
	}
	public void removerCliente(Cliente c){
		this.cadastroCliente.remover(c);
	}
	
	public Cliente procurarCliente(String cpf){
		return this.cadastroCliente.procurar(cpf);
	}
	public void atualizar(Cliente cliente){
		this.cadastroCliente.atualizar(cliente);
	}
	
	//// Conta
		
	public void cadastrarConta(ContaAbstract c)throws ContaCadastradaException{
		this.cadastroConta.cadastrar(c);
	}
	public void removerConta(ContaAbstract c){
		this.cadastroConta.remover(c);
	}
	
	public ContaAbstract procurarconta(String numeroConta){
		return this.cadastroConta.procurar(numeroConta);
	}
	
	public void atualizarConta(ContaAbstract conta){
		this.cadastroConta.atualizar(conta);
	}
	
	public void imprimirCliente(){
		
	}
	
	// Main
	
	public static void main(String[] args) throws ContaCadastradaException {
		
		 Fachada fachada = Fachada.getInstance();
		 Cliente c = new Cliente("Jefferson", "xxx");
		 try {
			fachada.cadastrarCliente(c);
		} catch (ClienteCadastradoException e) {
		    e.imprimeMensagem();
		}
		 
		 Cliente cliente = fachada.procurarCliente(c.getCpf());
		 if(cliente!=null){
			 cliente.imprimeCliente();
		 }
		 
		 Conta conta = new Conta();
		 conta.setNumero("xxx");
		 conta.setSaldo(10);
		 conta.setCliente(new Cliente("Jefferson", "123"));
		 
		 fachada.cadastrarConta(conta);
		 
		 ContaAbstract contaRetorno = fachada.procurarconta("xxx");
		 if(contaRetorno!=null){
			 contaRetorno.imprimirConta();
		 }else{
			 System.out.println("Erro: Conta n�o existente!");
		 }
	}

}
