package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		List<Account> list=new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Ana", 500.0, 500.0));
		
		double sum=0.0;
		
		for (Account conta:list) {
			sum+=conta.getBalance();
		}
		
		System.out.printf("Total balance: %.2f%n%n",sum);
		 
		for (Account conta:list) {
			conta.deposit(10.0);;
		}
		
	}

}
