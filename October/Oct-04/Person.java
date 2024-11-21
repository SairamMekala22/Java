public class Person {
    int age;
    String name;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
        // this.hashCode();
    }

    public boolean equals(Object obj) {
        Person p = (Person)obj;
        if (this.name == p.name && this.age == p.age) {
            // this.hashCode();
            // p.hashCode();
            p = this;
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return 100;
    }

    public static void main(String[] args) {
        Person p = new Person("Alexa", 19);
        Person p1 = new Person("Alexa", 19);
        Person p2 = new Person("Jaffa", 21);
        // System.out.println(p.equals(p1));
        // System.out.println(p.hashCode());
        // System.out.println(p1.hashCode());
        boolean k = p.equals(p1);
        System.out.println(k);
        System.out.println(p1 + " " + p);
        System.out.println(p == p);
        System.out.println(p == p1);

    }
}