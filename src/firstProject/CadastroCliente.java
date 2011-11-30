package firstProject;

public class CadastroCliente {

	private IRepositorioCliente repositorioCliente;
	
	public CadastroCliente(){
		repositorioCliente = new RepositorioClienteArray();
	}
	
	public void cadastrar(Cliente c){
		this.repositorioCliente.inserirCliente(c);
	}
	
	public void remover(Cliente c){
		this.repositorioCliente.removerCliente(c.getCpf());
	}
	

	public void setClienteArray(RepositorioClienteArray clienteArray) {
		this.repositorioCliente = clienteArray;
	}
	
	public Cliente procurar(String cpf){
		return this.repositorioCliente.procurar(cpf);
	}
	
	public void atualizar(Cliente cliente){
		this.repositorioCliente.atualizarCliente(cliente);
	}
	
	public static void main(String[] args) {
		
	}

}
