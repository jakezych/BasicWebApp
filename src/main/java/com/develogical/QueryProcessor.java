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
            String[] numbers = query.split(",");
            int max = Integer.parseInt(numbers[1]);
            for (int i = 2; i < numbers.length; i++) {
                int val = Integer.parseInt(numbers[i]);
                if (val > max) {
                    max = val;
                }
            }

        }
        if (query.toLowerCase().contains("what is plus")) {
            return "+";
        }
        return "";
    }
}
