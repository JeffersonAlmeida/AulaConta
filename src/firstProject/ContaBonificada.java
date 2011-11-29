package firstProject;

public class ContaBonificada extends Conta{

	
	public ContaBonificada(String n, Cliente c){
		super(n, c);
	}
	
	
	public void creditar(double valor){
		super.creditar(valor+(valor/100));
	}
		
	public static void main(String[] args) {
		
	}


}
