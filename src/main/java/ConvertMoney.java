import java.util.Scanner;

public class ConvertMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap so tien USD: ");
        usd = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Gia tri quy doi: " + quydoi);
    }
}
