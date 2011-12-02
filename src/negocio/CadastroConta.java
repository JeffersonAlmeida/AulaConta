package negocio;

import classesBasicas.ContaAbstract;
import dados.IRepositorioConta;
import dados.RepositorioContaArray;
import gui.ContaCadastradaException;

public class CadastroConta {

	private IRepositorioConta repositorioContaArray;
	
	public void cadastrar(ContaAbstract c) throws ContaCadastradaException{
		if(!exiteConta(c.getNumero())){
			repositorioContaArray.inserirConta(c);
		}else {
			throw new ContaCadastradaException(c);
		}	
	}
	
	private boolean exiteConta(String numero) {
		return false;
	}

	public void remover(ContaAbstract c){
		repositorioContaArray.removerConta(c.getNumero());
	}
	
	public ContaAbstract procurar(String numeroConta){
		return repositorioContaArray.procurarConta(numeroConta);
	}
	public void atualizar(ContaAbstract conta){
		repositorioContaArray.atualizarConta(conta);
	}
	
	
	public CadastroConta() {
		super();
		repositorioContaArray = new RepositorioContaArray();
	}


	public static void main(String[] args) {
		

	}

	public void setRepositorioContaArray(RepositorioContaArray repositorioContaArray) {
		this.repositorioContaArray = repositorioContaArray;
	}

}
