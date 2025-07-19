public class User {
    public static void main(String[] args) throws Exception {
        Stack st = new Stack(4);
        for (int i = 1; i <= 4; i++) {
            st.push(i * 10);
        }
        st.display();

    }
}
