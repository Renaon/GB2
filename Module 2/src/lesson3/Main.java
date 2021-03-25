package lesson3;

import java.util.ArrayList;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args){
        unique();

        PhoneHandbook note = new PhoneHandbook();
        note.add("Jameson", 952298463L);
        note.add("Jameson", 8746321117L);
        note.add("Addams", 6463445675L);
        note.add("Morris", 98754154987L);
        note.add("Morris", 9522984653L);
        note.add("Black", 9522984653L);
        note.add("Black", 845576164L);
        note.add("Williams", 698765165L);
        note.add("Gabe", 782463198L);
        note.add("Chair", 9134975216L);
        note.showOnce();
        note.get("Jameson");
    }


    private static void unique(){
        ArrayList<String> words = new ArrayList<>();
        words.add("яблоко");
        words.add("блок");
        words.add("стул");
        words.add("яблоко");
        words.add("апельсин");
        words.add("пиноккио");
        words.add("мультфильм");
        words.add("яблоко");
        words.add("книга");
        words.add("книга");
        words.add("стул");
        words.add("пиноккио");

        ArrayList<String> un = new ArrayList<>();
//к сожалению, не помню, как выглядит поиск дубликатов, потому переберу циклами
        boolean flag = false;
        for(int j = 0; j<words.size(); j++){
            flag = true;
            for(int i = j+1; i<words.size(); i++){

                if(words.get(i) == words.get(j)){
                    flag = false;
                    break;
                }
            }
            if(flag) un.add(words.get(j));
        }

        for(String key: un){
            System.out.println(key);
        }
    }
}