import java.io.*;
import java.util.*;

public class call_B {
	public static void main(String argv[]){
		System.out.println("输入两个数，我能输出最大值和最小值:");
		B b=new B();
		Scanner input=new Scanner(System.in);
		double input_one=0;
		double input_two=0;
		input_one=input.nextDouble();
		input_two=input.nextDouble();
		System.out.println("在输入的两个数中，最大值为:"+b.max(input_one,input_two)+" 最小值为:"+b.min(input_one,input_two));
	}
}
