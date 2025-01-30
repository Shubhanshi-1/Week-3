package HashmapAndHashFunction.CustomHashMap;

 public class CustomHashMap {
     public static void main(String[] args) {
         HashMap hashmap=  new HashMap();
        // CustomHashMap<> map = new CustomHashMap<>();
         hashmap.put("Alice", 25);
         hashmap.put("Bob", 30);
         hashmap.put("Charlie", 22);

         System.out.println("Value for 'Alice': " + hashmap.get("Alice"));
         System.out.println("Value for 'Bob': " + hashmap.get("Bob"));

         hashmap.remove("Bob");
         System.out.println("Value for 'Bob' after removal: " + hashmap.get("Bob"));

         hashmap.display();
     }
 }