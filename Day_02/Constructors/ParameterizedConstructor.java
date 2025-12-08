class Student {
    int id;
    String name;

    // Parameterized constructor
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Govardhan");
        Student s2 = new Student(2, "Kunal");

        s1.display();
        s2.display();
    }
}
