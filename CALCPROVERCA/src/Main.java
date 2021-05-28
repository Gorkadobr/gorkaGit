import java.util.Scanner;
//Деление не работает...плохая обработка исключений...
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите арифметическую операцию");

            Scanner sc = new Scanner(System.in);
            String text = sc.nextLine();
            String[] blocks = text.split(" ");

        if (ArabOrRome(blocks) == true){
            System.out.println(Oper.Transform(blocks));
        }
        else{
            System.out.println(ArabOp.ArabOperation(blocks));
        }
    }

    public static boolean ArabOrRome(String[] blocks) {
        boolean flag = false;
        boolean flag1 = false;
        boolean flag2 = false;
            String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
    for (int i = 0; i < roman.length; i++) {
        if (blocks[0].equals(roman[i])) {
            flag1 = true;
        }
    }
            for (int a = 0; a < roman.length; a++) {
                if (blocks[2].equals(roman[a])) {
                    flag2 = true;
                }
            }
            if (flag1 == true && flag2 == true){
                flag = true;
            }
            else if ((flag1 == false && flag2 == true) || (flag1 == true && flag2 == false)){
            throw new IllegalArgumentException("Цифры должны быть либо арабские, либо римские.");
        }
        return flag;
    }



}
