public class numberpyramid {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1;i<=5;i++){
            //for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for number
            for(int k=1;k<=i;k++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
