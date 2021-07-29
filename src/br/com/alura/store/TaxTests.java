package br.com.alura.store;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.tax.ICMS;
import br.com.alura.store.tax.ISS;
import br.com.alura.store.tax.TaxCalculator;

public class TaxTests {
    
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("100"), 1);
        TaxCalculator calculator = new TaxCalculator();

        System.out.println(calculator.calculate(budget, new ICMS(new ISS(null))));
    }
    
}
