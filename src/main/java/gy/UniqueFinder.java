package gy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueFinder {

    public List<Character> uniqueChars(String s) {

        if (s==null) {
            throw new IllegalArgumentException();
        }

        List<Character> result = new ArrayList<>();

        for (Character c: s.toCharArray()) {
            if (!result.contains(c.charValue())) {
                result.add(c);
            }
        }

        return result;
    }
}
