package firstProject;

public class CadastroCliente {

	private RepositorioClienteArray repositorioClienteArray;
	
	public CadastroCliente(){
		repositorioClienteArray = new RepositorioClienteArray();
	}
	
	public void cadastrar(Cliente c){
		this.repositorioClienteArray.inserir(c);
	}
	
	public void remover(Cliente c){
		this.repositorioClienteArray.remover(c.getCpf());
	}
	
	
	public RepositorioClienteArray getClienteArray() {
		return repositorioClienteArray;
	}

	public void setClienteArray(RepositorioClienteArray clienteArray) {
		this.repositorioClienteArray = clienteArray;
	}
	
	public Cliente procurar(String cpf){
		return this.repositorioClienteArray.procurar(cpf);
	}
	
	public void atualizar(Cliente cliente){
		this.repositorioClienteArray.atualizar(cliente);
	}
	
	public static void main(String[] args) {
		
	}

}
