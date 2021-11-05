package edu.ib;

public class BasePlusCommisionEmployee extends CommisionEmployee {
    private double baseSalary;

    public BasePlusCommisionEmployee(String firstName, String lastName,
                                     String socialSecurityNumber,
                                     double grossSale, double commisionRate,
                                     double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSale, commisionRate);
        if (baseSalary < 0) throw new IllegalArgumentException("salary must be hreater than 0");
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {

        String oldPart=super.toString();
        oldPart=oldPart.substring(0,oldPart.length()-1);
        String newPart=", base salary=" + baseSalary + '}';
        return oldPart.concat(newPart);
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }
}
