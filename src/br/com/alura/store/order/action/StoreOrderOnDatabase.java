package br.com.alura.store.order.action;

import br.com.alura.store.order.Order;

public class StoreOrderOnDatabase implements AfterOrderAction {

    public void executeAction(Order order) {
        System.out.println("Storing order on database...");
    }
    
}
