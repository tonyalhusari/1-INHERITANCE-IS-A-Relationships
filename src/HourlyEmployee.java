class HourlyEmployee extends Employee {
    private double wage;
    private int hoursWorked;

    public HourlyEmployee(String firstName, String lastName, String ssn, double wage, int hoursWorked) {
        super(firstName, lastName, ssn);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    // Accessors
    public double getWage() {
        return wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    // Mutators
    public void setWage(double wage) {
        this.wage = wage;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public void displayEmployee(){
        super.displayEmployee();
        System.out.println("Wage: $" + getWage());
        System.out.println("Hours Worked: " + getHoursWorked());
        System.out.println();
    }
}