
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n,m,a;
		
		Scanner sc;
		sc = new Scanner(System.in);
		String temp = sc.nextLine();

		StringTokenizer token = new StringTokenizer(temp," ");
		
		n = Long.parseLong(token.nextToken());
		m = Long.parseLong(token.nextToken());
		a = Long.parseLong(token.nextToken());
		Long result = cal(n,m,a);
		System.out.print(result);
				
	}

	private static Long cal(long n, long m, long a) {
		// TODO Auto-generated method stub
		long x,y;
		if(n%a == 0)
			x = n/a;
		else
			x = n/a + 1;
		if(m%a == 0)
			y = m/a;
		else
			y = m/a + 1;
		
		return  (x*y);
		
	}

}
