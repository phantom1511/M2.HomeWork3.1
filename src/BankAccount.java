public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }

    public double deposit(double sum) {
        amount = amount + sum;
        return sum;
    }

    public double withDraw(double sum) throws LimitException {
        if (amount < sum) {
            amount = 0;
            throw new LimitException("You have no money left", amount);
        }
        amount = amount - sum;
        return amount;
    }
}
