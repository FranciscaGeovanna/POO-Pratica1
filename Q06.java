public class Q06{
    public static void main(String [ ] args){
        int num = 6;
        int f = 1;
        
        if (num == 0 || num == 1){
            System.out.println("O fatorial de " + num + " é 1");
        }
        else{
            for(int i = 1; i <= num; i++){
                f *= i;
            }
            System.out.println("O resultado de (" + num + "!) é " + f);
        }
    }
}

