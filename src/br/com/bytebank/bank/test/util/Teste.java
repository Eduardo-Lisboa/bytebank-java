package br.com.bytebank.bank.test.util;

import br.com.bytebank.bank.model.Account;
import br.com.bytebank.bank.model.CurrentAccount;

import java.util.ArrayList;

public class Teste {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        Account account = new CurrentAccount(123, 321);

        list.add(account);

        System.out.println(list.size());
    }
}
