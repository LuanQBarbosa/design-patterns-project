package br.com.alura.store.budget;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.store.budget.status.BudgetStatus;
import br.com.alura.store.budget.status.Finished;
import br.com.alura.store.budget.status.UnderAnalysis;

public class Budget {
    
    private List<BudgetItem> items;
    private BigDecimal value;
    private BudgetStatus status;

    public Budget() {
        this.value = BigDecimal.ZERO;
        this.items = new ArrayList<>();
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
        return items.size();
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

    public void addItem(BudgetItem item) {
        this.value = value.add(item.getValue());
        this.items.add(item);
    }

}
