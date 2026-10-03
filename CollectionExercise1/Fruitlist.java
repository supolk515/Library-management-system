package CollectionExercise1;

import java.util.ArrayList;
import java.util.List;

public class Fruitlist {
    public static void main(String[] args){
        List<String> fruit = new ArrayList<>();
        fruit.add("apple");
        fruit.add("banana");
        fruit.add("pear");

        List<String> fruit2 = new ArrayList<>();
        for (String s : fruit){
            if (!s.contains("e")){
                fruit2.add(s);
            }
        }
        fruit = fruit2;
        System.out.println(fruit);
    }
}
