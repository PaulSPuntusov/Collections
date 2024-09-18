import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int s;
        ArrayList<Integer> first = new ArrayList(n);
        for (int i = 0; i < n ; i ++) {
            first.add(i, i);
            System.out.print(first.get(i)+" ");
        }
        System.out.println("");
        for (int i = 0; i < n - 1; i = i + 2) {
            s = first.get(i);
            first.set(i, first.get(i + 1));
            first.set(i+1, s);
            System.out.print(first.get(i)+" ");
            System.out.print(first.get(i+1)+" ");
        }
    }
}