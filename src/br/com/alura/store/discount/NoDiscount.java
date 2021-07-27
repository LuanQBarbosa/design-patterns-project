package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class NoDiscount extends Discount {
    
    public NoDiscount() {
        super(null);
    }

    public BigDecimal executeCalculation(Budget budget) {
        return BigDecimal.ZERO;
    }

    public boolean shouldApply(Budget budget) {
        return true;
    }
    
}
