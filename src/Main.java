public class Main {
    public static void main(String[] args) {
        Employee joeJones = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        Employee stephanieSmith = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        Employee maryQuinn = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        Employee nicoleDior = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        Employee renwaChanel = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        Employee mikeDavenport = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);
        Employee mahnazVaziri = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

        //using polymoric method
      /*  joeJones.displayEmployee();
        stephanieSmith.displayEmployee();
        maryQuinn.displayEmployee();
        nicoleDior.displayEmployee();
        renwaChanel.displayEmployee();
        mikeDavenport.displayEmployee();
        mahnazVaziri.displayEmployee();*/

        displayEmployee(joeJones);
        displayEmployee(stephanieSmith);
        displayEmployee(maryQuinn);
        displayEmployee(nicoleDior);
        displayEmployee(renwaChanel);
        displayEmployee(mikeDavenport);
        displayEmployee(mahnazVaziri);
    }

    public static void displayEmployee(Employee employee) {
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Social Sec #: " + employee.getSsn());

        if (employee instanceof SalariedEmployee) {
            SalariedEmployee salariedEmployee = (SalariedEmployee) employee;
            System.out.println("Weekly Salary: $" + salariedEmployee.getWeeklySalary());
        } else if (employee instanceof HourlyEmployee) {
            HourlyEmployee hourlyEmployee = (HourlyEmployee) employee;
            System.out.println("Wage: $" + hourlyEmployee.getWage());
            System.out.println("Hours Worked: " + hourlyEmployee.getHoursWorked());
        } else if (employee instanceof CommissionEmployee) {
            CommissionEmployee commissionEmployee = (CommissionEmployee) employee;
            System.out.println("Commission Rate: " + commissionEmployee.getCommissionRate());
            System.out.println("Gross Sales: $" + commissionEmployee.getGrossSales());
        } else if (employee instanceof BaseEmployee) {
            BaseEmployee baseEmployee = (BaseEmployee) employee;
            System.out.println("Base Salary: $" + baseEmployee.getBaseSalary());
        }

        System.out.println();
    }
}