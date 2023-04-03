package br.com.bytebank.bank.model;

public class StoreAccounts {
    private Account[] accounts;

    public StoreAccounts() {
        this.accounts = new Account[10];
    }

    public void addAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                break;
            }
        }
    }


    public int getQuantityElements() {
        int quantity = 0;
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                quantity++;
            }
        }
        return quantity;
    }

    public Account getAccount(int position) {
        return accounts[position];
    }
}
