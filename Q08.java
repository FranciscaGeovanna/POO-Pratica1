public class Q08 {
    public static void main(String [ ] args) {
        int l = 4; 

        for (int i = 1; i <= l; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
