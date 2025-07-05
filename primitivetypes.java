//esses 6 tipos primitivos armazenam apenas numeros
//BYTE valor minimo de -128 e máximo de 127
//SHORT valor minimo de -32,768 e máximo de 32,767
//INT valor minimo de -2(31) e máximo de 2(32)-1
//LONG vamos minimo de -2(62) e máximo de 2(63)-q
//FLOAT para salvar numeros mais precisos 32bit
//DOUBLE para salvar numeros mais precisos 64bit
//======================//
//BOOLEAN usa apenas dois valores (true) ou (false)
//CHAR é um 16 bit unicode que serve para characteres

public class primitivetypes {
    
    public static void main(String args[])
    {
        char a = 'A';

        byte b = 2;

        short c = 22;

        int d = 45;

        float e = 5.12345f;

        double f = 4.6829523353d;

        boolean g = true;

        //tudo que eu quiser printar no console terminal
        System.out.println("char: " + a);
        System.out.println("byte: " + b);
        System.out.println("short: " + c);
        System.out.println("int: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("boolean: " + g);
    }

}
