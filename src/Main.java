import java.util.Arrays;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        String[] ingredients = {"Капуста","Сухарики", "Капуста", "Томат", "Майонез", "Сухарики", "Перец"};
        System.out.println("Для приготовления салата понадобиться:");
        System.out.print(duplicates (ingredients));
    }

    public static String duplicates (String[] ingredients) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.addAll(Arrays.asList(ingredients));
        return String.join(" ", set);
    }
}