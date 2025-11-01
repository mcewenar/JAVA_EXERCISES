package co.com.ias;



public class DiamondAsterisks {

    public void diamondPattern(int n) {

        for(int i = 1; i <= n; i++ ) {
            //Blank space:
            for (int j = i; j < n; j++) {
                System.out.println(" ");

            }
            //asterisk
            for (int j = 1; j <= (2* i - 1); j++) {
                System.out.println("*");
            }

            System.out.println();



        }

        for(int i = n -1; i >= 1; i--) {
            //spaces before the asterisk
            for(int j = n; j> i; j--) {
                System.out.println(" ");
            }

            //Asterisk
            for(int j = 1; j<= (2*i-1); j++) {
                System.out.println("*");
            }

            System.out.println();

        }



    }

}
