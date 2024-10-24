package q1;

public class Worker {
    public String name;
    public double wage;

    public Worker(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public String getName() {
        return name;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return "Worker [name=" + name + ", wage=" + wage + "]";
    }

}