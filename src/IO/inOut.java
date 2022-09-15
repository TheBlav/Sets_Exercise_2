package IO;

import Data.Product;
import Interfaces.Printer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class inOut implements Printer {
Scanner scan = new Scanner(System.in);
    public String getStr(){
        return scan.nextLine();
    }

    public double getDouble(){return scan.nextDouble();}

    public int getInt(){return scan.nextInt();}

    public void printSet(Set<Product> set){
        print(set);
    }
}


