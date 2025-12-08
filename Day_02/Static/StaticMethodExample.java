class Demo {

    static void show() {  
        System.out.println("Static Method Called");
    }

    public static void main(String[] args) {
        Demo.show();  // no object needed
    }
}
