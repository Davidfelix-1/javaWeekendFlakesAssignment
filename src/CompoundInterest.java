// calculating compound interest

public class CompoundInterest {

  private int principal;
  private int rate;
  private double amount;
  private int year;

  public CompoundInterest(int principal, int rate, double amount, int year) {
    this.principal = principal;
    this.rate = rate;
    this.amount = amount;
    this.year = year;
  }

  public CompoundInterest() {
  }

  public void setPrincipal(int principalAmount) {
    this.principal = principalAmount;
  }

  public int getPrincipal() {
    return principal;
  }

  public void setRate(int interestRate) {
    this.rate = interestRate;
  }

  public int getRate() {
    return rate;
  }

  public void setYear(int numberOfYear) {
    this.year = numberOfYear;
  }

  public int getYear() {
    return year;
  }

  public void setAccumulatedInterest(int newAmount) {
    this.amount= newAmount = principal * (1 + rate) * year * year;
  }

  public double getAccumulatedInterest() {
    return amount;
  }
}

