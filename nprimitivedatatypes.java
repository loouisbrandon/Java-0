public class nprimitivedatatypes {
// NonPrimitiveDataTypes
    public static void main(String[] args){
        String str = "test";
        System.out.println("String is:"+ str);

        String str1 = new String("test");
        System.out.println("Another string: "+str1);

        int arr [];
        arr = new int[2];
        arr[0] = 0;//ele roda pegando a posição dos valores
        arr[1] = 1;
        arr[2] = 2; 
        // posição 0 como 1
        System.out.println(arr);
        System.out.println(arr[0]);//regra de posicionamento de str. 
        
    }
    
}
