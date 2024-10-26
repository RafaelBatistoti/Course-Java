package entities;

//  Incluir a palavra "final" na declara��o da class
//	N�o � poss�vel criar extenss�es dessa class
// 	O mesmo ocorre para methodos 
//	Caso voc� n�o queira que ele seja sobreposto em outras classes

public final class SavingsAccount extends Account {

	private Double interestRate;

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public void updatedBalance() {
		balance += balance * interestRate;
	}

//	Sobreposi��o de methodo
	@Override
	public void withDraw(double amount) {
		balance -= amount;
	}
}
