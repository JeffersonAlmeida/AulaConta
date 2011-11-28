package firstProject;

public class Conta {
	
	private long numero;
	private double saldo;
	private Cliente cliente;
	
	
	public Conta(){
		super();
	}
	

	public Conta(long n, double s, Cliente c){
		this.numero = n;
		this.saldo = s;
		this.cliente = c;
	}
	
	public Conta(long n, Cliente c){
		this.numero = n;
		this.cliente = c;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
	    Conta conta = new Conta();
	    Cliente  cliente = new Cliente("JJ","12345678910");
	    conta.setCliente(cliente);
	    conta.setNumero(1);
	    conta.setSaldo(10.0);
	    conta.creditar(10.0);
	    System.out.println(conta.toString());
	    conta.debitar(20.0);
	    
	    
	    System.out.println("Tarefa Parte II ");
	    
	    Conta c2 = new Conta(2,5.0,new Cliente("PEDRO", "12345678091"));
	    Conta c3 = new Conta(3,10.0,new Cliente("Maria", "12342378091"));
	    
	    System.out.println("\nAntes\n");
	    System.out.println(c2.toString());
	    System.out.println(c3.toString());
	    
	    c2.transferir(3.0, c3); // transferencia
	    
	    System.out.println("\nDepois\n");
	    System.out.println(c2.toString());
	    System.out.println(c3.toString());
	    
	    
	    System.out.println(" Case1: saldo Insuficiente:\n");
	    c2.transferir(3.0, c3); // transferencia
	    
	    
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
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
		this.saldo += valor;
	}
	
	public void debitar(double valor){
		if(this.getSaldo()>=valor){
			this.saldo -= valor;
		}else{
			System.out.println(this.getCliente().getNome()+ "  você não tem saldo suficiente!" );
		}		
	}


	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", saldo=" + saldo + ", cliente="
				+ cliente + "]";
	}
	
	
	public void transferir(double valor, Conta c){
		if(this.getSaldo()>=valor){
			this.debitar(valor); // debitar da conta origem
			c.setSaldo(c.getSaldo()+valor); // conta destion recebe o valor debitado. saldo anterior + valor
		}else{
			System.out.println(this.getCliente().getNome()+ "  você não tem saldo suficiente!" );
		}
	}	

}
