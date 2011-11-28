package firstProject;

public class Fachada {

	 private static final Fachada instance = new Fachada();  // early initialization
	 private CadastroCliente cadastroCliente;
	 private CadastroConta cadastroConta;
	 
	 private Fachada(){
		 super();
		 this.setCadastroCliente(new CadastroCliente());
		 this.setCadastroConta(new CadastroConta());
	 }
	
	 public static Fachada getInstance(){
		 return instance;
	 }

	public CadastroCliente getCadastroCliente() {
		return cadastroCliente;
	}

	public void setCadastroCliente(CadastroCliente cadastroCliente) {
		this.cadastroCliente = cadastroCliente;
	}

	public CadastroConta getCadastroConta() {
		return cadastroConta;
	}

	public void setCadastroConta(CadastroConta cadastroConta) {
		this.cadastroConta = cadastroConta;
	}
	
	public void cadastrarCliente(Cliente c){
		this.cadastroCliente.cadastrar(c);
	}
	public void removerCliente(Cliente c){
		this.cadastroCliente.cadastrar(c);
	}
	public void cadastrarConta(Conta c){
		this.cadastroConta.cadastrar(c);
	}
	public void removerConta(Conta c){
		
	}
	
	public static void main(String[] args) {
		

	}

}
