public class Main {
    public static void main(String[] args) {
        String str = "hello";
        // Level 1
        System.out.printf("Double string length \"%s\": %d",str, doubleStringLength(str));
        System.out.println();
        //Level 2
        System.out.println("-----------2 level-------------------");
        System.out.println(reverse("abcd"));
        System.out.println(reverse1("abcd"));

    }
    //First level: Написать метод, возвращающий целое число равное двойной длине строки,
    // принимаемой в качестве аргумента метода.  Пример: hello -> 10
    public static int doubleStringLength (String str) {
        int doubleLength = str.length()*2;
        return doubleLength;
    }
    //Second level: Написать 2 метода:  один метод переставляет первую букву в конец строки (abcd-> bcda).
    // Второй  метод переставляет последнюю букву в начало строки (abcd->dabc)

    public static String reverse (String str) {
        String res = "";
        for (int i =1; i<str.length(); i++) {
            res+=str.charAt(i);
        }
        res = res + str.charAt(0);
        return res;
    }
    public static String reverse1 (String str) {
        int end = str.length();
        int start = str.length()-1;
        String firstCharStr = str.substring(start,end);
        String res = firstCharStr + str.substring(0, str.length()-1);
        return res;
    }
}