package br.com.alura.store.tax;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class ISS extends Tax {

    public ISS(Tax tax) {
        super(tax);
    }
    
    public BigDecimal makeCalculation(Budget budget) {
        return budget.getValue().multiply(new BigDecimal("0.06"));
    }
    
}
