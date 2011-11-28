package firstProject;

public class CadastroConta {

	private RepositorioContaArray repositorioContaArray;
	
	public void cadastrar(Conta c){
		repositorioContaArray.inserir(c);
	}
	
	public void remover(Conta c){
		repositorioContaArray.remover(c.getNumero());
	}
	
	public Conta procurar(String numeroConta){
		return repositorioContaArray.procurarConta(numeroConta);
	}
	public void atualizar(Conta conta){
		repositorioContaArray.atualizar(conta);
	}
	
	
	public CadastroConta() {
		super();
		repositorioContaArray = new RepositorioContaArray();
	}


	public static void main(String[] args) {
		

	}



	public RepositorioContaArray getRepositorioContaArray() {
		return repositorioContaArray;
	}

	public void setRepositorioContaArray(RepositorioContaArray repositorioContaArray) {
		this.repositorioContaArray = repositorioContaArray;
	}

}
