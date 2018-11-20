import java.util.*;
public class JudgeBit {
    public static void main(String args[]){
        System.out.println("输入一个小于10位的整型数:");
        Scanner input = new Scanner(System.in);
        int inputNum = input.nextInt();
        for(int i=0;inputNum>=10||(inputNum=i)>10;i++){
            inputNum/=10;
        }
        System.out.println("这个数是一个"+(inputNum+1)+"位数");

    }
}
