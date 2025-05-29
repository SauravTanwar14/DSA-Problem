package Stream_API;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.io.*;
import java.util.*;
 

class Product{
    int id;
    float price;
    String name;
    
    Product(int id,float price,String name){
        this.id=id;
        this.price=price;
        this.name=name;
    }
}

public class Stream2 {

    	public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
		
	    productsList.add(new Product(1,25000f,"HP Laptop"));  
        productsList.add(new Product(2,30000f,"Dell Laptop"));  
        productsList.add(new Product(3,28000f,"Lenevo Laptop"));  
        productsList.add(new Product(4,28000f,"Sony Laptop"));  
        productsList.add(new Product(5,90000f,"Apple Laptop"));  
        
        List<Float> productPriceList2 = productsList.stream().filter(p->p.price>=30000)
        .map(p->p.price)
        .collect(Collectors.toList());
         System.out.println(productPriceList2); 

         productsList.stream().filter(product->product.price==30000)
         .forEach(product->System.out.println(product.price));
        }
}
