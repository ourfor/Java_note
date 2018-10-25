abstract class A {
	abstract int min(int x,int y);
	int max(int x,int y){
		return x>y?x:y;
	}
		
}

class B extends A{
	int min(int x,int y){
		return x>y?y:x;
	}
	double min(double x,double y){
		return x>y?y:x;
	}
	double max(double x,double y){
		return x>y?x:y;
	}
}

