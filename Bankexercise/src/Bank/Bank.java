package Bank;

public class Bank {
    private String[] costumers = {"Mario", "Henrique", "Sara"};

    public void deposit() {
    }
    public void withdraw(Person person2, int i) {
    }
    public Bank() {
        // this.costumers = new costumers;
    }

    public void deposit(Person person, double value) {
        if (value > 0) {
            person.adjustBalance(value);
            System.out.println("Deposit " + value + " for " + person.getName());
        } else {
            System.out.println("Invalid value of deposit!");
        }
    }

    public void withdraw(Person person, double value) {
        if (value > 0 && person.getBalance() >= value) {
        } else {
            System.out.println("Insufficient balance!!!");
        }
    }
}