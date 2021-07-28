package br.com.alura.store;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.order.Order;

public class OrderTests {
    
    public static void main(String[] args) {
        Budget budget = new Budget(new BigDecimal("600"), 4);
        String client = "Ana";
        LocalDateTime date = LocalDateTime.now();

        Order order = new Order(client, date, budget);

        System.out.println("Save order to database");
        System.out.println("Send email with new order data");
    }
    
}
