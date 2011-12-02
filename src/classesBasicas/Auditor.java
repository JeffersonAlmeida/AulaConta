package classesBasicas;



public class Auditor {

	final static double MINIMO = 500.00;
	private String nome;
	
	public boolean investigaBanco(QualquerBanco b){
		double sm;
		sm = b.saldoTotal()/b.numContas();
		return (sm>MINIMO);
		
	}
	
		
	public static void main(String[] args) {
		
		QualquerBanco bi = new BancoInvest();
		QualquerBanco bs = new BancoSeguro();
		
		Auditor a = new Auditor();
		
		boolean res1 = a.investigaBanco(bi);
		boolean res2 = a.investigaBanco(bs);
		
		System.out.println("res1 = " + res1 + "\nres2 = " + res2);
		
	}	

}
