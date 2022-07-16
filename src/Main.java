import java.util.Arrays;

public class Main {

    static boolean inBuilt(int [] inn, int value) {
        for (int i : inn) {
            if (i == value) {
                return true;
            } else if (value %2 != 0 ){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] list = {1, 4, 7, 10, 10, 8, 3, 3, 3, 8, 4};
        int[] newList = new int[list.length];
        int inList =0;
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list.length; j++){
                if ((i != j) && (list[i] == list[j])){
                    if(!inBuilt(newList, list[i])){
                        newList[inList++] = list[i];
                        Arrays.sort(newList);
                    }
                    break;
                }
            }
        }
        for(int value : newList){
            if (value != 0){
                System.out.println(value);
            }
        }
    }
}
