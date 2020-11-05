package application;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta c = new Conta(2564,"Jane",5000.00);
		
		ContaEmpresarial ce = new ContaEmpresarial(1597,"Larissa",6000.00,10000.00);
		
		//UPCASTING
		
		Conta c1 = ce;
		c1.getBalanco();
		System.out.println("Conta: "+c1.toString());
		
		Conta c2 = new ContaPoupanca(563,"alana",6000.00,10.0);
		
		System.out.println(c2);
		
		//DOWNCASTING
		
		
		
		if(c1 instanceof ContaEmpresarial) {
			//teste para verificar se o tipo de classe que se está fazendo downcast é do tipo que está sendo instanciada
			ContaEmpresarial c5 = (ContaEmpresarial) c1;
			
			c5.emprestimo(5000);
			System.out.println(c5.toString());
		}
		
		if(c2 instanceof ContaPoupanca) {
			//teste para verificar se o tipo de classe que se está fazendo downcast é do tipo que está sendo instanciada
			ContaPoupanca c5 = (ContaPoupanca) c2;
			
			c5.atualizarSaldo();
			System.out.println(c5.toString());
		}
		//usando sobreposição para não cobrar a taxa do tipo de conta normal
		Conta cp = new ContaPoupanca(123,"dany",4000.0,10.0);
		cp.saque(235);
		System.out.println("Valor da conta com override "+cp.getBalanco());
		//usando a sobreposição e a palavra super para cobrar uma taxa diferente da conta normal
     
		Conta ce0= new ContaEmpresarial(1234,"Kelly",10000.00,5000.0);
		ce0.saque(100);
		System.out.println(ce0.getBalanco());
		
		
	}

}
