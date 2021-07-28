package br.com.alura.store.order;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.store.budget.Budget;

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

        System.out.println("Save order to database");
        System.out.println("Send email with new order data");
    }
    
}
