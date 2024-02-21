package app;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        choice();
    }
      private static void choice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of your choice\n" +
                "1)Write to file\n" +
                "2)Read from file\n");
        int choice = scanner.nextInt();
        if(choice == 1){
            FileWriteService toFile = new FileWriteService();
            System.out.println(toFile.toFile(text(),fileName()));
        }
        else if (choice == 2){
            FileReadService fromFile = new FileReadService();
            System.out.println(fromFile.fromFile(fileName()));
        }else {
            System.out.println("Input 1 or 2");
        }
    }
    private static String text(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type text\n");
        return scanner.nextLine();
    }
    private static String fileName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("File name\n");
        return scanner.nextLine();
    }
}