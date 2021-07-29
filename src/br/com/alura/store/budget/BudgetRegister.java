package br.com.alura.store.budget;

import java.util.Map;

import br.com.alura.store.DomainException;
import br.com.alura.store.http.HttpAdapter;

public class BudgetRegister {

    private HttpAdapter http;

    public BudgetRegister(HttpAdapter http) {
        this.http = http;
    }
    
    public void register(Budget budget) {
        if(!budget.isFinished()) {
            throw new DomainException("Budget not finished!");
        }
        // HTTP call to external API
        String url = "http://external.api/budget";
        Map<String, Object> data = Map.of(
            "value", budget.getValue(),
            "itemsQuantity", budget.getItemsQuantity()
        );

        http.post(url, data);
    }
    
}
