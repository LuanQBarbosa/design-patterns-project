package br.com.alura.store.budget;

import java.math.BigDecimal;

import br.com.alura.store.budget.status.BudgetStatus;
import br.com.alura.store.budget.status.Finished;
import br.com.alura.store.budget.status.UnderAnalysis;

public class Budget {
    
    private BigDecimal value;
    private int itemsQuantity;
    private BudgetStatus status;

    public Budget(BigDecimal value, int itemsQuantity) {
        this.value = value;
        this.itemsQuantity = itemsQuantity;
        this.status = new UnderAnalysis();
    }

    public void applyExtraDiscount() {
        BigDecimal extraDiscountValue = this.status.calculateExtraDiscountValue(this);
        this.value = this.value.subtract(extraDiscountValue);
    }

    public void approve() {
        this.status.approve(this);
    }

    public void disapprove() {
        this.status.disapprove(this);
    }

    public void finish() {
        this.status.finish(this);
    }
    
    public BigDecimal getValue() {
        return value;
    }

    public int getItemsQuantity() {
        return itemsQuantity;
    }

    public BudgetStatus getStatus() {
        return status;
    }

    public void setStatus(BudgetStatus status) {
        this.status = status;
    }

    public boolean isFinished() {
        return this.status instanceof Finished;
    }

}
