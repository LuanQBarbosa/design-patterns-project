package br.com.alura.store.tax;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;

public class ICMSWithISS implements Tax {
    
    public BigDecimal calculate(Budget budget) {
        BigDecimal icms = new ICMS().calculate(budget);
        BigDecimal iss = new ISS().calculate(budget);
        return icms.add(iss);
    }
    
}
