
public class ImplicitDataTypeConversion {
//pelo que entendi, dentro dessa conversão, como se fossem caixas, voce coloca uma sobre a outra dentro da conversão
//colocar o smaller range value em um larger range value, voce sacrifica um valor, algo assim. 
//fazendo isso, voce ta fazendo um implicit datatype conversion

    public static void main(String[] args)
    {
        int a = 100;
        System.out.println("Int representation: "+a);

        long b = a;
        System.out.println("Long representation "+b);

        float c = b;
        System.out.println("Float representation "+c);
    }
}
