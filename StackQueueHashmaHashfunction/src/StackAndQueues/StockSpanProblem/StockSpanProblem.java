package StackAndQueues.StockSpanProblem;

public class StockSpanProblem {
    public static void main(String[] args) {
        Stock stock= new Stock();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] span = stock.calculateSpan(prices);

        // Print the result
        System.out.print("Stock Span: ");
        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
