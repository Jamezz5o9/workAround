package PayrollSystem;

public class PayrollSystemTest {
    public static void main(String[] args) {
        BasePlusCommissionEmployee basePlusCommissionEmploye = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
        CommissionEmployee commissionEmployee =
                new CommissionEmployee(
                        "Sue", "Jones", "333-33-3333", 10000, .06);
        System.out.println(basePlusCommissionEmploye.getBaseSalary());
        basePlusCommissionEmploye.setBaseSalary(700);
        basePlusCommissionEmploye.setBaseSalary(1.10 * basePlusCommissionEmploye.getBaseSalary());
        System.out.println(basePlusCommissionEmploye);
        //CommissionEmployee commissionEmployee1 = basePlusCommissionEmploye;
        Employee employee1 = new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", 5000, .04, 300);

       Employee[] employee = new Employee[4];
       employee[0] = hourlyEmployee;
       employee[1] = commissionEmployee;
       employee[2] = basePlusCommissionEmploye;

       for(Employee curEmployee : employee){
           System.out.println(curEmployee);


           if(curEmployee instanceof BasePlusCommissionEmployee){
               BasePlusCommissionEmployee basePlusCommissionEmployee = (BasePlusCommissionEmployee) curEmployee;
           }
       }
    }
}
