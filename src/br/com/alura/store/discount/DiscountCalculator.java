package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class DiscountCalculator {
    
    public BigDecimal calculate(Budget budget) {
        if(budget.getItemsQuantity() > 5) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        if(budget.getValue().compareTo(new BigDecimal("500")) > 0) {
            return budget.getValue().multiply(new BigDecimal("0.1"));
        }

        return BigDecimal.ZERO;
    }
    
}
