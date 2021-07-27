package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public abstract class Discount {
    
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }
    
    public BigDecimal calculate(Budget budget) {
        if(shouldApply(budget)) {
            return executeCalculation(budget);
        }

        return next.calculate(budget);
    }

    protected abstract boolean shouldApply(Budget budget);
    protected abstract BigDecimal executeCalculation(Budget budget);
    
}
