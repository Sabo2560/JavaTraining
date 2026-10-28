import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsFiltersMapCollectJava {
    static void main(String[] args) {

        //Streams : Class providing methods to process a Collection using mechanisms : Filter and Map...
        //Collections : representation of a group of elements or objects : List; HashMaps; Maps...
        // methods : Filter() , Map(), Sorted(), toList(), Count(), Distinct()
        //Creating a simple Collection :

        ArrayList<Integer> numbersList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numbersList.add(i+1);
        }
        System.out.println(numbersList);

        List<Product>productsList = new ArrayList<Product>();
        List<String> names = Arrays.asList("Meldre", "Sansara", "Jhonrtr", "Joffery", "Harry");
        List<String> longnames = new ArrayList<String>();

        longnames = names.stream().filter(str-> str.length() == 7).toList();

        productsList.add(new Product(1,"HP", 17000));
        productsList.add(new Product(2,"DELL", 26000));
        productsList.add(new Product(3,"Lenovo",13000));
        productsList.add(new Product(4,"Apple", 15000));
        productsList.add(new Product(5,"Sony", 30000));

        productsList.stream()
                        .filter(p->p.price > 25000)
                        .forEach(pr-> System.out.println(pr.price));

        names.stream().filter(str-> str.length() == 7).forEach(System.out::println);

        List<Integer>evenNumbersList = new ArrayList<Integer>();
        List<Integer>OddNumbersList = new ArrayList<Integer>();

        // Stream filter examples:
        evenNumbersList = numbersList.stream().filter(n ->n%2==0).toList();
        OddNumbersList = numbersList.stream().filter(n ->n%2==1).toList();
        System.out.println(evenNumbersList);
        System.out.println(OddNumbersList);
        numbersList.stream().filter(n ->n%2==0).forEach(System.out::println);

        List<String>vehicles= Arrays.asList("bus", "bicycle", "flight", "train");
        List<String>vehiclesListUpperCase = new ArrayList<String>();

        vehiclesListUpperCase = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
    }
}
