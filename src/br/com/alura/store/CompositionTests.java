package br.com.alura.store;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetItem;

public class CompositionTests {

    public static void main(String[] args) {
        Budget oldBudget = new Budget();
        oldBudget.addItem(new BudgetItem(new BigDecimal("200")));
        oldBudget.disapprove();

        Budget newBudget = new Budget();
        newBudget.addItem(new BudgetItem(new BigDecimal("500")));
        newBudget.addItem(oldBudget);

        System.out.println(newBudget.getValue());
    }
    
}
