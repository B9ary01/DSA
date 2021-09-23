public class Patterns {
    public static void main(String[] args){
        pattern1(4);
        System.out.println("--this is pat 1----");

        pattern2(4);
        System.out.println("---this is pat 2---");

        pattern3(4);
        System.out.println("---this is pat 3---");

        pattern4(4);
        System.out.println("----this is pat 4--");

        pattern5(4);
        System.out.println("----this is pat 5--");


        pattern7(4);
        System.out.println("----this is pat 7--");

        pattern28(6);
        System.out.println("----this is pat 28--");


        pattern30(5);
        System.out.println("----this is pat 30--");

        pattern17(5);
        System.out.println("----this is pat 17--");


        pattern31(5);
        System.out.println("----this is pat 31--");

        pattern32(5);
        System.out.println("----this is pat 32--");

        pattern90(5);
        System.out.println("----this is pat 90--");

        pattern91(5);
        System.out.println("----this is pat 91--");
    }
    static void pattern1(int n){
        for(int row=0;row<=n;row++){
            for(int col=0;col<n;col++){
                System.out.print("* ");
            }System.out.println("");

        }

    }

    static void pattern2(int n){
        for(int row=0;row<=n;row++){
            for(int col=0;col<row;col++){
                System.out.print("* ");
            }System.out.println("");

        }

    }

    static void pattern3(int n){
        for(int row=1;row<=n;row++){
            for(int col=0;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }


    static void pattern4(int n){
        for(int row=1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print(row+" ");
            }
            System.out.println("");
        }

    }


    static void pattern5(int n){
        for(int row=0;row<=n;row++){
            for(int col=1;col<=row+1;col++){
                System.out.print(col+" ");
            }
            System.out.println("");
        }
    }


    static void pattern7(int n) {
        for (int row = 0; row < 2 * n; row++) {
           int totalColInRow = row > n ? 2 * n - row  : row;
            for (int col = 0; col < totalColInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }



    static void pattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColInRow = row > n ? 2 * n - row  : row;
            int noOfSpaces=n-totalColInRow;
            for (int s = 0; s < noOfSpaces ; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRow ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern30(int n) {
        for (int row = 0; row <= n; row++) {
            for (int  space= 0; space<n-row ; space++) {
                System.out.print("  ");
            }
            for (int  col= row; col>=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }


    static void pattern17(int n) {
        for (int row = 0; row <= 2*n; row++) {
            int cc=row>n?2*n-row:row;
            for (int  space= 0; space<n-cc ; space++) {
                System.out.print("  ");
            }
            for (int  col= cc; col>=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <=cc ; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }



    static void pattern31(int n) {
        n=2*n;
        for (int row = 0; row <= n; row++) {


            for (int col = 0; col <=n ; col++) {
                int atEveryIndex=Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }


    static void pattern32(int n) {
        int originalN=n;
        n=2*n;
        for (int row = 0; row <= n; row++) {


            for (int col = 0; col <=n ; col++) {
                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    static void pattern90(int n){
        for (int row=1;row<=n;row++){
            for(int col=n;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern91(int n){
        for(int row=1;row<=n;row++){
            for(int col=0;col<=n-row;col++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }


}





