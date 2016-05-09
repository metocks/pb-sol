import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int result = check(n);
		
		System.out.println(result);
	}

	private static int check(int n) {
		// TODO Auto-generated method stub
		int result = 0;
		if(n%3 == 0){
			result = (n/3)*2;
		}
		else{
			result = (n/3)*2 + 1;
		}
		return result;
	}

}
