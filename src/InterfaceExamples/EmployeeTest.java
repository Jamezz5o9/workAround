package InterfaceExamples;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getBalance());
        System.out.println(employee.getFood());
        System.out.println(employee.getChairs());
        System.out.println(employee.getPaymentAmount());
        System.out.println();

        Payable payable = new Employee();
        System.out.println(payable.getBalance());
    }
}
