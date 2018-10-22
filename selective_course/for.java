public class for {
        public static void main(String argv[]) {
        System.out.println("Nice to meet you!");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " * " + i + " = " + i * j + " ");
            }
            System.out.println();
        }

        int sum = 0;

        for (int i = 1; i < 100; i++) {
            if (i % 3 != 0) sum += i;
        }
        System.out.println("1到100之间不能整出3的数之和为：" + sum);

        sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (sum > 20) break;
            sum += i;
        }
        for(int i=1;i<=10;i++){
            for(int k=0;k<=i-1;k++) System.out.print(" ");
            for(int j=1;j<=16-2 * i;j++){
                System.out.print("*");
            }
            for(int k=0;k<=i;k++) System.out.print(" ");
            System.out.println();
        }

        int num=1;
        int count=0;
        if(num>=0&&num<=999999999){
            while(num!=0){
                count++;
                num/=10;
            }
            System.out.println("它是小"+count+"位的数！");
        }
        else {
            System.out.println("输入有误!");
        }
    }
}
}
