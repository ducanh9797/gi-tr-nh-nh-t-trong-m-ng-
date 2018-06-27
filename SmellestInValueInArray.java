public class SmellestInValueInArray {
    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};
        int index = SmellestInValueInArray(arr);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + arr[index]);
    }
    public static int SmellestInValueInArray(int[] array){
        int min = array[0];
        int index = 0;
        for (int i = 1;i<array.length;i++ ) {
            if (array[i]<min) {
                min = array[i];
                index = i;

            }
        }return index;
    }

}
