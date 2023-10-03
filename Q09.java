public class Q09 {
    public static void main (String [ ] args){
        int salario = 1500;

        System.out.println("Salário atual: R$" + salario);

        if (salario <= 280){
            int aumento = (salario*20 / 100) + salario;
            System.out.println("Percentual de aumento: 20%");
            System.out.println("Valor do aumento: R$" + (aumento - salario));
            System.out.println("Novo salário: R$" + aumento);
        }
        else if (salario > 280 && salario <= 700){
            int aumento = (salario*15 / 100) + salario;
            System.out.println("Percentual de aumento: 15%");
            System.out.println("Valor do aumento: R$" + (aumento - salario));
            System.out.println("Novo salário R$" + aumento);
        }
        else if (salario > 700 && salario <= 1500){
            int aumento = (salario*10 / 100) + salario;
            System.out.println("Percentual de aumento: 10%");
            System.out.println("Valor do aumento: R$" + (aumento - salario));
            System.out.println("Novo salário: R$" + aumento);
        }
        else{
            int aumento = (salario*5 / 100) + salario;
            System.out.println("Percentual de aumento: 5%");
            System.out.println("Valor do aumento: R$" + (aumento - salario));
            System.out.println("Novo salário: R$" + aumento);
        }
    }
}
