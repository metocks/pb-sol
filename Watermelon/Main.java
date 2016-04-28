import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		
		String result = check(w);
		System.out.println(result);
	}

	private static String check(int w) {
		// TODO Auto-generated method stub
		if(w == 2)
			return "NO";
		else if(w % 2 == 1)
			return "NO";
		else
			return "YES";
	}
}
