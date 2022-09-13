public class Main {
    public static void main(String[] args) {
        //First level: С использованием цикла while написать метод, печатающий куб числа от 0 до данного чисда n.
        //Пример: на входе n=3  на выходе 0,1,8,27

        int num =0;
        int n =3;
        while (num<=n){
            int cubeOfNum = num*num*num;
            System.out.println(cubeOfNum);
            num++;
        }

        System.out.println("----------Second level------------");
        //Second level: С использованием цикла while написать метод, печатающий результат  умножения данного числа n  на все целые числа от 0 до n..
        //Пример: на входе n=3  на выходе 0,3,6,9

        int index = 0;
        int n1 = 3;
        while (index<=n) {
            System.out.println(index*n);
            index++;
        }
    }
}