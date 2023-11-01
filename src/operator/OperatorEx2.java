package operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i = 5, j = 0;

        j = i++;
        System.out.printf("j = i++; 실행 후, i = %d, j = %d\n", i, j);

        i = 5;
        j = 0;

        j = ++i;
        System.out.printf("j = ++i; 실행 후, i = %d, j = %d\n", i, j);

        int x = 5;
        x = x++ - ++x;
        System.out.println(x);
    }
}
