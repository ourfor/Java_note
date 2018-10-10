import Sort.BubbleSort;
public class Calling{
	public static void main(String args[]){
		double a[]={3.2,5.4,6.2,7.9};
		BubbleSort S=new BubbleSort();
		S.Sort(a);
		for(double i:a) System.out.println(""+i);
	} 
}
