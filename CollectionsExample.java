import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionsExample {

    public static void main(String[] args) {
        
        // Exemplo com List
        List<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");
        // nomes.add(123); // Isso daria um erro de compilação!

        String primeiroNome = nomes.get(0); // Não precisa de cast aqui
        System.out.println(primeiroNome); // Alice

        // Exemplo com Set
        Set<Integer> idades = new HashSet<>();
        idades.add(25);
        idades.add(30);
        idades.add(25); // Este será ignorado, pois Set não permite duplicatas
        System.out.println(idades); // Saída pode ser algo como [25, 30] ou [30, 25] (ordem não garantida)
    }
}
