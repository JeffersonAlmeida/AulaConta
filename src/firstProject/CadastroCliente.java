package firstProject;

public class CadastroCliente {

	private RepositorioClienteArray repositorioClienteArray;
	
	public CadastroCliente(){
		repositorioClienteArray = new RepositorioClienteArray();
	}
	
	public void cadastrar(Cliente c){
		this.repositorioClienteArray.inserir(c);
	}
	
	public static void main(String[] args) {
		
	}

	public RepositorioClienteArray getClienteArray() {
		return repositorioClienteArray;
	}

	public void setClienteArray(RepositorioClienteArray clienteArray) {
		this.repositorioClienteArray = clienteArray;
	}

}
