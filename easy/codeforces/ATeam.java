// https://codeforces.com/contest/231/problem/A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ATeam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int attempts = 0;
        while(n > 0) {
            String line = br.readLine();
            String[] knows = line.split(" ");

            int attempt = 0;
            for(String k : knows) {
                if(k.equals("1"))  attempt++;
            }

            if(attempt >= 2) {
                attempts += 1;
            }

            n--;
        }

        System.out.println(attempts);
    }
}