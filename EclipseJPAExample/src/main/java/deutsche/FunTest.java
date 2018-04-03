package deutsche;


public class FunTest {

	static int fun (int n){
		if (n==2){
			return 0;
		}else {
			return fun (n-1)+fun (n-2);

		}
	}
	public static void main(String[] args){
	  fun (7);
	}

}
