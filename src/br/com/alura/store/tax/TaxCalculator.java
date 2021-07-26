package br.com.alura.store.tax;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class TaxCalculator {
    
    public BigDecimal calculate(Budget budget, Tax tax) {
        return tax.calculate(budget);
    }

}
