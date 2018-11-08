import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner operaciya = new Scanner(System.in); //считывание операции
        Scanner vlaue = new Scanner(System.in); //считывание цифр "а" и "b"

        int op;
        System.out.println("Введите 1 +, 2 -, 3 *, 4 /");
        while (true) {
            op = operaciya.nextInt();
            if (op == 1 || op == 2 || op == 3 || op == 4) {
                break;
            } else
                System.out.println("Введите only 1, 2, 3 или 4");
        }
        System.out.println("Enter first number");
        double a = vlaue.nextDouble();
        System.out.println("Enter second number");
        double b;
        while (true) {
            b = vlaue.nextDouble();
            if (b == 0 && op == 4) {
                System.out.println("na 0 delit nelza");
            } else break;
        }


        if (op == 1) {
            Raschet summa = new Raschet(); // ссылка на расчёт.джава
            double res = summa.calculateSum(a, b); // присвоение к ресс result из расчёт.джава
            System.out.println("Сумма " + res);
        }
        if (op == 2) {
            Raschet vichit = new Raschet(); // ссылка на расчёт.джава
            double res = vichit.calculateVic(a, b); // присвоение к ресс result из расчёт.джава
            System.out.println("Разница " + res);
        }
        if (op == 3) {
            Raschet ymnoj = new Raschet(); // ссылка на расчёт.джава
            double res = ymnoj.calculateYmn(a, b); // присвоение к ресс result из расчёт.джава
            System.out.println("Произведение " + res);
        }
        if (op == 4) {
            Raschet del = new Raschet(); // ссылка на расчёт.джава
            double res = del.calculateDel(a, b); // присвоение к ресс result из расчёт.джава
            System.out.println("Деление " + res);
        }
    }


}


