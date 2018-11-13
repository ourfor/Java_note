import java.io.IOException;
public class F{
	public static void main(String args[]){
		try{
			methodA();
		}
		catch(IOException e){
			System.out.print("你好");
			return;
		}
		finally{
			System.out.println(" fine thanks");
		}
	}
	public static void methodA() throws IOException {
		throw new IOException();
	}
}
