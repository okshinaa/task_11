package ru.vsu.cs.okshina_v_a;

public class WordProcessing {
    public static String countNumberOfChar(String str) {
        StringBuilder sb = new StringBuilder();
        String[] s = str.split("[^A-Za-zА-Яа-я0-9]");

        for(int i = 0; i < s.length; i++) {
            if (i == s.length - 1) {
                sb.append(s[i]).append("(").append(s[i].length()).append(")");
            } else {
                sb.append(s[i]).append("(").append(s[i].length()).append(") ");
            }
        }

        return sb.toString();
    }
}
