package firstProject;

public interface IRepositorioConta {
	
	public void inserirConta(Conta conta);
	public void atualizarConta(Conta conta);
	public void removerConta(String numero);
	public Conta procurarConta(String numeroConta);
	
	
}
