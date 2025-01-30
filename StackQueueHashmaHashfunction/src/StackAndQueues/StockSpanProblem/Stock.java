package StackAndQueues.StockSpanProblem;

import java.util.Stack;

class Stock {
    public int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop elements from stack while stack is not empty
            // and the price at stack's top index is less than or equal to current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, span is (i + 1) (entire range till now)
            // Else, span is difference between current index and last higher price index
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index onto stack
            stack.push(i);
        }

        return span;
    }
}