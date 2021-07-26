package br.com.alura.store.tax;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public interface Tax {
    
    BigDecimal calculate(Budget budget);
    
}
