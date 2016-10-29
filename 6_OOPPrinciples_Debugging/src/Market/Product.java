package Market;

import java.util.Scanner;

public class Product {

    //fields
    private static String name;
    private static float price;
    private static String[] product = new String[500];
    static int j = 0;
    
    Scanner sc = new Scanner(System.in);

    //constructor
    public Product() {
        this.name = sc.nextLine();
        setName(name);
        this.price = sc.nextFloat();
        setPrice(price);
    }

    //methods
    public static String registryProduct(String products) {
        for(int j = 0; j < 500; j++) {
            product[j] = products;
        }
        return products;
    }//registryProducts
    
    public void available() {
        if(!(j < 500)) {
            System.out.println("Not available!");
        }
    }//available
    
    //set & get & checker methods  
    
    public void isPricePositiv() {
        if(!(this.price > 0)) {
            System.out.println("Price can’t be negative.");
        }
    }
    
    public void isNameNotNull() {
        if(!(this.name == null)) {
            System.out.println("Name can’t be empty.");
        }
    }
    
    private void setPrice(float price) {
        this.price = price;
    }

    public static float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

}
