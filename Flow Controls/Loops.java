import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a text: ");
        String s=in.nextLine();
        System.out.println("How many times you want to run this text using loop?");
        int n=in.nextInt();

        // For Loop:
        for(int i=1;i<=n;i++){
            System.out.println(s+" "+i);
        }

        // While loop:
//        int i=1;
//        while(i<=n){
//            System.out.println(s+" "+i);
//            i++;
//        }

        // Do While:
//        int i=1;
//        do{
//            System.out.println(s+" "+i);
//            i++;
//        }while (i<=n);
    }
}
