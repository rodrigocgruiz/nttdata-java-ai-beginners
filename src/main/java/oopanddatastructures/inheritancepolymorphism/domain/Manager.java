package oopanddatastructures.inheritancepolymorphism.domain;

public non-sealed class Manager extends Employee {

    private double comission;

    public Manager(String name,
                   String code,
                   String address,
                   int age,
                   double salary,
                   String login,
                   String password,
                   double comission) {
        super(name, code, address, age, salary, login, password);
        this.comission = comission;
    }

    public Manager() {
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    @Override
    public String getCode() {
        return "MGR" + super.getCode();
    }

    @Override
    public  double getFullSalary() {
        return this.salary + this.comission;
    }
}
