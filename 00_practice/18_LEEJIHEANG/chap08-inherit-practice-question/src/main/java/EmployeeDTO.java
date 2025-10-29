public class EmployeeDTO extends PersonDTO{
    private int salary; //급여
    private String dept; // 부서

    public EmployeeDTO() {}

    public EmployeeDTO(String name, int age, double height, double weight, int salary, String dept) {
        super(name, age, height, weight);
        this.salary = salary;
        this.dept = dept;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String information() {
        return super.information() + ", salary=" + salary + ", dept=" + dept;
    }

}

