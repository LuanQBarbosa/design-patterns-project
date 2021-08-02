package br.com.alura.store;

import java.math.BigDecimal;

import br.com.alura.store.budget.Budget;
import br.com.alura.store.budget.BudgetItem;
import br.com.alura.store.discount.DiscountCalculator;

public class DiscountTests {
    
    public static void main(String[] args) {
        Budget firstBudget = new Budget();
        firstBudget.addItem(new BudgetItem(new BigDecimal("200")));

        Budget secondBudget = new Budget();
        secondBudget.addItem(new BudgetItem(new BigDecimal("1000")));

        DiscountCalculator calculator = new DiscountCalculator();
        System.out.println(calculator.calculate(firstBudget));
        System.out.println(calculator.calculate(secondBudget));
    }
    
}
