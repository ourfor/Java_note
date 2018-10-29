import java.util.*;
public class main {
    public static void main(String args[]){
        System.out.println("Nint to meet you");

        double student[]=new double[5];
        for(double i:student){
            System.out.println(""+i);
        }

        String[] subjects =new String[5];
        subjects[0]="Oracle";
        subjects[1]="PHP";
        subjects[2]="Linux";
        subjects[3]="Java";
        subjects[4]="HTML";
        System.out.println("数组中第5个元素为："+subjects[4]);
        for(int i=0;i<5;i++) System.out.println(""+subjects[i]);
        for(String ch:subjects) System.out.println(""+ch);

        int[] scores={78,91,84,68};
        for(int i=0;i<scores.length;i++) System.out.println("数组中第"+(i+1)+"个元素的值为"+scores[i]);

        String[] hobbys={"sports","game","movie"};
        System.out.println("循环输出数组中的元素：");
        for(int i=0;i<hobbys.length;i++) System.out.println("数组中第"+(i+1)+"个元素的值为"+hobbys[i]);

        int[] nums=new int[] {61,23,4,74,13,148,20};
        int max_nums=0;
        int min_nums=nums[0];
        double average_nums=0;
        for(int i:nums){
            max_nums=i>max_nums?i:max_nums;
            min_nums=i<min_nums?i:min_nums;
            average_nums+=i;
        }

        average_nums/=nums.length;

        System.out.println("数组元素的最大值为："+max_nums);
        System.out.println("数组元素的最小值为："+min_nums);
        System.out.println("数组元素的平均值为："+average_nums);
    }
}
/*
- 数组名
- 数组维度

Java中的数组：
> 静态数组的优点：
- 速度快
- 开销小
- 数组越界
- 内存管理



预分配
与C语言的异同
增强的for循环

 */
