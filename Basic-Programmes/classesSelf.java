class Employees {
    int id;
    String name;
    int salary;

    // Constructor for easier initialization
    public Employees(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("My name is " + name);
        System.out.println("And my ID is " + id);
    }

    public int getSalary() {
        return salary;
    }
}

public class classesSelf {
    public static void main(String[] args) {
        System.out.println("This is our custom class...");

        // Using the constructor to initialize employees
        Employees harry = new Employees(12, "HarrySingh", 45);
        Employees john = new Employees(90, "JohnCena", 70);

        harry.printDetails();
        john.printDetails();

        int salary = john.getSalary();
        System.out.println(salary);
        System.out.println(harry.id);
        System.out.println(harry.name);
    }
}
