public class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }
}

class Main {
    public static void main(String[] args) {
        Human h1 = new Human("mufaddal");
        Human h2 = new Human("mufaddal");

        System.out.println(h1 == h2); // false
        System.out.println(h1.equals(h2)); // false
        System.out.println(h1.equals(h1)); // true

        int a = 10;
        int b = 10;
        System.out.println(a == b); // true

        Integer c = 10;
        Integer d = 10;
        System.out.println(c == d); // true
        System.out.println(c.equals(d)); // true

        String s1 = "mufaddal";
        String s2 = "mufaddal";
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true

        int hashCodeH1 = h1.hashCode();
        System.out.println(hashCodeH1); // 2060468723

        int hashCodeC = c.hashCode();
        System.out.println(hashCodeC); // 10 (Value of c)

        int hashCodeS1 = s1.hashCode();
        int hashCodeS2 = s2.hashCode();
        System.out.println(hashCodeS1); // 464347022
        System.out.println(hashCodeS2); // 464347022
        // If objects are equal then their hashcode will be same

    }
}
