public class PrintRectangle {
    public static void main(String args[]){
        for(int i=1;i<=10;i++){
            for(int k=1;k<=10-i;k++)System.out.print(" ");
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=9;i>=1;i--){
            for(int k=1;k<=10-i;k++)System.out.print(" ");
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
