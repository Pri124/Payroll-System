package employee.payroll.system;

public class Main {
          
    public static void main(String []args){
        PayrollSystem prs = new PayrollSystem();
        FullTimeEmployee emp1 = new FullTimeEmployee("Sakshi",1,25000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Amritanshu",2,40,150);
        
        prs.addEmployee(emp1);
        prs.addEmployee(emp2);
        System.out.println("Initial Employee Details");
        prs.displayEmployee();
        System.out.println("Removing Employees");
        prs.removeEmployee(2);
        System.out.println("Remaining Employees Details");
        prs.displayEmployee();
    }
}
