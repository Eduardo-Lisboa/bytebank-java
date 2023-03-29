package br.com.bytebank.bank.model;

/**
 * Classe representa a moldura de uma conta
 *
 * @author Eduardo Lisboa
 */

public abstract class Account {
    // Attributes
    protected double balance; //encapsulamento - private - so pode ser acessado dentro da classe
    private int agency;
    private int number;
    private Client owner;

    // estatico - pertence a classe e nao ao objeto
    static private int totalAccounts;

    /**
     * Constructor para inicializar o objeto da conta
     *
     * @param agency
     * @param number
     */

    // Constructor
    public Account(int agency, int number) {
        Account.totalAccounts++;
        this.setAgency(agency);
        this.setNumber(number);
    }


    //getters and setters
    public double getBalance() {
        return this.balance;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        if (number <= 0) {
            System.out.println("Cannot set a negative number");
            return;
        }
        this.number = number;
    }

    public int getAgency() {
        return this.agency;
    }

    public void setAgency(int agency) {
        if (agency <= 0) {
            System.out.println("Cannot set a negative number");
            return;
        }
        this.agency = agency;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public static int getTotal() {
        return Account.totalAccounts;
    }

    // Methods
    public abstract void deposit(double value);

    /**
     * Valor precisa ser maior do que o saldo
     *
     * @param value
     * @throws InsufficientBalanceException
     */
    public void withdraw(double value) {
        if (this.balance < value) {
            throw new InsufficientBalanceException("Balance: " + this.balance + " Value: " + value);
        }
        this.balance -= value;

    }

    public void transfer(double value, Account accountDestiny) throws InsufficientBalanceException {
        this.withdraw(value);
        accountDestiny.deposit(value);
    }

    @Override
    public String toString() {
        return "Numero: " + this.number + " Agency: " + this.agency + " " + owner.toString();
    }


}

