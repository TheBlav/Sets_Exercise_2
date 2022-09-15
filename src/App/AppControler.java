package App;

import Data.Product;
import IO.Loop;
import IO.inOut;
import java.util.HashSet;
import java.util.Set;

public class AppControler {
        Loop loop = new Loop();
        inOut io = new inOut();
        Set<Product> products = new HashSet<>();
    public void AppControler(){
        products = loop.Loop();
        printList(products);

    }

    private void printList(Set<Product> products) {
        io.printSet(products);
    }
}
