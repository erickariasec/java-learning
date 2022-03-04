package map.excercise1;

import java.util.HashMap;
import java.util.Map;

public class Months {
    public static void main(String[] args) {

        Map<Integer, String> monthMap = new HashMap<Integer, String>();

        //          KEY   VALUE
        monthMap.put(1, "January");
        monthMap.put(2, "February");
        monthMap.put(3, "March");
        monthMap.put(4, "April");
        monthMap.put(5, "May");
        monthMap.put(6, "June");
        monthMap.put(7, "July");
        monthMap.put(8, "August");
        monthMap.put(9, "September");
        monthMap.put(10, "October");
        monthMap.put(11, "November");
        monthMap.put(12, "December");

        for(Map.Entry<Integer, String> entry : monthMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

    }
}
