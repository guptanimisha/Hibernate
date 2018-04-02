package deutsche;

public class ThreadTest2 extends Thread{

	public static void main(String[] args) {
		ThreadObj t1 = new ThreadObj("one");
		ThreadObj t2 = new ThreadObj("two");
		t1.start();
		t2.start();
	}
	
}

class ThreadObj extends Thread{
	
	private String s;
	
	ThreadObj(String s){
		this.s = s;
	}
	
public void run(){
	
	for(int i=0; i<2; i++){
		try{
			sleep(1000);
		}
		catch(InterruptedException ie){
			System.out.println("interruptedß");
		}
		yield();
		System.out.println(s);
	}
	}
}