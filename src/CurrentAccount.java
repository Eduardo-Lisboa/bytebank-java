public class CurrentAccount extends Account implements Taxable {

    public CurrentAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void deposit(double value) {
        super.balance += value;
    }


    @Override
    public void withdraw(double value) {
        double valueWithTax = value + 0.2;
        super.withdraw(valueWithTax);
    }

    @Override
    public double getTaxValue() {
        return super.balance * 0.01;
    }
}
