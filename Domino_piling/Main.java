import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int result = check(m,n);
		
		System.out.println(result);
	}

	private static int check(int m, int n) {
		// TODO Auto-generated method stub
		int result = 0;
		if(m%2 == 0){
			result = (m/2) * n;
		}
		else{
			result = ((m/2) * n) + (n/2);
		}
		return result;
	}

}
