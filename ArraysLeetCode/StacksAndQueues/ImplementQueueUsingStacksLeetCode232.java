package ArraysLeetCode.StacksAndQueues;

import java.util.Stack;

/* 232. Implement Queue using Stacks
Implement a first in first out (FIFO) queue using only two stacks. The implemented queue should support all the
functions of a normal queue (push, peek, pop, and empty).
push() , peek(), pop(), and  empty()

 Implement the MyQueue class:
void push(int x) --> Pushes element x to the back of the queue.
int pop() -->  Removes the element from the front of the queue and returns it.
int peek() --> Returns the element at the front of the queue.
boolean empty() -->  Returns true if the queue is empty, false otherwise.

Notes:
You must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty
operations are valid. Depending on your language, the stack may not be supported natively. You may simulate a stack using a list or deque
(double-ended queue) as long as you use only a stack's standard operations.

Example 1:

Input
["MyQueue", "push", "push", "peek", "pop", "empty"]
[[], [1], [2], [], [], []]
Output
[null, null, null, 1, 1, false]

Explanation
MyQueue myQueue = new MyQueue();
myQueue.push(1); // queue is: [1]
myQueue.push(2); // queue is: [1, 2] (leftmost is front of the queue)
myQueue.peek(); // return 1
myQueue.pop(); // return 1, queue is [2]
myQueue.empty(); // return false


 */
public class ImplementQueueUsingStacksLeetCode232 {

    private static Stack<Integer> stack1;
    private static Stack<Integer> stack2;


    public static void MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
    }

    public int pop() {
        peek();
        return stack2.pop();

    }

    public int peek() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }

        }
        return stack2.peek();

    }

    public boolean empty() {
        return stack1.empty() && stack2.empty();
    }

    public static void main(String[] args) {
        ImplementQueueUsingStacksLeetCode232 a = new ImplementQueueUsingStacksLeetCode232();

        MyQueue();

        a.push(7);
        a.push(3);
        a.push(4);

        System.out.println("1st pop--> " + a.pop());
        System.out.println("2nd pop--> " + a.pop());

        a.push(5);

        System.out.println("3rd pop--> " + a.pop());
        System.out.println("4th pop--> " + a.pop());


    }


}
