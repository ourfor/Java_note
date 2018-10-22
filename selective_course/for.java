public class for {
    public static void main(String argv[]){
        System.out.println("Nice to meet you!");

        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" * "+i+" = "+i * j+" ");
            }
            System.out.println();
        }

        int sum=0;

        for(int i=1;i<100;i++){
            if(i%3!=0) sum+=i;
        }
        System.out.println("1到100之间不能整出3的数之和为："+sum);

        sum=0;
        for(int i=1;i<=10;i++){
            if(sum>20) break;
            sum+=i;
        }
        System.out.println("1到10之间的数之和大于20："+sum);
    }
}
