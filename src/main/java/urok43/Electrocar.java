package urok43;

public class Electrocar {
    private int id;

    //вложенный нестатичный класс
    private class Motor {
        public void startMotor() {
            System.out.println("Motor is starting...");
        }
    }

    //статический вложенный класс
    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging...");
        }
    }

    public Electrocar(int id) {
        this.id = id;
    }

    public void start() {
        Motor motor = new Motor();
        motor.startMotor();
        System.out.println("Electrocar " + id + " is starting...");

        final int x = 1;
        class SomeClass {
            public void someMetods(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        SomeClass someObject = new SomeClass();
        test(someObject);
    }

    private void test(Object obj) {

    }
}
