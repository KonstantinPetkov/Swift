package Task2_FileStructure;

import java.util.Scanner;

public class FileStructure {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String string;
        
        FolderObject ButtonDemoProject = new FolderObject("Parent", "Name");
        
        while (!(string = sc.nextLine()).equalsIgnoreCase("END")) {
            String[] arr = string.split(" ");
            String command = arr[0].trim();

            switch (command) {
                case "mkdir": {
                    
                    break;
                }
                
                case "touch": {
                 
                    break;
                }
                
        
            }
    
        }
    }
}
