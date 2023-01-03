package Entities;

public class ClientePF extends Cliente{

	private Integer cpf;
	
	public ClientePF() {}

	public ClientePF(String name, String address, String email, Integer accountNumber, Double balance, Integer cpf) {
		super(name, address, email, accountNumber, balance);
		this.cpf = cpf;
	}

	public Integer getCpf() {
		return cpf;
	}
}
