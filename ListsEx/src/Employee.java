public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void addSalary(Double x) {

        double newSalary = (getSalary() * x) / 100;
        setSalary(getSalary()+newSalary);
    }

    public String toString() {
        return "Id: "
                + getId() +
                " - Name: "
                + getName() +
                ", Salario R$ "
                + getSalary();
    }

}
