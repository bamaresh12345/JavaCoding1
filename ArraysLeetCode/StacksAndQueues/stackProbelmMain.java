package ArraysLeetCode.StacksAndQueues;

public class stackProbelmMain {

    public static void main(String[] args) {
        ImplementQueueUsingStacksLeetCode232 a = new ImplementQueueUsingStacksLeetCode232();

        a.push(7);
        a.push(3);
        a.push(4);

        System.out.println(a.pop());
        System.out.println(a.pop());

        a.push(5);

        System.out.println(a.pop());
        System.out.println(a.pop());
        System.out.println(a.pop());

    }
}
