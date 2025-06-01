import java.util.Scanner;
public class SumNno {
    public static int nsum(int n) {
        if (n == 0) {
            return 0; 
        }
        return (n*(n+1))/2; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sum: ");
        int n = scanner.nextInt();
        int result = nsum(n);
        System.out.println(result);
        scanner.close();
    }
}