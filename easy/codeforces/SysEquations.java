/**
 * https://codeforces.com/problemset/problem/214/A
 * 
 * TODO: Read https://codeforces.com/blog/entry/129292
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SysEquations {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        double k = Math.sqrt(n + m);
        int vsCount = 0;

        for(int i=0; i<=k; i++) {
            for(int j=0; j<=k; j++) {
                if(i * i + j == n && j * j + i == m) {
                    vsCount++;
                }
            }
        }

        System.out.println(vsCount);
    }
}