package constructorandstatic;

public class FixedDeposit {
    int amount;
    int noOfDays;
    static double interestRate = 10;
    String name;

    //No need to use this keyword with Static members
    //No need to use ClassName as well for static members inside the class
    //non-static method -> can access both static and non-static attributes
    double calculateInterest(){
        double interest = (this.amount * this.noOfDays * interestRate)/(100*365);
        return interest;
    }

    //static method -> can access static attributes and not access non-static attributes
    static void printFDDetails() {
        System.out.println("Rate of interest : " + interestRate);
        //System.out.println("Amount of FD : " + this.amount); -> this won't work, because we call static method using className, so it will never know which object's data to read
        // it will not be able to understand, which FD object's amount it has to print
        // so we cant use non-static members inside static method
    }
}
