package br.com.alura.store.budget.status;

import br.com.alura.store.budget.Budget;

public class Disapproved extends BudgetStatus {

    public void finish(Budget budget) {
        budget.setStatus(new Finished());
    }
    
}
