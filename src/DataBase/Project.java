package DataBase;

import java.io.Serializable;
import org.joda.time.LocalDate;
import org.joda.money.Money;

public class Project implements Serializable {

    private int id;
    private String name;
    private String descritpion;
    private LocalDate start;
    private LocalDate end;
    private Money budget;
    private Money cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescritpion() {
        return descritpion;
    }

    public void setDescritpion(String descritpion) {
        this.descritpion = descritpion;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public Money getBudget() {
        return budget;
    }

    public void setBudget(Money budget) {
        this.budget = budget;
    }

    public Money getCost() {
        return cost;
    }

    public void setCost(Money cost) {
        this.cost = cost;
    }
}
