public class Jump {
    public static void main(String[] args) {
        /*
        Jumping statements are control statements that transfer execution
        control from one point to another point in the program.
         There are two Jump statements that are provided in
         the Java programming language:

         Break statement.
          Continue statement.
         */

        // Jumping by levels:

        for(int i=0;i<=3;i++){
            one:{
            two:{
                three:{
                    System.out.println(i);
                    if (i == 0)
                        break one; // break to label one
                    if (i == 1)
                        break two; // break to label two
                    if (i == 2)
                        break three; // break to label three
                }
                System.out.println("after label three");
            }
                System.out.println("after label two");
            }
            System.out.println("after label one");
        }
    }
}
