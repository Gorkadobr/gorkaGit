import java.util.Scanner;
//Деление не работает...плохая обработка исключений...
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите арифметическую операцию");

            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String[] blocks = text.split(" ");

        if (ArabOp.ArabOperation(blocks) > Parse.RomeOrArab(blocks)) {
            System.out.println(ArabOp.ArabOperation(blocks));
        } else if (Parse.RomeOrArab(blocks) > ArabOp.ArabOperation(blocks)) {
            System.out.println(Oper.Transform(blocks));
        }
    }

    public static boolean ArabOrRome(String[] blocks) {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
        String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};

        for (int i = 0; i < roman.length; i++) {
            if (blocks[0].equals(roman[i])) {
                flag = true;
            }
        }
        for (int i = 0; i < roman.length; i++) {
            if (blocks[2].equals(roman[i])) {
                flag1 = true;
            }
        }
        if (flag == true && flag1 == false) {
            throw new IllegalStateException("Оба числа должны быть римскими либо арабскими");
        }
        else if (flag == false && flag1 == true) {
            throw new IllegalStateException("Оба числа должны быть римскими либо арабскими");
        }
        else if (flag == true && flag1 == true){
            flag2 = true;
        }
        else flag2 = false;
        return flag2;
    }



}
