public class SequenceArray {
    public static void main(String[] args) {
   /*
   Given a sequence of integers as an array, determine whether it is possible to obtain a strictly increasing sequence
   by removing no more than one element from the array.
Note: sequence a0, a1, ..., an is considered to be a strictly increasing if a0 < a1 < ... < an.
Sequence containing only one element is also considered to be strictly increasing.
    */

    }
    static boolean solution(int[] sequence) {

        // Verilen arrayın 1 eleman çıkarılmış alt arraylerini yapıyoruz.
        // Her bir elemanın eksik olduğu bir alt array.
        // arr[i][] = sequence[] içinden i. elemanın hariç olduğu alt array demek.

        int[][] arr = new int[sequence.length][sequence.length-1];

        int exclude = 0;

        for(int i = 0; i < sequence.length; i++) {
            exclude = 0;
            for(int j = 0; j < sequence.length; j++) {
                if(j == i) {
                    exclude = 1;
                    continue;
                }
                arr[i][j-exclude] = sequence[j];
            }
        }

        // Bu alt arraylerden en az 1 tanesi sıralı ise true dönmelidir.
        boolean solid = false;

        for(int i = 0; i < arr.length; i++) {
            if(isSorted(arr[i])) {
                solid = true;
            }
        }
        return solid;
    }

    // Array sıralı mı diye bakan metot.
    static boolean isSorted(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }
}
