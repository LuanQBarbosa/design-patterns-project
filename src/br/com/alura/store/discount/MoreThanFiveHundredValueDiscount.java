package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class MoreThanFiveHundredValueDiscount extends Discount {

    public MoreThanFiveHundredValueDiscount(Discount next) {
        super(next);
    }
    
    public BigDecimal executeCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    public boolean shouldApply(Budget budget) {
        return budget.getValue().compareTo(new BigDecimal("500")) > 0;
    }
    
}
