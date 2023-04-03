package br.com.bytebank.bank.test;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CurrentAccount;
import br.com.bytebank.bank.model.StoreAccounts;

public class TesteStoreAccounts {
    public static void main(String[] args) {

        StoreAccounts keep = new StoreAccounts();

        Account cc = new CurrentAccount(22, 11);

        keep.addAccount(cc);


        int size = keep.getQuantityElements();

        System.out.println(size);
    }
}
