package br.com.alura.store.order.action;

import br.com.alura.store.order.Order;

public class SendOrderEmail {

    public void execute(Order order) {
        System.out.println("Sending email with order data...");
    }
    
}
