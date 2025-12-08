class Employee {
    String name;
    int salary;

    Employee() {
        this.name = "Unknown";
        this.salary = 0;
    }

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    void show() {
        System.out.println(name + " earns " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Govardhan", 50000);

        e1.show();
        e2.show();
    }
}
