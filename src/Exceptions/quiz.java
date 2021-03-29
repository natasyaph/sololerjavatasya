package Exceptions;

public class quiz {
    public static void main(String[] args) {
        void myFunc(int a,int b) {
            try {
                System.out.println(a/b);
            }
            catch (Exception e) {
                System.out.println("Error");

            }

        }
    }
}
