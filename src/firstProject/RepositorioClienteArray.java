package firstProject;

import java.util.ArrayList;
import java.util.Iterator;

public class RepositorioClienteArray {

	
	private ArrayList<Cliente> clientes;
	private int indice;
	private static int tamanhoCache = 100;
	
	public RepositorioClienteArray(){
		indice = 0;
		clientes = new ArrayList<>();
	}
	
	public void inserir(Cliente cliente){
		this.clientes.add(cliente);
		this.indice++;
	}
	
	public int procurarIndice(String cpf){
		int indiceRetorno = -1;
		boolean cpfEncontrado = false;
		int i = 0;
		while ((i<this.clientes.size())&&(!cpfEncontrado)){
			Cliente cliente = this.clientes.get(i);
			if(cliente.getCpf().equals(cpf)){
				indiceRetorno = i;
				cpfEncontrado = true;
			}
			i++;
		}
		return indiceRetorno;
	}
	
	public boolean existeCliente(String cpf){
		 if(procurarIndice(cpf)!=-1){
			 return true;
		 }
		 return false;
	}
	
	public Cliente procurar(String cpf){
		int retorno = procurarIndice(cpf);
		Cliente cliente = null;
		if(retorno!=-1){
			cliente = this.clientes.get(retorno);
		}else{
			System.out.println("ERRO: Cliente nao existe!");
		}
		return cliente;		
	}
	
	
	public void atualizar(Cliente cliente){
		Cliente clienteRetorno = procurar(cliente.getCpf());
		if(clienteRetorno!=null){
			clienteRetorno.setNome(cliente.getNome());
			clienteRetorno.setCpf(cliente.getCpf());
		}else{
			System.out.println("ERRO: Cliente nao existe!");
		}
	}
	
	public void remover(String cpf){
		int retorno = this.procurarIndice(cpf);
		if(retorno!=-1){
			this.clientes.remove(retorno);
		}else{
			System.out.println("ERRO: Cliente nao existe!");
		}
	}
	
	@Override
	public String toString() {
		return "RepositorioClienteArray [clientes=" + clientes + ", indice="
				+ indice + "]";
	}



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		RepositorioClienteArray repositorioClienteArray = new RepositorioClienteArray();
	    Cliente  cliente = new Cliente("JJ","12345678910");
	    System.out.println(cliente.toString());
	    
	    repositorioClienteArray.inserir(cliente);
	    
	    int indice = repositorioClienteArray.procurarIndice("12345678910");
	    System.out.println("Indice = " + indice);
	    
	    Cliente clienteRetorno = repositorioClienteArray.procurar("12345678910");
	    if(clienteRetorno!=null){
	    	clienteRetorno.imprimeCliente();
	    }
	    
	    System.out.println("Atualizar Cliente :: ");
	    Cliente clienteNovo = new Cliente("Jefferson", "12345678910");
	    repositorioClienteArray.atualizar(clienteNovo);
	    
	    repositorioClienteArray.imprimeRepositorioCliente();
	    
	    
	    repositorioClienteArray.remover("12345678910");
	    
	    repositorioClienteArray.imprimeRepositorioCliente();
	    
	}

	public void imprimeRepositorioCliente(){
		System.out.println("\n\nTodos os clientes no repositorio :: \n");
		Iterator<Cliente> iterator = this.clientes.iterator();
		while (iterator.hasNext()) {
			Cliente cliente = (Cliente) iterator.next();
			cliente.imprimeCliente();
		}
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}



	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}



	public int getIndice() {
		return indice;
	}



	public void setIndice(int indice) {
		this.indice = indice;
	}



	public static int getTamanhoCache() {
		return tamanhoCache;
	}



	public static void setTamanhoCache(int tamanhoCache) {
		RepositorioClienteArray.tamanhoCache = tamanhoCache;
	}

}
