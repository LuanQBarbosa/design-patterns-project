package br.com.alura.store;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetRegister;
import br.com.alura.store.http.JavaHttpClient;

public class AdapterTests {
    
    public static void main(String[] args) {
        Budget budget = new Budget(BigDecimal.TEN, 1);
        budget.approve();
        budget.finish();

        BudgetRegister register = new BudgetRegister(new JavaHttpClient());
        register.register(budget);
    }
    
}
