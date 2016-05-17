import java.util.ArrayList;
import java.util.Scanner;


public class Main extends Thread{

	/**
	 * @param args
	 */
	int case_number;
	int n, k;
	int[] stock;
	Main(int i, int n, int k, int[] stock){
		this.case_number = i;
		this.n = n;
		this.k = k;
		this.stock = stock;
	}
	public void run(){
		
		/*System.out.print("Case Number : " + case_number + " N : " + n + " K : " + k + " Stock Info : " );
		for(int i = 0 ; i < n ; i++)
			System.out.print(stock[i]+ " ");
		System.out.println();*/
		
		boolean result;
		result = check();
		System.out.println("Case #"+case_number);
		System.out.println(result);
		
	}
	
	public boolean check(){
		//easy version
		int cnt = 0;
		ArrayList <Integer> buff = new ArrayList<Integer>();
		for(int i = n-1 ; i >= 0 ; i--){
			if(buff.size() == 0){
				buff.add(stock[i]);
				cnt++;
			}
			else{
				if(cnt == k){
					return true;
				}
				else{
					//System.out.println("Cnt : " + cnt + " Stock[i] : " + stock[i] + " ArrayList size : " + buff.size() + " ArrayList get" + buff.get(0));
					for(int j = 0 ; j < cnt ; j++){
						if(buff.get(j) < stock[i]){
							buff.remove(j);
							cnt--;
							break;
						}
					}
					buff.add(stock[i]);
					cnt++;
				}
				//System.out.println("Check ArrayList : " + buff.get(cnt));
			}
		}
		//System.out.println("Check Method!!" + case_number);
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Thread> thread_check = new ArrayList<Thread>();
		Scanner sc = new Scanner(System.in);
		Thread thread;
		int t = sc.nextInt();
		
		for(int i = 0 ; i < t ; i++){
			int[] buff = new int[2];
			buff[0] = sc.nextInt();
			buff[1] = sc.nextInt();
			String[] stock_buff = new String[buff[0]];
			int[] stock_buff_number = new int[buff[0]];
			//System.out.println("T : " + t + " N : " + buff[0] + " K : " + buff[1]);
			sc.nextLine();
			String str = sc.nextLine();
			stock_buff = str.split(" ");
			for(int j = 0 ; j < buff[0] ; j++){
				stock_buff_number[j] = Integer.parseInt(stock_buff[j]);
			}
			thread = new Main(i+1,buff[0],buff[1],stock_buff_number);
			thread.start();
			thread_check.add(thread);
		}
		
		for(int i = 0; i < t ; i++){
			thread = thread_check.get(i);
			
			try {
				thread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Main End!");
	}

}
