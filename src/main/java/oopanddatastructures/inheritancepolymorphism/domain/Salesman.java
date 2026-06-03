package oopanddatastructures.inheritancepolymorphism.domain;

public non-sealed class Salesman extends Employee {
    private double percentSold;
    private double soldAmount;

    public Salesman(String name,
                    String code,
                    String address,
                    int age,
                    double salary,
                    String login,
                    String password,
                    double percentSold) {
        super(name, code, address, age, salary, login, password);
        this.percentSold = percentSold;
        this.soldAmount = soldAmount;
    }

    public Salesman() {
    }

    public double getPercentSold() {

        return percentSold;
    }

    public void setPercentSold(double percentSold) {

        this.percentSold = percentSold;
    }

    public double getSoldAmount() {
        return soldAmount;
    }

    public void setSoldAmount(double soldAmount) {
        this.soldAmount = soldAmount;
    }

    @Override
    public String getCode() {
        return "SL" + this.code;
    }

    @Override
    public double getFullSalary() {
        return this.salary + ((this.soldAmount * this.percentSold) / 100);
    }

}
