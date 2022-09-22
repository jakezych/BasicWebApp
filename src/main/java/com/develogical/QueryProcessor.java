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
        if (query.toLowerCase().contains("plus")) {
            String[] all = query.split(" ");
            return Integer.toString(Integer.parseInt(all[all.length - 1]) + Integer.parseInt(all[all.length - 3]));
        }

        if (query.toLowerCase().contains("minus")) {
            String[] all = query.split(" ");
            return Integer.toString(Integer.parseInt(all[all.length - 3]) - Integer.parseInt(all[all.length - 1]));
        }

        if (query.toLowerCase().contains("multiplied")) {
            String[] all = query.split(" ");
            return Integer.toString(Integer.parseInt(all[all.length - 1]) * Integer.parseInt(all[all.length - 4]));
        }
        /*
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
        */
        if (query.toLowerCase().contains("Great Britain")) {
            return "2016";
        }
        if (query.toLowerCase().contains("James Bond")) {
            return "Sean Connery";
        }
        if (query.toLowerCase().contains("Fibonacci")) {
            String place = query.split(" ")[3];
            int num = Integer.parseInt(place.substring(0, place.length() - 2));
            return Integer.toString(fibonacci(num));
        }
        /* 
        if (query.toLowerCase().contains("prime")) {
            for (int i = 0; i < )
            boolean flag = false;
            for (int i = 2; i <= num / 2; ++i) {
              // condition for nonprime number
              if (num % i == 0) {
                flag = true;
                break;
              }
            }
        }
        */
        return "";
    }
public int fibonacci(int n) {
    if(n == 0)
        return 0;
    else if(n == 1)
        return 1;
    else
        return fibonacci(n - 1) + fibonacci(n - 2);
}
}