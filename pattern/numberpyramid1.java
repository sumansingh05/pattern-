public class numberpyramid1 {
    public static void main(String[] args) {
        int n = 5;
        //for outer loop
        for(int i=1;i<=n;i++){
            //in inner loop
            //for spaCE
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            //for 1st part of number
            for(int k=i;k>=1;k--){
                System.out.print(k + " ");
            }
            //for second part of number
            for(int k=2;k<=i;k++){
                System.out.print(k + " ");
            }
            System.out.println();

        }
    }
}
