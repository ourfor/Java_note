class Cry{
	public void cry(){
		System.out.println("大家好");
	}
}
public class E{
	public static void main(String args[]){
		Cry hello = new Cry(){
			public void cry(){
				System.out.println("大家好，祝工作顺利!");
			} 
		};
		hello.cry();
	} 
}
