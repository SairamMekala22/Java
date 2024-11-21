package Package_1;

public class A {
    int a = 46;
    public A() {
        System.out.println(this.a);
    }

    public void m1() {
        System.out.println("In m1 method");
        m2();
    } 
    private void m2() {
        System.out.println("In m2 method of A");
        
    }
}
