package urok42;

public class Test {
    public static void main(String[] args) {
        /*
        //пример 1
        //int x = 1;
        //int y = 1;
        //System.out.println(x == y);
        Animal animal1 = new Animal(1);
        Animal animal2 = animal1;

        // animal1      =>          {1}
        // animal2      =>          {1}

        System.out.println(animal1 == animal2);

        //Object object = new Object();
        //object.equals();
         */



        //пример 2
        //String string1 = "Hello";
        // string1 -> {"Hello"}
        // string2
        //String string2 = "Hello";
        //System.out.println(string1 == string2);

        //пример 3
        String a = "hello";
        String b = "hello123".substring(0, 5);

        System.out.println(b);
        System.out.println(a == b);
    }
}

class Animal {
    private int id;
    public Animal(int id){
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}





