import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        int s;
        ArrayList<Integer> intList = new ArrayList(n);
        for (int i = 0; i < n ; i ++) {
            intList.add(i, i);
            System.out.print(intList.get(i)+" ");
        }
        System.out.println("");
        public static void bubbleSort(ArrayList intList){
            for(int i = 0; i < intList.size() - i; i++){
                for(int j = 0; j < intList.get(i) - i - 1; j++){
                    int temp = intList.get(j);
                    intList.set(j,intList.get(j+1));
                    intList.set(j+1,temp);
                }
                System.out.print(intList.get(i)+" ");
            }
        }
    }
}