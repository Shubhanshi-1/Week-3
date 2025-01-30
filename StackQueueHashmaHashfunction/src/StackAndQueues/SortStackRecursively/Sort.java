package StackAndQueues.SortStackRecursively;


    import java.util.Stack;

    class Sort {

        // Function to sort the stack
        public  void sortStack(Stack<Integer> stack) {
            if (!stack.isEmpty()) {
                int temp = stack.pop();
                sortStack(stack);
                insertSorted(stack, temp);
            }
        }

        // Function to insert an element in a sorted manner
        private static void insertSorted(Stack<Integer> stack, int value) {
            if (stack.isEmpty() || stack.peek() <= value) {
                stack.push(value);
                return;
            }

            int temp = stack.pop();
            insertSorted(stack, value);
            stack.push(temp);
        }


    }


