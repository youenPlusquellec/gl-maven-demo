package demo;

public class Money {
	
	public float amount;
	public String currency;
	
	public Money(float amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}
	
	@Override
	public String toString() {
		return this.amount + this.currency;
	}

	public Money add(Money that) {
		return new Money(this.amount+that.amount,this.currency);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(amount);
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (Float.floatToIntBits(amount) != Float.floatToIntBits(other.amount))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		return true;
	}
	
}
