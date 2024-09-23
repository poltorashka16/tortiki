import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите кол-во гостей: ");
        int n = scanner.nextInt();

        int countCut = 0;

        if(n == 1){
            countCut = 0;
        } else {

            if (n % 2 == 0) {
                countCut = n / 2;
            } else {
                countCut = n;
            }
        }
        System.out.println( String.format("Нужное кол-во надрезов = %d", countCut));
    }
}