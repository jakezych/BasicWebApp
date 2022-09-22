package com.develogical;
import java.util.List;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        if (query.toLowerCase().contains("hello world")) {
            return "hello to you too";
        }
        if (query.toLowerCase().contains("what is your name")) {
            return "jzpaspsk";
        }
        if (query.toLowerCase().contains("numbers is largest")) {
            String[] n = query.split(":");
            String[] numbers = n[1].split(",");
            int max = Integer.parseInt(numbers[0].trim());
            for (int i = 1; i < numbers.length; i++) {
                int val = Integer.parseInt(numbers[i].trim());
                if (val > max) {
                    max = val;
                }
            }
            return Integer.toString(max);
        }
        if (query.toLowerCase().contains("what is plus")) {
            String[] all = query.split(" ");
            return Integer.toString(Integer.parseInt(all[all.length - 1]) + Integer.parseInt(all[all.length - 3]));
        }
        if (query.toLowerCase().contains("what is multiplied")) {
            String[] all = query.split(" ");
            return Integer.toString(Integer.parseInt(all[all.length - 1]) * Integer.parseInt(all[all.length - 4]));
        }
        return "";
    }
}
//=info method=GET path="/api?q=f10aad60:%20what%20is%206%20plus%208"
// %20what%20is%204%20multiplied%20by%203
