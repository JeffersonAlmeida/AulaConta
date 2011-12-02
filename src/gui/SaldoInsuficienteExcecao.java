package gui;

public class SaldoInsuficienteExcecao extends Exception{

	private double saldo;
	private String numeroConta;
	
	public SaldoInsuficienteExcecao(){
		super("Saldo Insuficiente!");
	}
	
	public SaldoInsuficienteExcecao(double saldo, String numeroConta){
		super("Saldo Insuficiente!");
		this.saldo = saldo;
		this.numeroConta = numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public void imprimeMensagem(double valorDesejado){
		System.out.println("Saldo Insuficiente! Saldo Disponivel = " + getSaldo() + " valor desejado: "+ valorDesejado);
	}

}
