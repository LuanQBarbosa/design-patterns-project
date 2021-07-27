package br.com.alura.store.budget.status;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class UnderAnalysis extends BudgetStatus {
    
    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.05"));
    }

    public void approve(Budget budget) {
        budget.setStatus(new Approved());
    } 

    public void disapprove(Budget budget) {
        budget.setStatus(new Disapproved());
    } 
    
}
