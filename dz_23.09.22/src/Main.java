public class Main {
    public static void main(String[] args) {
        int arr[] = {5,2,9,1};
        System.out.println(getMax(arr));
        System.out.println(getDiff(arr));
    }
//    First level: Дан массив целых чисел ( не пустой) .
//    Написать метод, возвращающий наибольший элемент  этого массива .
//    { 5,2,9,1} -> 9
    public static int getMax(int[] arr) {
        int max=arr[0];
        for (int i = 1;i<arr.length;i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

//    Second level: Дан массив целых чисел ( не пустой) . Написать метод,
//    возвращающий разницу между наибольшим и наименьшим  элементами  этого массива .
//    { 5,2,9,1} -> 8
    public static int getDiff(int[] arr) {
        int max=arr[0];
        int min=arr[0];
        for (int i = 1;i<arr.length;i++) {
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int diff = max-min;
        return diff;
    }
}