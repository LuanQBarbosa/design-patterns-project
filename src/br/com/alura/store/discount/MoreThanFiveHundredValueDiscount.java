package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class MoreThanFiveHundredValueDiscount extends Discount {

    public MoreThanFiveHundredValueDiscount(Discount next) {
        super(next);
    }
    
    public BigDecimal calculate(Budget budget) {
        if(budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.05"));
        }

        return next.calculate(budget);
    }
    
}
