package br.com.bytebank.bank.test;


import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CurrentAccount;

public class Teste {
    public static void main(String[] args) {
        Account c = new CurrentAccount(123, 321);

        c.deposit(200);
        try {

            c.withdraw(300);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(c.getBalance());
    }
}
