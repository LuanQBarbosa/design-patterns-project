package br.com.alura.store.tax;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public abstract class Tax {

    private Tax other;

    public Tax(Tax other) {
        this.other = other;
    }
    
    protected abstract BigDecimal makeCalculation(Budget budget);
    
    public BigDecimal calculate(Budget budget) {
        BigDecimal taxValue = makeCalculation(budget);
        BigDecimal otherTaxValue = BigDecimal.ZERO;
        if(this.other != null) {
            otherTaxValue = other.makeCalculation(budget);
        }

        return taxValue.add(otherTaxValue);
    }
    
}
