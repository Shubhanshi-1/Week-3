package StackAndQueues.SortStackRecursively;

import java.util.Stack;

public class SortStackRecursively {

    public static void main(String[] args) {
        Sort sort = new Sort();
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(5);

        System.out.println("Original Stack: " + stack);
        sort.sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
