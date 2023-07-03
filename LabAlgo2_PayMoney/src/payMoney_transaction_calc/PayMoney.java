package payMoney_transaction_calc;

public class PayMoney {
	private int[] transactions;

    public PayMoney(int size) {
        transactions = new int[size];
    }

    public void addTransaction(int index, int amount) {
        transactions[index] = amount;
     }
    
    
    public int findTargetTransaction(int target) {
        int transactionCount = 0;
        int sum = 0;

        for (int i = 0; i < transactions.length; i++) {
            sum += transactions[i];
            transactionCount++;

            if (sum >= target) {
                return transactionCount;
            }
        }

        return -1;
    }

}
