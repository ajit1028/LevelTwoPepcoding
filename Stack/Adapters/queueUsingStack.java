import java.util.LinkedList;

//Leetcode 232 
//in this question push in o(1) and pop o(1).
//no follow up question is do push in o(n) and pop in o(1).
public class queueUsingStack {

    LinkedList<Integer> st = new LinkedList<>();
    LinkedList<Integer> temp = new LinkedList<>();

    public queueUsingStack() {

    }

    public void push(int x) {
        st.addFirst(x);
    }

    public void swapData(LinkedList<Integer> st1, LinkedList<Integer> st2) {
        while (st1.size() != 0) {
            st2.addFirst(st1.removeFirst());
        }
    }

    public int pop() {
        swapData(st, temp);
        int rv = temp.removeFirst();
        swapData(temp, st);
        return rv;
    }

    public int peek() {
        swapData(st, temp);
        int rv = temp.getFirst();
        swapData(temp, st);
        return rv;
    }

    public boolean empty() {
        return st.size() == 0;
    }
}
