import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class SpecialINFac {
	static HashMap<Integer, Integer> hm = new HashMap();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 0 ; i < N ; i++){
			factorization(N-i);
		}
		//System.out.println(hm);
		
		Set<Integer> key = hm.keySet();
		for(Iterator it = key.iterator() ; it.hasNext();){
			int num = (int) it.next();
			int value = hm.get(num);
			System.out.print(num + "^" + value);
			if(it.hasNext()){
				System.out.print("*");
			}
		}
	}

	private static void factorization(int N) {
		// TODO Auto-generated method stub
		int p = 2;
		int cnt = 1;
		
		while(N != 1){
			if(N%p == 0){
				N = N/p;
				if(hm.containsKey(p)){
					int cnt_buff = hm.get(p);
					cnt_buff++;
					hm.put(p,cnt_buff);
				}
				else{
					hm.put(p, cnt);
				}
				p = 2;
			}
			else{
				p++;
			}
		}
	}

}
