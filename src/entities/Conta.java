package entities;

public class Conta {
	
	private Integer numero;
	private String titular;
	protected Double balanco;
	
	public Conta() {
		
	}
	
	public Conta(Integer numero, String titular, Double balanco) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.balanco = balanco;
	}
	

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getBalanco() {
		return balanco;
	}

	public void setBalanco(Double balanco) {
		this.balanco = balanco;
	}
	
	public void saque(double valor) {
		balanco-=valor;
		
	}
	
	public void deposito(double valor) {
		balanco+=valor-5;
		
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", titular=" + titular + ", balanco=" + balanco + "]";
	}
	



}
