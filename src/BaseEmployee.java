class BaseEmployee extends Employee {
    private double baseSalary;

    public BaseEmployee(String firstName, String lastName, String ssn, double baseSalary) {
        super(firstName, lastName, ssn);
        this.baseSalary = baseSalary;
    }

    // Accessor
    public double getBaseSalary() {
        return baseSalary;
    }

    // Mutator
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public void displayEmployee(){
        super.displayEmployee();
        System.out.println("Base Salary: $" + getBaseSalary());
        System.out.println();
    }

}