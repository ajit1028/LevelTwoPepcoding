public class User {
    public static void main(String[] args) throws Exception {
        DynamicStack st = new DynamicStack(8);
        for (int i = 1; i <= 10; i++) {
            st.push(i * 10);
        }
        st.display();

    }
}
