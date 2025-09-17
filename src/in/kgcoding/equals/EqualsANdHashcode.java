package in.kgcoding.equals;

public class EqualsANdHashcode {
    public static void main(String[] args) {
        Person person1 = new Person("Prashant","19","001");
        Person person2 = new Person("Prashant","19","001");
        if (person1.equals(person2)){
            System.out.println("Your Both are Equals");
        }else {
            System.out.println("Not Equals !!!!");
        }
    }
}
