package oopanddatastructures.inheritancepolymorphism.domain;

public sealed abstract class Employee permits Manager, Salesman {
    private String name;
    protected String code;
    private String address;
    private int age;
    protected double salary;
    private String login;
    private String password;

    public Employee(String name,
                    String code,
                    String address,
                    int age,
                    double salary,
                    String login,
                    String password) {
        this.name = name;
        this.code = code;
        this.address = address;
        this.age = age;
        this.salary = salary;
        this.login = login;
        this.password = password;
    }

    public Employee() {
    }

    public double getSalary() { return salary; }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract double getFullSalary();
}
