import java.util.ArrayList;

public class Main {
    static int n = 20;
    static int[] intArray = new int[n];
    static ArrayList<Integer> intList = new ArrayList(n);
    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            intList.add(i, i);
            intArray[i] = i;
            System.out.print(intList.get(i) + "*");
            System.out.print(intArray[i] + " ");
        }
        System.out.println("");
        reverse(intArray);
        System.out.println("");
        listReverse(intList);

        /*
        public static void bubbleSort(ArrayList intList){
        for(int i = 0; i < intList.size() - i; i++){
            for(int j = 0; j < intList.get(i) - i - 1; j++){
                if(intList.get(j) > intList.get(j + 1)){
                    int temp = intList.get(j);
                    intList.set(j,intList.get(j+1));
                    intList.set(j+1,temp);
                }

            }
        }
    }

         */
        //Integer[] intArray = intList.toArray(new Integer[0]);

    }
    public static void reverse(int[] intArray){
        int n = intArray.length - 1;
        System.out.println("Array: ");
        for(int i = 0; i < intArray.length / 2; i++){
            int temp = intArray[i];
            intArray[i] = intArray[n - i];
            intArray[n - i] = temp;
        }
        for(int i = 0; i < intArray.length; i++) System.out.print(intArray[i]+" ");
    }
    public static void listReverse(ArrayList intList){
        int n = intList.size()-1;
        System.out.println("List: ");
        for(int i = 0; i < (intList.size()) / 2; i++){
            Integer temp = (Integer) intList.get(i);
            intList.set(i,intList.get(n-i));
            intList.set((n - i),temp);
        }
        for (int i = 0; i < intList.size(); i++) System.out.print(intList.get(i)+" ");
    }

}