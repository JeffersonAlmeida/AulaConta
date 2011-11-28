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
	
	// Cliente
	
	public void cadastrarCliente(Cliente c){
		this.cadastroCliente.cadastrar(c);
	}
	public void removerCliente(Cliente c){
		this.cadastroCliente.remover(c);
	}
	
	public Cliente procurarCliente(String cpf){
		return this.cadastroCliente.procurar(cpf);
	}
	public void atualizar(Cliente cliente){
		this.cadastroCliente.atualizar(cliente);
	}
	
	//// Conta
		
	public void cadastrarConta(Conta c){
		this.cadastroConta.cadastrar(c);
	}
	public void removerConta(Conta c){
		this.cadastroConta.remover(c);
	}
	
	public Conta procurarconta(String numeroConta){
		return this.cadastroConta.procurar(numeroConta);
	}
	
	public void atualizarConta(Conta conta){
		this.cadastroConta.atualizar(conta);
	}
	
	public void imprimirCliente(){
		
	}
	
	// Main
	
	public static void main(String[] args) {
		
		 Fachada fachada = Fachada.getInstance();
		 Cliente c = new Cliente("Jefferson", "xxx");
		 fachada.cadastrarCliente(c);
		 
		 Cliente cliente = fachada.procurarCliente(c.getCpf());
		 if(cliente!=null){
			 cliente.imprimeCliente();
		 }
		 
		 Conta conta = new Conta();
		 conta.setNumero("xxx");
		 conta.setSaldo(10);
		 conta.setCliente(new Cliente("Jefferson", "123"));
		 
		 fachada.cadastrarConta(conta);
		 
		 Conta contaRetorno = fachada.procurarconta("xxx");
		 if(contaRetorno!=null){
			 contaRetorno.imprimirConta();
		 }else{
			 System.out.println("Erro: Conta não existente!");
		 }
		 
		 
		 
	}

}
