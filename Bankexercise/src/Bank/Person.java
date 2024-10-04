package Bank;

public class Person {
    
   private String name;
    private int age;
    private double balance;

    public Person (String name, int age) {
        this.name = name;
        this.age = age;
        this.balance = 0;
    }

        //metodos get para aceder aos atributos
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public double getBalance(){
            return balance;
        }

    // imprimir dados da pessoa
    public void showData(){
         System.out.println("Nome: " + name + ", Age: " + age + ", Balance: " + balance);
     }

     // metodo para ajustar saldo
     public void adjustBalance(double value){
        this.balance += value;
     }
}