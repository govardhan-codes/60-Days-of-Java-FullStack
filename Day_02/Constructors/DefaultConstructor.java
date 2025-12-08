class Student {
    int id;
    String name;

    // Default constructor
    Student() {
        System.out.println("Default Constructor Called");
        id = 0;
        name = "Unknown";
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s = new Student(); 
        s.display();
    }
}
