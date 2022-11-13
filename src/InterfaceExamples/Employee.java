package InterfaceExamples;

public class Employee implements Payable, Restaurant{
    private String name;
    private String school;
    public Employee(){};
    public Employee(String name, String school){
        this.name = name;
        this.school = school;
    }
    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public String getFood() {
        return "sweet foods";
    }

    @Override
    public String getChairs() {
        return "many chairs";
    }


}
