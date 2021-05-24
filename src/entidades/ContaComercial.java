package entidades;

public class ContaComercial extends Conta {
	
	private Double limiteDeEmprestimo;
	
	public ContaComercial() {
		super();
	}

	public ContaComercial(Integer numero, String titular, Double saldo, Double limiteDeEmprestimo) {
		super(numero, titular, saldo);
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}

	public Double getLimiteDeEmprestimo() {
		return limiteDeEmprestimo;
	}

	public void setLimiteDeEmprestimo(Double limiteDeEmprestimo) {
		this.limiteDeEmprestimo = limiteDeEmprestimo;
	}
	
	public void emprestimo(Double valor) {
		if (valor <= limiteDeEmprestimo) {
			saldo += saldo - 10.00;
		}
	}

}
