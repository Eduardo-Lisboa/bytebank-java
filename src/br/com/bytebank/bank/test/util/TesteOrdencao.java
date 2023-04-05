package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.Client;
import br.com.bytebank.bank.model.CurrentAccount;

import java.util.ArrayList;
import java.util.Comparator;

public class TesteOrdencao {
    public static void main(String[] args) {
        ArrayList<Account> list = new ArrayList<Account>();

        Client client = new Client("Eduardo", "23121231321", "Dev");

        Account account1 = new CurrentAccount(123, 922312);
        account1.deposit(120);
        account1.setOwner(client);
        Account account2 = new CurrentAccount(222, 731412);
        account2.deposit(544);
        account2.setOwner(client);
        Account account3 = new CurrentAccount(321, 431331);
        account3.deposit(300);
        account3.setOwner(client);
        Account account4 = new CurrentAccount(324, 656444);
        account4.deposit(231);
        account4.setOwner(client);


        NumberAccountComparator compar = new NumberAccountComparator();

        list.add(account1);
        list.add(account2);
        list.add(account3);
        list.add(account4);

//        for (Account account : list) {
//            System.out.println(account);
//        }

        list.forEach((accountr) -> System.out.println("Account " + accountr));


        System.out.println(list.size());
        System.out.println(list.get(0));


        System.out.println("--------------------------------");
        list.sort(compar);

//        for (Account account : list) {
//            System.out.println(account);
//        }

    }
}

class NumberAccountComparator implements Comparator<Account> {

    @Override
    public int compare(Account o1, Account o2) {
        if (o1.getNumber() < o2.getNumber()) {
            return -1;
        }

        if (o1.getNumber() > o2.getNumber()) {
            return 1;
        }
        return 0;
    }
}
