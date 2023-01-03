package Entities;

public class ClientePJ extends Cliente {

	private Integer cnpj;

	public ClientePJ() {
	}

	public ClientePJ(String name, String address, String email, Integer accountNumber, Double balance, Integer cnpj) {
		super(name, address, email, accountNumber, balance);
		this.cnpj = cnpj;
	}

	public Integer getCnpj() {
		return cnpj;
	}
	
	@Override
	public Double withdraw(Double amount) {
		  amount += amount * 0.005;
		  return super.withdraw(amount);
		}

}
