package firstProject;

public interface IRepositorioConta {
	
	public void inserirConta(ContaAbstract conta);
	public void atualizarConta(ContaAbstract conta);
	public void removerConta(String numero);
	public ContaAbstract procurarConta(String numeroConta);
	
	
}
