//课本上面的java程序例子源码
//author:ourfor data:20180902
package first;

public class Hello{
	public static void main (String args[]){
		System.out.println("大家好！");
		System.out.println("Nice to meet you");
		Student stu = new Student();
		stu.speak("We are students");
	}
}

class Student {
	public void speak(String s) {
		System.out.println(s);
	}
}
