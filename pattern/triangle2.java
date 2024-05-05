public class triangle2 {
    public static void main(String[] args) {
        int n = 5;
        //for first half        
        for(int i=1;i<=n;i++){
            //for space
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //for star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //for star
            for(int j=1;j<=i-1;j++){
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
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //for star
            for(int j=1;j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
