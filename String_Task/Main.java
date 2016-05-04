import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String buff=sc.nextLine();
		buff = buff.toLowerCase();
		char[] temp = buff.toCharArray();
		
		String result = check(temp);
		System.out.println(result);
	}

	private static String check(char[] temp) {
		// TODO Auto-generated method stub

		Set<Character> Vowels = new HashSet<Character>();
		Vowels.add('a');
		Vowels.add('o');
		Vowels.add('y');
		Vowels.add('e');
		Vowels.add('u');
		Vowels.add('i');
		
		String result = "";
		for(int i = 0 ; i < temp.length ; i++){
			if(Vowels.contains(temp[i]))
				continue;
			else
				result = result + "." + temp[i];
		}
		return result;
	}
}
