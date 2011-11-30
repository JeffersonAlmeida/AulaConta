package firstProject;

import java.util.ArrayList;
import java.util.Iterator;

public class RepositorioContaArray implements IRepositorioConta {

	private ArrayList<ContaAbstract> contas;
	private int indice;
	private static int tamanhoCache = 100;
	
	public RepositorioContaArray(){
		this.contas = new ArrayList<>();
		this.indice = 0;
	}
	
	
	public int procurarIndice(String numero){
		int indiceRetorno = -1;
		boolean cpfEncontrado = false;
		int i = 0;
		while((i<this.contas.size())&&(!cpfEncontrado)){
			ContaAbstract conta = this.contas.get(i);
			if(conta.getNumero().equals(numero)){
				indiceRetorno = i;
				cpfEncontrado = true;
			}
			i++;
		}
		return indiceRetorno;
	}
	
	public boolean exiteConta(String numeroConta){
		 if(procurarIndice(numeroConta)!=-1){
			 return true;
		 }
		 return false;
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
		RepositorioContaArray.tamanhoCache = tamanhoCache;
	}
	
	public void imprimirRepositorioConta(){
		System.out.println("\nTodas as contas :: \n");
		Iterator<ContaAbstract> i  =this.contas.iterator();
		while (i.hasNext()) {
			Conta conta = (Conta) i.next();
			conta.imprimirConta();
		}
	}
	
	public static void main(String[] args) {
		RepositorioContaArray repositorioContaArray = new RepositorioContaArray();
		
	    Conta conta = new Conta();
		Cliente  cliente = new Cliente("JJ","12345678910");
		conta.setCliente(cliente);
		conta.setNumero("xxx");
		
		try {
			repositorioContaArray.inserirConta(conta);
		} catch (ContaCadastradaException e) {
			e.imprime();
		}
		
		int indiceRetorno = repositorioContaArray.procurarIndice("xxx");
		System.out.println("indice retorno = " + indiceRetorno);
		
		conta.setSaldo(2000.0);
		
		repositorioContaArray.atualizarConta(conta);
		
		repositorioContaArray.imprimirRepositorioConta();
		
		repositorioContaArray.removerConta("xxx1");
		
		repositorioContaArray.imprimirRepositorioConta();
		
		System.out.println("Procurar Conta:: \n");
		
		ContaAbstract contaRetorno = repositorioContaArray.procurarConta("xxx");
		if(contaRetorno!=null){
			contaRetorno.imprimirConta();
		}else{
			System.out.println("ERRO: Conta nao existe!");
		}
		
		repositorioContaArray.imprimirRepositorioConta();
	}

	@Override
	public void inserirConta(ContaAbstract conta) throws ContaCadastradaException {
		if(!exiteConta(conta.getNumero())){
			this.contas.add(conta);
			this.indice++;
		}else {
			throw new ContaCadastradaException(conta);
		}		
	}

	@Override
	public void atualizarConta(ContaAbstract conta) {
		ContaAbstract contaRetorno = procurarConta(conta.getNumero());
		 if(contaRetorno!=null){
			 contaRetorno.setCliente(conta.getCliente());
			 contaRetorno.setNumero(conta.getNumero());
			 contaRetorno.setSaldo(conta.getSaldo());
		 }else{
			 System.out.println("ERRO: Conta nao existe!");
		 }
		
	}

	@Override
	public void removerConta(String numero){
		int retorno = this.procurarIndice(numero);
		if(retorno!=-1){
			this.contas.remove(retorno);
		}else{
			System.out.println("ERRO: Conta nao existe!");
		}
	}

	@Override
	public ContaAbstract procurarConta(String numeroConta){
		ContaAbstract conta = null;
		int retorno = procurarIndice(numeroConta);
		if(retorno!=-1){
			conta = this.contas.get(retorno);
		}
		return conta;
	}

}
