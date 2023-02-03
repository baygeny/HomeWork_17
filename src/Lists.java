import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Lists {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Ukraine");
        countries.add("Hungary");
        countries.add("Italy");
        countries.add("Spain");
        countries.add("Germany");
        countries.add("Austria");
        countries.add("Netherlands");
        countries.add("Belgium");
        countries.add("Sweden");
        countries.add("Denmark");

        Iterator<String>iterator = countries.iterator();
        System.out.print("Collection of countries:");
        while (iterator.hasNext()) {
            System.out.print(" "  + iterator.next());
        }
       /* System.out.println("");
        System.out.print("Collection of countries after the sorting:");
        Collections.sort(countries);
        iterator = countries.iterator();
        while (iterator.hasNext()) {
            System.out.print(" "  + iterator.next());
        }*/
    }
}

