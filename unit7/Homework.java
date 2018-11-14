import java.util.*;
public class Homework{
	public static void main(String args[]){
		Scanner reader=new Scanner(System.in);
		double sum=0;
		int m=0;
		while(reader.hasNextDouble()){
			double x=reader.nextDouble();
			assert x>=0&&x<=100:"非法的输入";
			m=m+1;
			sum=sum+x;
		}
		System.out.printf("%d个数的和为%f",m,sum);
		System.out.printf("%d个数的平均值为%f",m,sum/m);
	}

}
