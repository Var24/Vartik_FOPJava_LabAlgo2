package payMoney_DriverClass;
import java.util.Scanner;

import payMoney_transaction_calc.PayMoney;

public class DriverClass {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the size of the transaction array: ");
	        int size = scanner.nextInt();
	        PayMoney payMoney = new PayMoney(size);

	        System.out.print("Enter the values of the array: ");
	        for (int i = 0; i < size; i++) {
	            int transaction = scanner.nextInt();
	            payMoney.addTransaction(i, transaction);
	        }

	        System.out.print("Enter the total number of targets that need to be achieved: ");
	        int targetCount = scanner.nextInt();

	        for (int i = 0; i < targetCount; i++) {
	            System.out.print("Enter the value of target: ");
	            int target = scanner.nextInt();

	            int achievedTransaction = payMoney.findTargetTransaction(target);

	            if (achievedTransaction != -1) {
	                System.out.println("Target achieved after " + achievedTransaction + " transactions");
	            } else {
	                System.out.println("Given target is not achieved");
	            }
	        }

	        scanner.close();
	    }


}
