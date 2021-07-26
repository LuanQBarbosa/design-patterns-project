package br.com.alura.store.tax;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class TaxCalculator {
    
    public BigDecimal calculate(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }
    
}
