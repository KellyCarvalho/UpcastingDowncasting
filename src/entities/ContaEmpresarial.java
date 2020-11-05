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

@Override
public final void saque(double valor) {
	//o final ser� usado neste caso para que uma poss�vel classe herdeira n�o sorbeponha o m�todo j� sobreposto, podendo gerar inconsist�ncia
	super.saque(valor);
	balanco-=2.6;
	
}


}
