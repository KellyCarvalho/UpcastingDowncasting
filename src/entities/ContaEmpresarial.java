package entities;

public class ContaEmpresarial extends Conta {
	private Double LimiteEmprestimo;
	public ContaEmpresarial() {
		super();
		
	}
	
	public ContaEmpresarial(Integer numero, String titular, Double balanco, Double limiteEmprestimo) {
		super(numero, titular, balanco);
		LimiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return LimiteEmprestimo;
	}
	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		LimiteEmprestimo = limiteEmprestimo;
	}
public void emprestimo(double valor) {
	if(valor<=LimiteEmprestimo) {
		deposito(valor);
 	}
}

@Override
public String toString() {
	return "ContaEmpresarial [Limite de Emprestimo=" + LimiteEmprestimo + ", balanco=" + balanco + ", Conta="
			+ getNumero() + ", Titular()=" + getTitular() + ", Saldo=" + getBalanco();
}



}
