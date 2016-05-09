import java.util.Scanner;
import java.util.Stack;


public class Special_Str {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine();
		
		boolean result = check(temp);
		System.out.println(result);
	}

	private static boolean check(String temp) {
		// TODO Auto-generated method stub
		char[] buff = temp.toCharArray();
		Stack st = new Stack();
		for(int i = 0 ; i < temp.length(); i++){
			if(st.empty()){
				st.push(buff[i]);
			}
			else{
				char check_top = (char) st.peek();
				if(check_top == buff[i])
					st.pop();
				else
					st.push(buff[i]);
				
			}
		}
		if(st.size() == 0)
			return true;
		else
			return false;
	}

}
