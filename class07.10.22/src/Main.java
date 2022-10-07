public class Main {
    public static void main(String[] args) {
        int[] ints = {1, 3, 1, 5, 3};
        findDuplicates(ints);

        System.out.println("-----------task2------------");
        int[] arr1 = {3, 1, 5, 8};
        int[] arr2 = {5, 6, 8};
        findDuplicates1(arr1, arr2);

        System.out.println("----------task3-------------");
        int arr3[] = {5, 10, 45, 7, 10, 8};
        System.out.println(isSumNEqualsM(arr3, 10, 20));

        System.out.println("--------task4---------------");
        int[] arr4 = {4, 1, 9};
        int[] arr5 = {4, 9, 0};
        int[] arr6 = {4, 1, 9, 0};
        int[] arr7 = {4, 6, 9, 8};
        System.out.println(isMissing0and1(arr4));//false
        System.out.println(isMissing0and1(arr5));//false
        System.out.println(isMissing0and1(arr6));//false
        System.out.println(isMissing0and1(arr7));//true

        System.out.println("----------task5--------------");
        int[] numbers1 = {4, 1, 9};
        int[] numbers2 = {4, 1, 6};
        System.out.println(isArr1EqualsArr2(numbers1, numbers2));
    }
    ///есть целочисленный массив, в котором некоторые элементы могут повторяться
    // два раза . Написать метод, находящий эти повторяющиеся  элементы и выводящий их на экран
    // {1,3,1,5,3}-> 1,3

    public static void findDuplicates(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] == ints[j]) {
                    System.out.println("Duplicate element: " + ints[j]);
                }
            }
        }
    }

    //2.Есть два целочисленных не пустых массива . написать метод, находяший общие элементы
    // между двумя массивами и вывести их на экран
    // {3,1,5},{5,6,8}-> 5
    public static void findDuplicates1(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Duplicate element: " + arr2[j]);
                }
            }
        }
    }

    //3. Есть не пустой целочисленный массив. Написать метод, проверяющий равна ли сумма элементов n
    // числу m. Вернуть true  если да false  если нет
    // {5,10,45,7,10,8}->  равна ли сумма десяток тридцати.
    public static boolean isSumNEqualsM(int[] numbers, int num, int sum) {
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (num == numbers[i]) {
                counter = counter + num;
            }
        }
        return counter == sum;
    }

    //4. Есть целочисленный массив не нулевой. Написать метод, возвращающий
    // true если в этом массиве нет 0 или нет 1
    // {4,1,9}-> false
    // {4,9,0}-> false
    // {4,1,9,0}-> false
    // {4,6,9,8}-> true
    public static boolean isMissing0and1(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == 1 || num[i] == 0) {
                return false;
            }
        }
        return true;
    }

    //5.Написать метод, проверяющий равенство двух целочисленных массивов
    //{3,2,1},{3,2,1} -> true
    //{3,1,2},{3,2,1} -> false
    public static boolean isArr1EqualsArr2(int[]numbers1, int[]numbers2){
        if (numbers1.length!=numbers2.length)
            return false;

        for (int i = 0; i < numbers1.length; i++) {
            if (numbers1[i]!=numbers2[i]){
                return false;
            }
        }
        return true;
    }

    //6. Есть массив целых чисел. Написать метод, проверяющий содержит ли массив последовательные элементы
    //    4,2,1,5,3 -> true
    //    4,2,1,6,3 -> false
    //    4,2,1,5,3,5 -> false
    //    7,5,6,3,4 -> true}
}
