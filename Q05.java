public class Q05 {
    public static void main(String[] args) {
        int n = 9; 
        int num1 = 0;
        int num2 = 1;

        System.out.print("Sequência de Fibonacci: ");

        for (int i = 0; i < n; i++) {
            System.out.print(num1 + " ");

            int proxNum = num1 + num2;
            
            num1 = num2;
            num2 = proxNum;
        }
    }
}

