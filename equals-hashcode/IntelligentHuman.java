public class IntelligentHuman {
    private String name;

    public IntelligentHuman(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        IntelligentHuman human = (IntelligentHuman) obj;
        return name.equals(human.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static void main(String[] args) {
        IntelligentHuman h1 = new IntelligentHuman("mufaddal");
        IntelligentHuman h2 = new IntelligentHuman("mufaddal");

        System.out.println(h1.equals(h2)); // true
        System.out.println(h1.hashCode()); // 464347022
        System.out.println(h2.hashCode()); // 464347022
        System.out.println(h1 == h2); // false
    }

}
