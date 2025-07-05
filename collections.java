public class collections {
    
import java.util.ArrayList;
import java.util.List;

    List<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");
// nomes.add(123); // Isso daria um erro de compilação!
    String primeiroNome = nomes.get(0); // Não precisa de cast aqui
        System.out.println(primeiroNome); // Alice

import java.util.HashSet;
import java.util.Set;

    Set<Integer> idades = new HashSet<>();
        idades.add(25);
        idades.add(30);
        idades.add(25); // Este será ignorado, pois Set não permite duplicatas
            System.out.println(idades); // Saída pode ser algo como [25, 30] ou [30, 25] (ordem não garantida)

import java.util.HashSet;
import java.util.Set;

    Set<Integer> idades = new HashSet<>();
        idades.add(25);
        idades.add(30);
        idades.add(25); // Este será ignorado, pois Set não permite duplicatas
            System.out.println(idades); // Saída pode ser algo como [25, 30] ou [30, 25] (ordem não garantida)
}

