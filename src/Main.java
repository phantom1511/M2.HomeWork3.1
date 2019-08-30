public class Main {

    public static void main(String[] args) {
        BankAccount client = new BankAccount();

        try {
            int i = 0;
            System.out.println("Your current balance: " + client.deposit(10000));
            while (true) {
                System.out.println("Draw money: " + client.withDraw(6000));
                i++;
            }
        } catch (LimitException le) {
            System.out.println("You balance = " + le.getRemainingAmount());
            System.out.println(le.getMessage());
        }
        System.out.println(client.getAmount());
    }
}
