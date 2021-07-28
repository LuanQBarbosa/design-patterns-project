package br.com.alura.store;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import br.com.alura.store.order.GenerateOrder;
import br.com.alura.store.order.action.AfterOrderAction;
import br.com.alura.store.order.action.SendOrderEmail;
import br.com.alura.store.order.action.StoreOrderOnDatabase;

public class OrderTests {
    
    public static void main(String[] args) {
        String client = "Luan";
        BigDecimal budgetValue = new BigDecimal("300");
        int itemsQuantity = Integer.parseInt("2");

        List<AfterOrderAction> actions = Arrays.asList(
            new StoreOrderOnDatabase(),
            new SendOrderEmail()
        );

        GenerateOrder generator = new GenerateOrder(client, budgetValue, itemsQuantity, actions);
        generator.execute();
    }
    
}
