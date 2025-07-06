

public class TwoDimensionalArray {
    
    public static void main(String[] args){
        int arr[][] = {{2, 7, 9}, {3, 6, 1}, {7, 4, 2}};
            //sendo que dentro do array posso buscar o elemento do index [0] e coluna [1]
            // pegando assim o numero 7
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    
    }
} 
