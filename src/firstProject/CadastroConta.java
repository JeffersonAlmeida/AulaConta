package firstProject;

public class CadastroConta {

	private IRepositorioConta repositorioContaArray;
	
	public void cadastrar(Conta c){
		repositorioContaArray.inserirConta(c);
	}
	
	public void remover(Conta c){
		repositorioContaArray.removerConta(c.getNumero());
	}
	
	public Conta procurar(String numeroConta){
		return repositorioContaArray.procurarConta(numeroConta);
	}
	public void atualizar(Conta conta){
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
