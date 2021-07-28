package br.com.alura.store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.order.action.SendOrderEmail;
import br.com.alura.store.order.action.StoreOrderOnDatabase;

public class GenerateOrder {
    
    private String client;
    private BigDecimal budgetValue;
    private int itemsQuantity;

    public GenerateOrder(String client, BigDecimal budgetValue, int itemsQuantity) {
        this.client = client;
        this.budgetValue = budgetValue;
        this.itemsQuantity = itemsQuantity;
    }

    public void execute() {
        Budget budget = new Budget(this.budgetValue, this.itemsQuantity);
        LocalDateTime date = LocalDateTime.now();

        Order order = new Order(this.client, date, budget);

        // Possible order actions
        SendOrderEmail email = new SendOrderEmail();
        StoreOrderOnDatabase store = new StoreOrderOnDatabase();

        email.execute(order);
        store.execute(order);
    }
    
}
