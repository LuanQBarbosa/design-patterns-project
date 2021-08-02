package br.com.alura.store.order.action;

import br.com.alura.store.order.Order;

public class OrderLog implements AfterOrderAction {
    
    public void executeAction(Order order) {
        System.out.println("Order generated: " + order);
    }
    
}
