/*
 * author: ourfor
 * date: 2018 0913
 * discription: 遍历和复制数组，掌握使用Array类中的静态方法操作数组
 * aim: - 遍历数组
 * 	- 复制数组
 *
 */

import java.util.Arrays;

public class CopyArray {
	public static void main(String args[]){
		int[] a={1,2,3,4,500,600,700,800};
		int[] b,c,d;
		System.out.println(Arrays.toString(a));
		b=Arrays.copyOf(a,a.length);
		System.out.println(Arrays.toString(b));
		c=Arrays.copyOf(a,4);
		System.out.println(Arrays.toString(c));
		d=Arrays.copyOfRange(a,a.length-4,a.length);
		System.out.println(Arrays.toString(d));
		c[c.length]=-100;
		int[] Tom=Arrays.copyOf(c,6);
		System.out.println(Arrays.toString(Tom));
		d[d.length]=-200;
		System.out.println(Arrays.toString(a));
		int[] Jerry=Arrays.copyOfRange(d,1,8);
		System.out.println(Arrays.toString(Jerry));

	}
}
