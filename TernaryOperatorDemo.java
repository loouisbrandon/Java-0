

public class TernaryOperatorDemo {

        public static void main(String[] args){
            int a = 1;
            int b = 2;
            int result;

            result = a < b ? a : b;
            //esse statement tem o mesmo resultado que esse aqui:
            //if(a < b) {
            //result = a;
            //}else {
            //result = b;
            //}

            System.out.println(result);
        }    
}
