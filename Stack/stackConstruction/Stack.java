public class Stack {
    private int[] arr;
    private int tos;
    private int NoOfElements;
    private int MaxCapacity;

    Stack(int size) {
        initialize(size);
    }

    Stack() {
        this(10);
    }

    public void display() {
        for (int i = tos; i >= 0; i--) {
            System.out.print(this.arr[i] + " ");
        }
    }

    public int capacity() {
        return this.MaxCapacity;
    }

    public int size() {
        return this.NoOfElements;
    }

    protected void initialize(int size) {
        this.NoOfElements = 0;
        this.MaxCapacity = size;
        this.arr = new int[this.MaxCapacity];
        this.tos = -1;
    }

    private void overflowException() throws Exception {
        if (this.NoOfElements == this.MaxCapacity) {
            throw new Exception("StackIsOverFlow");
        }
    }

    private void underflowException() throws Exception {
        if (this.NoOfElements == 0) {
            throw new Exception("StackIsunderFlow");
        }
    }

    public void push(int data) throws Exception {
        overflowException();
        this.arr[++this.tos] = data;
        this.NoOfElements++;
    }

    public int peek() throws Exception {
        underflowException();
        return this.arr[this.tos];
    }

    public int pop() throws Exception {
        underflowException();
        int rv = this.arr[this.tos--];
        this.NoOfElements--;
        return rv;
    }
}