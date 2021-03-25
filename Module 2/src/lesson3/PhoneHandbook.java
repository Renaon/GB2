package lesson3;

import java.util.*;

public class PhoneHandbook {
    private HashMap<Long, String> phones = new HashMap<>();

    public void add(String surname, Long number){
        this.phones.put(number, surname);
    }

    public void get(String surname){
        ArrayList<Long> lucky = new ArrayList<>();
        for(Map.Entry<Long, String> pair : this.phones.entrySet()){
            if(pair.getValue().equals(surname)) lucky.add(pair.getKey());
        }
        show(lucky, surname);
    }

    private void show(ArrayList lucky, String surname){
        System.out.println(surname + ": ");
        for(int i = 0; i< lucky.size(); i++){
            System.out.println(lucky.get(i));
        }
    }
}
