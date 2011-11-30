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
	 
	
	public void transferir(double valor, Conta c) throws SaldoInsuficienteExcecao{
		if(this.getSaldo()>=valor){
			this.debitar(valor); // debitar da conta origem
			c.setSaldo(c.getSaldo()+valor); // conta destion recebe o valor debitado. saldo anterior + valor
		}else{
			System.out.println(this.getCliente().getNome()+ "  voc� n�o tem saldo suficiente!" );
		}
	}	
	
	public abstract void debitar(double valor) throws SaldoInsuficienteExcecao;
	
	public void transferir(ContaAbstract conta, double valor) throws SaldoInsuficienteExcecao{
		this.debitar(valor);
		conta.creditar(valor);
	}
	
	public void creditar(double valor){
		this.setSaldo(this.getSaldo() + valor);
	}
	

	public void imprimirConta(){
		System.out.println(this.toString());
	}
	
	

}
