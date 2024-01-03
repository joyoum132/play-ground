import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public boolean solution(String[] phone_book) {
        Set<String>[] phoneBookWithLength = new HashSet[21];
        for (int i = 0; i < phoneBookWithLength.length; i++) {
            phoneBookWithLength[i] = new HashSet<>();
        }

        for (String number : phone_book) {
            phoneBookWithLength[number.length()].add(number);
        }

        Arrays.sort(phone_book, Comparator.comparing(String::length));

        for(int i=1; i<phone_book.length; i++) {
            String target = phone_book[i];
            int length = target.length();
            for(int j=1; j<length; j++) {
                String temp = target.substring(0,j);
                if(phoneBookWithLength[j].contains(temp)) return false;
            }
        }
        
        return true;
    }
}