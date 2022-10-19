import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        if(n==0){
            System.out.println("Zero");
        }
        else if(n<0){
            System.out.println("Negative Number");
        }
        else{
            System.out.println("Positive Number");
        }
    }
}
