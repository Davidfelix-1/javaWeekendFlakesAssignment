package MrChiClassTwo;
 class Account {

    private String name;
    private int balance;

    private  String pin ;
    private  int number;



    public Account(String name, int balance, String pin, int number){
        this.name=name;
        this.balance=balance;
        this.pin=pin;
        this.number=number;
    }

     public Account() {

     }

     public void setName(String fisrtName, String lastName) {
         this.name =fisrtName;
         this.name = lastName;
     }

     public void setBalance(int balance) {
         this.balance = balance;
     }

     public void setPin(int pin){
        this.pin= String.valueOf(pin);

     }
     public int getBalance() {
         return balance;
     }

     public void deposit(int amount){
        this.balance=balance+amount;
     }

     public void withdraw(int newValue){
        this.balance=balance-newValue;
     }

     public Object getName() {
        return name;
     }
 }
