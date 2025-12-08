class Student {
    int id;
    String name;

    static String college = "ABC College"; // static variable

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Govardhan");
        Student s2 = new Student(2, "Rahul");

        s1.display();
        s2.display();
    }
}
