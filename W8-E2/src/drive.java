
public class drive {
	public static void main(String args[]) {
		Runnable text = new textThread();
		Thread  t = new Thread(text, "text");
		t.start();
		
		
		Runnable text1 = new textThread();
		Thread t1 = new Thread(text1, "word1");
		t1.start();
	}
}
