package Exceptions;

public class Threadss {
    public static void main(String[] args) {
        class A implements Runnable {
            public void run() {
                System.out.println("Bye");
            }

        }
        class App {
            public void main(String[] args) {
                Thread ob = new Thread(new A());
                ob.start();

            }

        }
    }
}
