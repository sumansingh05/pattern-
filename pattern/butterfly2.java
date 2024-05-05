public class butterfly2 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=n;i>=1;i--){
            //for star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //for space
            for(int k=1;k<=(n-i)*2;k++){
                System.out.print("  ");
            }
            //for star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
