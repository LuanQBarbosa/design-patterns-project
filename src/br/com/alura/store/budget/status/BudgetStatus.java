package br.com.alura.store.budget.status;

import br.com.alura.store.budget.Budget;

import java.math.BigDecimal;

import br.com.alura.store.DomainException;

public abstract class BudgetStatus {

    public BigDecimal calculateExtraDiscountValue(Budget budget) {
        return BigDecimal.ZERO;
    }
    
    public void approve(Budget budget) {
        throw new DomainException("Budget cannot be approved!");
    }

    public void disapprove(Budget budget) {
        throw new DomainException("Budget cannot be disapproved!");
    } 

    public void finish(Budget budget) {
        throw new DomainException("Budget cannot be finalized!");
    } 
    
}
