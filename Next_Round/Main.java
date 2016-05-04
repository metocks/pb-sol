import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] buff = new int[n];
		for(int i = 0 ; i < n ; i++){
			buff[i] = sc.nextInt();
		}

		int result = check(n,k,buff);
		
		System.out.println(result);
	}

	private static int check(int n, int k, int[] buff) {
		// TODO Auto-generated method stub
		int result = 0;
		Arrays.sort(buff);
		//System.out.println(Arrays.toString(buff));
		for(int i = n-1 ; i >= 0 ; i--){
			if(result < k){
				//System.out.println("i : "+ i + " " + "result : " + result);
				if(buff[i] == 0){
					break;
				}
				result++;
				continue;
			}
			else if(result == k){
				int j = i;
				while(buff[i+1] == buff[j]){
					//System.out.println("i : "+ i + " " + " j : " + j + " " + "result : " + result);
					result++;
					if(j == 0)
						break;
					j--;
				}
				break;
			}
		}
		return result;
	}
	
}
