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
	
	
	

	
	public void debitar(double valor)throws SaldoInsuficienteExcecao{
		if(this.getSaldo()>=valor){
			this.setSaldo(this.getSaldo() - valor);
		}else{
			throw new SaldoInsuficienteExcecao(this.getSaldo(), this.getNumero());
		}		
	}


	@Override
	public String toString() {
		return "Conta [numero=" + getNumero() + ", saldo=" + getSaldo() + ", cliente="
				+ getCliente() + "]";
	}
	
	
	public void transferir(double valor, Conta c) throws SaldoInsuficienteExcecao{
		if(this.getSaldo()>=valor){
			this.debitar(valor); // debitar da conta origem
			c.setSaldo(c.getSaldo()+valor); // conta destion recebe o valor debitado. saldo anterior + valor
		}else{
			throw new SaldoInsuficienteExcecao(getSaldo(), getNumero());
		}
	}	
	
	

}
