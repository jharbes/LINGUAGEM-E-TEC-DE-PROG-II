import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;
import entities.SavingsAccountPlus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account c1 = new Account(1001, "Alex", 0.0);
		BusinessAccount bc1 = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING, fazer um objeto de uma superclasse receber o objeto de uma
		// subclasse conforme abaixo:

		Account c2 = bc1;

		System.out.println(c2.getBalance());
		System.out.println(c2);

		Account c3 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account c4 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

		// DOWNCASTING, fazer um objeto de uma subclasse receber um objeto de uma
		// superclasse (inverso de upcasting):

		BusinessAccount c5 = (BusinessAccount) c3;
		c5.loan(100.0);

		// Operação abaixo não é permitida, embora o compilador não gere erro, pois c4 é
		// uma SavingsAccount e nao pode ser convertida para BusinessAccount pois
		// SavingsAccount NÃO é uma BusinessAccount

		// BusinessAccount c6=(BusinessAccount)c4; ****

		// Precisamos primeiramente testar se o objeto faz parte da classe
		// BusinessAccount, para isso utilizaremos o instanceof conforme segue abaixo:

		if (c4 instanceof BusinessAccount) {
			BusinessAccount c6 = (BusinessAccount) c4;
			c6.loan(200.0);
		} else if (c4 instanceof SavingsAccount) {
			SavingsAccount c6 = (SavingsAccount) c4;
			c6.updateBalance();
		}

		c1.deposit(1000.00);
		c1.withdraw(500.0);

		c4.deposit(5000.0);
		c4.withdraw(500.0);

		c3.deposit(500.0);
		c3.withdraw(100.00);
		
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		
		SavingsAccountPlus w=new SavingsAccountPlus(1005, "Jorge Harbes", 450000.0, 0.05, 0.06);
		System.out.println(w.toString());
	}

}
