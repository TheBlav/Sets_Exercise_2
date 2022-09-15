package IO;

import Interfaces.Printer;
import Data.Product;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Loop implements Printer {
    inOut io = new inOut();
    int choice = 0;

    public Set Loop() {
        HashSet<Product> products = new HashSet<>();
        while (choice != 1) {

            print ("Podaj nazwę produktu: ");
            String name = io.getStr();
            print("Podaj cenę produktu: ");
            double price = io.getDouble();
            Product product = new Product(name, price);
            if (products.contains(product))
               products = productAlreadyInTable(product,products);
            else
            products.add(product);
            print ("> Dodaj nowy produkt - wpisz liczbę 0");
            print ("Koniec programu - wpisz liczbę 1");
            choice = io.getInt();
            io.getStr();
        }

        return products;
    }

    private HashSet<Product> productAlreadyInTable(Product product, HashSet<Product> products) {
        io.getStr();
        print("Produkt znajduje się w zbiorze");
        print("Czy chciałbyś zamienić obiekty w zbiorze?");
        if (io.getStr().toLowerCase().equals("yes") || io.getStr().toLowerCase().equals("tak")){
            products.remove(product);
            products.add(product);
        }
        return products;
    }


    private class sort implements Comparator<Product>{
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        }

}
