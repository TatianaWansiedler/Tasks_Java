//First level: C помощью цикла for написать метод, печатающий цифры от 1 до  числа  n
//Second level: C помощью цикла for написать метод возвращающий сумму цифр от 1 до числа n

public class Main {
    public static void main(String[] args) {
        list(1, 10);
        System.out.println();
        System.out.println("the sum is: " + sum(1,10));
    }
    public static void list (int i, int n) {
        for (; i<=n; i+=1) {
            System.out.print(i+" ");
        }
    }
    public static int sum (int i, int n) {
        int sum=0;
        for (; i<=n; i+=1) {
            sum+=i;
        }
        return sum;
    }
}
