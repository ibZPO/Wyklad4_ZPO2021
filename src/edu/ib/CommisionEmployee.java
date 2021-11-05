package edu.ib;

public class CommisionEmployee extends Object {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private double grossSale;
    private double commisionRate;

    public CommisionEmployee(String firstName, String lastName,
                             String socialSecurityNumber,
                             double grossSale, double commisionRate) {

        if (grossSale < 0)
            throw new IllegalArgumentException("sales must be greater than 0");
        if (commisionRate < 0 || commisionRate >1.0)
            throw new IllegalArgumentException("wrong commision");


        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.commisionRate=commisionRate;
        this.grossSale=grossSale;

    }

    public double earnings(){
        return grossSale*commisionRate;
    }

    @Override // Adnotacja
    public String toString() {
        return "{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", grossSale=" + grossSale +
                ", commisionRate=" + commisionRate +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public double getCommisionRate() {
        return commisionRate;
    }
}
