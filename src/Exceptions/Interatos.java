package Exceptions;

import javafx.beans.binding.ListExpression;

import java.util.Iterator;
public class Interatos {
    public static void main(String[] args, @org.jetbrains.annotations.NotNull ListExpression<Object> list) {
        Iterator<Object> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }
}
