package br.com.alura.store.budget;

import java.math.BigDecimal;

public class BudgetItem {
    
    private BigDecimal value;

    public BudgetItem(BigDecimal value) {
        this.value = value;
    }

    public BigDecimal getValue() {
        return value;
    }
    
}
