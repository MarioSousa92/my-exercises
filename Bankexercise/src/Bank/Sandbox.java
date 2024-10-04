package Bank;

public class Sandbox {

public static void main (String[] args) {
    Bank bank = new Bank();
    
    Person person1 = new Person("Mario", 32);
    Person person2 = new Person("Henrique", 29);
    Person person3 = new Person("Sara", 28);

    bank.deposit(person1, 500);
    person1.showData();

    bank.deposit(person2, 300);
    person2.showData();

    bank.deposit(person3, 500);
    person3.showData();

    bank.withdraw(person1, 200);
    person2.showData();

    bank.withdraw(person2, 400);
    person2.showData();

    bank.withdraw(person3, 150);
    person3.showData();

}
}
