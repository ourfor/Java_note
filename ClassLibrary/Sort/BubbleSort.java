package Sort;
public class BubbleSort{
	public void Sort(double[] array){
		for(int i=array.length;i<=array.length;i--){
			for(int j=0;j<i;i++){
				if(array[j]>array[j+1]) {
					double temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}
		}
	}
}
