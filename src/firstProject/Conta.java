package firstProject;

public class Conta extends ContaAbstract{
		
	public Conta(){
		super();
	}	

	public Conta(String n, Cliente c){
		super(n, c);
	}
	
	public Conta(String n, double s, Cliente c){
		super(n, s, c);
	}
	
	public static void main(String[] args) {
	
	    Conta conta = new Conta();
	    Cliente  cliente = new Cliente("JJ","12345678910");
	    conta.setCliente(cliente);
	    conta.setNumero("1");
	    conta.setSaldo(10.0);
	    conta.creditar(10.0);
	    System.out.println(conta.toString());
	    conta.debitar(20.0);
	    
	    
	    System.out.println("Tarefa Parte II ");
	    
	    Conta c2 = new Conta("2",5.0,new Cliente("PEDRO", "12345678091"));
	    Conta c3 = new Conta("3",10.0,new Cliente("Maria", "12342378091"));
	    
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
	
	public void creditar(double valor){
		this.setSaldo(this.getSaldo() + valor);
	}
	
	public void debitar(double valor){
		if(this.getSaldo()>=valor){
			this.setSaldo(this.getSaldo() - valor);
		}else{
			System.out.println(this.getCliente().getNome()+ "  você não tem saldo suficiente!" );
		}		
	}


	@Override
	public String toString() {
		return "Conta [numero=" + getNumero() + ", saldo=" + getSaldo() + ", cliente="
				+ getCliente() + "]";
	}
	
	
	public void transferir(double valor, Conta c){
		if(this.getSaldo()>=valor){
			this.debitar(valor); // debitar da conta origem
			c.setSaldo(c.getSaldo()+valor); // conta destion recebe o valor debitado. saldo anterior + valor
		}else{
			System.out.println(this.getCliente().getNome()+ "  você não tem saldo suficiente!" );
		}
	}	
	
	public void imprimirConta(){
		System.out.println(this.toString());
	}
	
	

}
