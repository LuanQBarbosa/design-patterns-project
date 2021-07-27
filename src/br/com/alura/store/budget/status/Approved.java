package br.com.alura.store.budget.status;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class Approved extends BudgetStatus {
    
    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.02"));
    } 

    public void finish(Budget budget) {
        budget.setStatus(new Finished());
    }
    
}
