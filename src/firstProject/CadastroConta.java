package firstProject;

public class CadastroConta {

	private RepositorioContaArray repositorioContaArray;
	
	public void cadastrar(Conta c){
		repositorioContaArray.inserir(c);
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
