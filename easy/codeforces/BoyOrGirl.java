// https://codeforces.com/contest/236/problem/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BoyOrGirl {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int[] set = new int[26];

        for(int i=0; i<line.length(); i++) {
            set[line.charAt(i) - 97]++;
        }

        int dc = 0;
        for(int i=0; i<26; i++) {
            if(set[i] != 0) dc++;
        }

        System.out.println(dc %2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
    }
}