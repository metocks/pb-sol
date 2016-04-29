import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	
	static String flag1 = "word";
	static String flag2 = "localization";
	static String flag3 = "internationalization";
	static String flag4 = "pneumonoultramicroscopicsilicovolcanoconiosis";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int w = Integer.parseInt(sc.nextLine());
		String[] buff = new String [w];
		int i;
		for(i = 0 ; i < w ; i++){
			//System.out.println(i);
			buff[i] = sc.nextLine();
			//buff[i] = flag1;
		}
/*		buff[0] = flag1;
		buff[1] = flag2;
		buff[2] = flag3;
		buff[3] = flag4;*/
		
		String[] result = check(w,buff);
		
		for(i = 0 ; i < w ; i++){
			System.out.println(result[i]);
		}
	}

	private static String[] check(int w, String buff[]) {
		// TODO Auto-generated method stub
		String[] result = new String [w];
		for(int i = 0 ; i < w ; i++){
			//result[i] = buff[i];
			//System.out.println(result[i]);
			char[] temp = buff[i].toCharArray();
			if(10 >= temp.length)
				result[i] = String.valueOf(temp);
			else{
				result[i] = ""+temp[0]+""+(temp.length-2)+temp[temp.length-1];
			}
			
			
			//System.out.println(temp[0] + " " + temp[temp.length - 1]);
		}
		return result;
	}
}
