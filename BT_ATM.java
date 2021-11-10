package ATM;

import java.util.Scanner;

public class BT_ATM {
	public static void main(String[] args) {
		int count =0;
		int inputMoney;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.printf("Input Money: ");
			inputMoney = sc.nextInt();
		}while((inputMoney%10000)!=0);
		
		int[] money = {500000,200000,100000,50000,20000,10000};
		System.out.println("Output Money: ");
		for (int i=0;i<money.length;i++) {
			count = inputMoney/money[i];
			inputMoney = inputMoney - money[i]*count;
			if (count !=0){
				System.out.printf("%d: %d%n",money[i],count);
			}
			
		}
		
	}
}
