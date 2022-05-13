import java.util.ArrayList;

public class Matrix {

    public static int countNumbersDivisibleBySeven(int[][] matrix){
        int result = 0;
        ArrayList<Integer> all = new ArrayList<>();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                all.add(anInt);
            }
        }
        for (int i = 0; i < all.size(); i++) {
            if ((all.get(i)%7)==0)
                result++;
        }

        return result;
    }

    public void columnsWithMax(int[][] matrix){
        int result = 0;
        ArrayList<Integer> all = new ArrayList<>();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                all.add(anInt);
            }
        }
        for (int i = 0; i < all.size(); i++){
            if (all.get(i) < all.get(i + 1)){
                result = all.get(i + 1);
            } else {
                result = all.get(i);
            }
        }
    }
}
