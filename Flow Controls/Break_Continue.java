public class Break_Continue {
    public static void main(String[] args) {
        /*
        BREAK:

         Suppose you implimented a loop to print / do something for 10 times.
         Now you want to terminate the loop when iteration reaches to 5 times(will do or print for 4 times),
         without editing the loop conditions!

         How can you do this?

         Just use an if statement inside the body and write a condition for the statement like:
         if(i==5) then on the if body, use break!

         That's pretty much it.
         */

        // Example:

//        for (int i = 1; i <= 10; ++i) {
//
//            // if the value of i is 5 the loop terminates
//            if (i == 5) {
//                break;
//            }
//            System.out.println(i);
//        }

            /*
            Now suppose you written a program where you implemented a loop to print 1 to 10 values serially.
            But you want to skip some numbers between them.

            How can you do that?

            Let's se below:
             */
            for (int j = 1; j <= 10; ++j) {

                // if value of i is between 4 and 9
                // continue is executed
                if (j > 4 && j < 9) {
                    continue;
                }
                System.out.println(j);
            }

    }
}
