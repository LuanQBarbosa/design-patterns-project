package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class MoreThanFiveItemsDiscount extends Discount {

    public MoreThanFiveItemsDiscount(Discount next) {
        super(next);
    }
    
    public BigDecimal executeCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.1"));
    }

    public boolean shouldApply(Budget budget) {
        return budget.getItemsQuantity() > 5;
    }
    
}
