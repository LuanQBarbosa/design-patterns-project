package br.com.alura.store.discount;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public abstract class Discount {
    
    protected Discount next;

    public Discount(Discount next) {
        this.next = next;
    }
    
    public abstract BigDecimal calculate(Budget budget);
    
}
