public class Q04 {
    public static void main (String [ ] args){
        int num = 3;
        for (int i = 2; i < num; i++){
            if (num % i != 0){
                System.out.println("O número é primo!");
                break;
            }
            else{
                System.out.println("O número não é primo!");
                break;
            }
        }
    }
}
