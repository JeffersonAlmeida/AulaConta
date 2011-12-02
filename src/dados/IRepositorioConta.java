package dados;

import classesBasicas.ContaAbstract;
import gui.ContaCadastradaException;

public interface IRepositorioConta {
	
	public void inserirConta(ContaAbstract conta)throws ContaCadastradaException;
	public void atualizarConta(ContaAbstract conta);
	public void removerConta(String numero);
	public ContaAbstract procurarConta(String numeroConta);
	public 	void existe(String numeroConta);
	
	
}
