package br.com.alura.store;

import java.math.BigDecimal;

import br.com.alura.store.order.GenerateOrder;

public class OrderTests {
    
    public static void main(String[] args) {
        String client = args[0];
        BigDecimal budgetValue = new BigDecimal(args[1]);
        int itemsQuantity = Integer.parseInt(args[2]);

        GenerateOrder generator = new GenerateOrder(client, budgetValue, itemsQuantity);
        generator.execute();
    }
    
}
