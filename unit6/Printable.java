interface Printable{
	final int MAX=100;
	void add();
	float sum(float x,float y);
}

class A implements Printable{
	public void add(){
		System.out.println("I am an add function, I can add two function");
	}
	public float sum(float x,float y){
		System.out.println("I am an sum function, I am the sum of two numbers");
		return x+y;
	}
}
