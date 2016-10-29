package Market;

import java.util.Scanner;

public class Market {

    public static void main(String[] args) {

        //method scanner
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        String user = sc.nextLine();
        String products = sc.nextLine();

        //create objects
        Person newPerson = new Person();
        Product newProduct = new Product();

        while (command != "END") {

            Person.registryPerson(user);
            Product.registryProduct(products);
            
            command = sc.nextLine();

        }//while

    }//main method

}//class Market
