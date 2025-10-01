// https://codeforces.com/contest/228/problem/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Horseshoe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        Set<String> set = new HashSet<>();

        for(String s : line.split(" ")) {
            set.add(s.trim());
        }

        System.out.println(4 - set.size());
    }
}