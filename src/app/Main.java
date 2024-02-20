package app;
import app.FileReadService;
import app.FileWriteService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice = choice();
        if(choice == 1){
            System.out.println(FileWriteService.toFile(text(),fileName()));
        }
        else if (choice == 2){
            System.out.println(FileReadService.fromFile(fileName()));
        }else {
            System.out.println("Input 1 or 2");
        }

    }
    private static int choice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number of your choice\n" +
                "1)Write to file\n" +
                "2)Read from file\n");
        return scanner.nextInt();
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