public class DynamicStack extends Stack {
    DynamicStack(int size) {
        super(size);
    }

    DynamicStack() {
        super();
    }

    @Override
    public void push(int data) throws Exception {
        if (super.size() == super.capacity()) {
            int[] temp = new int[super.size() - 1];
            int idx = super.size() - 1;
            while (super.size() != 0) {
                temp[idx--] = super.pop();
            }

            initialize(temp.length * 2);

            for (int ele : temp) {
                super.push(ele);
            }
        }
        super.push(data);
    }
}
