package firstProject;

public abstract class ContaAbstract {


	private double saldo;
	private Cliente cliente;	
	protected String numero;
	
	public ContaAbstract(){
		super();
	}
	
	public ContaAbstract(String n, double s, Cliente c){
		this.numero = n;
		this.setSaldo(s);
		this.setCliente(c);
	}
	
	public ContaAbstract(String num, Cliente cliente){
		this.numero = num;
		this.cliente = cliente;
	}
	  
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	 
	public void creditar(double valor){
		this.saldo +=valor;
	}
	
	public abstract void debitar(double valor);
	
	public void transferir(ContaAbstract conta, double valor){
		this.debitar(valor);
		conta.creditar(valor);
	}
	
	
	

}
