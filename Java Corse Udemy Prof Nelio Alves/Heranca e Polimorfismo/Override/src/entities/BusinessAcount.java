package entities;

public class BusinessAcount extends Account {

	private Double loanLimit;

	public BusinessAcount() {
		super();
	}

	public BusinessAcount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		if (amount <= loanLimit) {
//			Exemplo hipotético caso haja uma taxa de 10.0
//			Ocorre um erro no balance porque esse atributo não é visível
//			Para que não acorra erro no balance, na minha class Acount eu preciso mudar
//			private to protected
			balance += amount - 10.0;
		}
	}
	
	@Override
	public void withDraw(double amount) {
		super.withDraw(amount);
		balance -= 2.0;
	}
}
