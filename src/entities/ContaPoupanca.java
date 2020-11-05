package entities;

public final class ContaPoupanca extends Conta{

private Double TaxaJuros;
public ContaPoupanca() {
	super();
}
public ContaPoupanca(Integer numero, String titular, Double balanco, Double taxaJuros) {
	super(numero, titular, balanco);
	TaxaJuros = taxaJuros;
}
public Double getTaxaJuros() {
	return TaxaJuros;
}
public void setTaxaJuros(Double taxaJuros) {
	TaxaJuros = taxaJuros;
}

public void atualizarSaldo() {
	balanco+=balanco *TaxaJuros;
}

@Override
public void saque(double valor) {
	balanco-=valor;
	
}

}
