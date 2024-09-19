import java.util.ArrayList;

public class Main {
    static int n = 20;
    static int[] intArray = new int[n];
    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList(n);
        for (int i = 0; i < n ; i ++) {
            intList.add(i, i);
            System.out.print(intList.get(i)+" ");
        }
        System.out.println("");
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

        for(int i = 0; i < intArray.length; i++){
            intArray[i] = intList.get(i);
            System.out.println(intArray[i]);
        }
        bubbleSort(intArray);
    }
    public static void bubbleSort(int[] intArray){
        for(int i = 0; i < intArray.length - 1; i++){
            for(int j = 0; j < intArray.length - i - 1; j++){
                if(intArray[j] > intArray[j + 1]){
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
            System.out.print(intArray[i]+" ");
        }
    }

}