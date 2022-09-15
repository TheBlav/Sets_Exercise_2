package Interfaces;

public interface Printer {

    default void print (String txt){
        System.out.println(txt);
    }

    default void print (Object o){
        System.out.println(o.toString());
    }
}
