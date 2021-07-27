package br.com.alura.store;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.discount.DiscountCalculator;

public class DiscountTests {
    
    public static void main(String[] args) {
        Budget firstBudget = new Budget(new BigDecimal("200"), 6);
        Budget secondBudget = new Budget(new BigDecimal("1000"), 1);

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(firstBudget));
        System.out.println(calculator.calculate(secondBudget));
    }
    
}
