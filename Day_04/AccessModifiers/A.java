package AccessModifiers;

public class A {

    public String publicVar = "I am Public";
    protected String protectedVar = "I am Protected";
    String defaultVar = "I am Default";
    private String privateVar = "I am Private";

    public void show() {
        System.out.println(publicVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
        System.out.println(privateVar);
    }
}
