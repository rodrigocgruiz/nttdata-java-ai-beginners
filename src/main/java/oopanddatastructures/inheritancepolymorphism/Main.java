package oopanddatastructures.inheritancepolymorphism;

import oopanddatastructures.inheritancepolymorphism.domain.Employee;
import oopanddatastructures.inheritancepolymorphism.domain.Manager;
import oopanddatastructures.inheritancepolymorphism.domain.Salesman;

public class Main {
    public static void main(String[] args) {
        printEmployee(new Manager());
        printEmployee(new Salesman());

    }

    public static void printEmployee(Employee employee) {
        employee.setCode("123");
        System.out.printf("=======%s=======\n", employee.getClass().getSimpleName());

//        if (employee instanceof Manager manager) {
//
//        }
        switch (employee){
            case Manager manager -> {
                manager.setCode("123");
                manager.setName("João");
                manager.setSalary(5000);
                manager.setLogin("joão");
                manager.setPassword("123456");
                manager.setComission(1000);


                System.out.println(manager.getCode());
                System.out.println(manager.getSalary());
                System.out.println(manager.getName());
                System.out.println(manager.getLogin());
                System.out.println(manager.getPassword());
                System.out.println(manager.getComission());
            }
            case Salesman salesman -> {
                salesman.setCode("321");
                salesman.setName("Lucas");
                salesman.setSalary(2800);
                salesman.setPercentSold(10);
                salesman.setSoldAmount(1000);

                System.out.println(salesman.getCode());
                System.out.println(salesman.getSalary());
                System.out.println(salesman.getName());
                System.out.println(salesman.getPercentSold());

            }
            default -> throw new IllegalStateException("Unexpected value: " + employee);
        }
        System.out.println(employee.getFullSalary());
        System.out.println("=======================");
    }
}
