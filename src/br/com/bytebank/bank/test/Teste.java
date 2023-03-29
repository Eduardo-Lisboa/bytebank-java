package br.com.bytebank.bank.test;


import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.Client;
import br.com.bytebank.bank.model.CurrentAccount;

public class Teste {
    public static void main(String[] args) {


        Client client = new Client("Eduado", "21312312412", "Dev");

       CurrentAccount c = new CurrentAccount(123, 321) ;


        c.setOwner(client);

        System.out.println(c.toString());
    }
}
