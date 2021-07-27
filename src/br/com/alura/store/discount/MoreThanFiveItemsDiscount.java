package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class MoreThanFiveItemsDiscount extends Discount {

    public MoreThanFiveItemsDiscount(Discount next) {
        super(next);
    }
    
    public BigDecimal calculate(Budget budget) {
        if(budget.getItemsQuantity() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        return next.calculate(budget);
    }
    
}
