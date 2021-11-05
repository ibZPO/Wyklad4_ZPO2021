package edu.ib;

public class Tester {
    public static void main(String[] args) {

        try {
            CommisionEmployee ce1 = new CommisionEmployee("John", "Wick",
                    "123", 1000, 0.1);
            System.out.println(ce1);
            System.out.println("Earnings= " + ce1.earnings());

            BasePlusCommisionEmployee bc1= new BasePlusCommisionEmployee("John","McClane",
                    "345",200,0.05, 50);
            System.out.println(bc1);
            System.out.println("Earnings= " + bc1.earnings());
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
}
