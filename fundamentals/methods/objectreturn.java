package methods;

class Dog {
    String name;
}

public class objectreturn {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.name = "Spot";

        dogNameToUpperCase(d);
        System.out.println(d.name);
    }

    public static Dog dogNameToUpperCase(Dog dog) {
        dog.name = dog.name.toUpperCase();
        return dog;
    }
}
