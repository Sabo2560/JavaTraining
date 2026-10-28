import java.util.HashMap;

public class HashMapAndMapsJava {
    static void main(String[] args) {
        HashMap<String,String> countries = new HashMap<String,String>();

        // adding a key and value
        // Hashmap stores an organised Array or keys and values
        //takes two inputs <String,Integer>(); accepts wrapper class data types
        // usage examples :
        //<name, email> = <String, String> ; <user, id > = <String, Integer>;
        countries.put("Morocco", "Rabat");
        countries.put("USA", "Washigton");
        countries.put("India", "New Delhi");
        countries.put("Russia", "Moscow");
        countries.put("China", "Beijing");

        System.out.println(countries);
        
        // remove a key value pair
        //countries.remove("USA");

        //get a value using its key
        System.out.println(countries.get("Russia"));

//        delete all
//        countries.clear();
//System.out.println(countries);

        System.out.println(countries.containsKey("USA"));
        System.out.println(countries.containsKey("England"));

        System.out.println(countries.containsValue("Rabat"));
        System.out.println(countries.containsValue("HashMaps"));
        //getting the size of the Hashmap
        System.out.println(countries.size());

        for (String i : countries.keySet()) {
            System.out.print(i + "\t" + "= ");
            System.out.println(countries.get(i));
        }

    }
}
