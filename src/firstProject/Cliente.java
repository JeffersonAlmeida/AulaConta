package firstProject;

public class Cliente {
	
	private String nome;
	private String cpf;

	public Cliente(){
		super();
	}
	
	public Cliente(String n, String cpf) {
		this.nome = n;
		this.cpf = cpf;		
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		  Cliente  cliente = new Cliente("JJ","12345678910");
		  System.out.println(cliente.toString());

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void imprimeCliente(){
		System.out.println(toString());
	}

}
