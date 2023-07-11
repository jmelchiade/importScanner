public class EmployeeSalary {
    private static final double HOURLY_RATE = 25, COMMISSION_RATE = 0.15, BASE_PAY = 1500, _15_YEARS = 0.15,
            _10_YEARS = 0.1, _5_YEARS = 0.05;

    private static final String NE = "Not eligible of award";

    private int emp_code,
            years_of_service;
    private String award;
    private double salary,
            gross;

    public EmployeeSalary(int emp_code, int yrs, double gross) {
        this.emp_code = emp_code;
        years_of_service = yrs;
        this.gross = gross;
    }

    public String toString() {
        return "Salary$" + salary + "\nYears of service " + years_of_service + "\n" + award;
    }

    // calculate the respective salary
    public void calculateSalary() {
        switch (emp_code) {
            case 1: // Manager
                switch (years_of_service) {
                    case 15: // Fifteenth anniversary
                        award = "15 years award";
                        salary = gross + gross * _15_YEARS;
                        break;
                    case 10: // Tenth anniversary
                        award = "10 years award";
                        salary = gross + gross * _10_YEARS;
                        break;
                    case 5: // Fifth anniversary
                        award = "5 years award";
                        salary = gross + gross * _5_YEARS;
                        break;
                    default: // Not qualify for an award
                        salary = gross;
                        award = "Manager - " + NE;
                        break;
                }
                break;
            case 2: // Hourly worker
                award = "Hourly paid - " + NE;
                salary = gross * HOURLY_RATE;
                break;
            case 3: // Commission worker
                award = "Commission worker - " + NE;
                salary = BASE_PAY + COMMISSION_RATE * gross;
                break;
            default: // No such worker
                award = " Not an employee";
                break;
        }

    }

}