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
        /*
        if (query.toLowerCase().contains("numbers is the largest")) {
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
        */
        if (query.toLowerCase().contains("what is plus")) {
            String[] all = query.split(" ");
            return Integer.toString(Integer.parseInt(all[all.length - 1]) + Integer.parseInt(all[all.length - 3]));
        }
        if (query.toLowerCase().contains("what is multiplied")) {
            String[] all = query.split(" ");
            return Integer.toString(Integer.parseInt(all[all.length - 1]) * Integer.parseInt(all[all.length - 4]));
        }
        if (query.toLowerCase().contains("is both a square and a cube")) {
            String[] n = query.split(":");
            String[] numbers = n[1].split(",");
            for (int i = 0; i < numbers.length; i++) {
                int number = Integer.parseInt(numbers[i]);
                double result2 = Math.pow(number, 1.0 / 2);
                double result3 = Math.pow(number, 1.0 / 3);
                if ((result2 == Math.floor(result2)) && !Double.isInfinite(result2)) {
                    if ((result3 == Math.floor(result3)) && !Double.isInfinite(result3)) {
                        return Integer.toString(number);
                    }
                }
            }
            return "0";

        }
        if (query.toLowerCase().contains("Great Britain")) {
            return "2016";
        }
        return "";
    }
}
//%20which%20of%20the%20following%20numbers%20is%20both%20a%20square%20and%20a%20cube:%20223,%202401,%20784,%20151"
