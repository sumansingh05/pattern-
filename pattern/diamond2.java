public class diamond2 {
    public static void main(String[] args) {
        int n = 5;
        //for first loop
        for(int i=1;i<=n;i++){
            //for space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //for star
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //for second half
        for(int i=n;i>=1;i--){
            //for space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //for star
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
