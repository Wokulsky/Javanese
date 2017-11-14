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
    private float budget;
    private float cost;
    //private Money cost;
    //private Money budget;

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

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", descritpion='" + descritpion + '\'' +
                ", start=" + start +
                ", end=" + end +
                ", budget=" + budget +
                ", cost=" + cost +
                '}';
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

    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        this.budget = budget;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
