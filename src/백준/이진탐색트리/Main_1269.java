package 백준.이진탐색트리;

import java.util.HashSet;
import java.util.Scanner;

public class Main_1269 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();

        for (int i=0; i<a; i++) {
            setA.add(sc.nextInt());
        }

        for (int i=0; i<b; i++) {
            setB.add(sc.nextInt());
        }

        HashSet<Integer> aMinusB = new HashSet<>(setA);
        aMinusB.removeAll(setB);

        HashSet<Integer> bminusA = new HashSet<>(setB);
        bminusA.removeAll(setA);

        int hab = aMinusB.size() + bminusA.size();

        System.out.println(hab);
        sc.close();
    }
}