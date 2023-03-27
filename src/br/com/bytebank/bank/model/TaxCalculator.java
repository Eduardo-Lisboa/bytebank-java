package br.com.bytebank.bank.model;

public class TaxCalculator {
    private double totalTax;


    public void register(Taxable taxable) {
        double value = taxable.getTaxValue();
        this.totalTax += value;
    }

    public double getTotalTax() {
        return totalTax;
    }

}
