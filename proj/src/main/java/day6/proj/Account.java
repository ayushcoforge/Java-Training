package day6.proj;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


	@AllArgsConstructor
	@NoArgsConstructor
	@Setter
	@Getter
	@ToString
	public class Account {
	private long accId;
	private String Accountname;
	private int balance;
	private String bankname;
	
	public void withdraw(double amount) {
		if(amount<this.balance)
		{
			this.balance-=amount;
			System.out.println("Withdraw");
		}
		else 
			System.out.println("insuf");
	}
	public void deposit(double amount) {
		this.balance+=amount;
		System.out.println("Deposit");
	}

}
