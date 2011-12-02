package classesBasicas;


public class ContaImposto extends ContaAbstract {

	public static final double TAXA = 0.001;
	
	public ContaImposto(String n, Cliente c){
		super(n, c);
	}
	

	@Override
	public void debitar(double valor) {
		double imposto = valor* TAXA;
		double saldo = this.getSaldo();
		if(valor+imposto<=saldo){
			setSaldo(saldo-(valor+imposto));
		}else{
			System.out.println("Saldo Insuficiente!");
		}		
	}

	public static void main(String[] args) {
		

	}
}
