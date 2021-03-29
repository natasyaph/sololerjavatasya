package moreandclasses;

public class Abc {
    public static void main(String[] args) {
        class A {
            public void print() {
                System.out.println("A");

            }

        }

        class B {
            public void main(String[] args) {
                A object = new A() {
                    @Override public void
                    print() {
                        System.out.println("Hello");
                    }
                };
                object.print();
            }

        }
    }
}