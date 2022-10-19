import java.util.Scanner;

public class Switch_Statement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Operator?");
        char operation=in.next().charAt(0);

        System.out.println("Enter two numbers: ");
        int a=in.nextInt();
        int b=in.nextInt();
        switch(operation){
            case '+':
                System.out.println("Answer: ");
                System.out.println(a+b);
                break;
            case '-':
                System.out.println("Answer: ");
                System.out.println(a-b);
                break;
            case '*':
                System.out.println("Answer: ");
                System.out.println(a*b);
                break;
            case '/':
                System.out.println("Answer: ");
                System.out.println(a/b);
                break;
            default:
                System.out.println("Wrong operation! only 4 operations available right now!");
                break;
        }

    }
}
