package firstProject;

public interface IRepositorioCliente {
	
	public void inserirCliente(Cliente c) throws ClienteCadastradoException;
	public void atualizarCliente(Cliente c);
	public void removerCliente(String cpf);
	public Cliente procurar(String cpf);
	
	
}
