public class rhombusptrn {    
    public static void main(String[] args) {        
        int n = 5;
        //for outer loop
        for(int i=1;i<=n;i++){
            //for space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //for hollow rhombus
            for(int k=1;k<=n;k++){
                if(i == 1 || i == n || k == 1 || k == n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }                
            }
            System.out.println();                       
        }            
    }
}
