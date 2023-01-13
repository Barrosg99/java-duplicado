import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        String[] list1 = new String[] { "Morango", "Uva", "Acerola","Manga" };
        String[] list2 = new String[] { "Pêra", "Caju", "Morango", "Kiwi" };
        List<String> duplicados = new ArrayList<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    duplicados.add(list1[i]);
                }
            }
        }
        System.out.println(duplicados);
    }
}
