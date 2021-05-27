
public class Parse {
    public static int RomeOrArab(String[] blocks) {
        int num1 = 0;
        int num2 = 0;
        if (Main.ArabOrRome(blocks) == true) {
            switch (blocks[0]) {
                case "I":
                    num1 = 1;
                    break;
                case "II":
                    num1 = 2;
                    break;
                case "III":
                    num1 = 3;
                    break;
                case "IV":
                    num1 = 4;
                    break;
                case "V":
                    num1 = 5;
                    break;
                case "VI":
                    num1 = 6;
                    break;
                case "VII":
                    num1 = 7;
                    break;
                case "VIII":
                    num1 = 8;
                    break;
                case "IX":
                    num1 = 9;
                    break;
                case "X":
                    num1 = 10;
                    break;
            }
        }
        if (Main.ArabOrRome(blocks) == true) {
            switch (blocks[2]) {
                case "I":
                    num2 = 1;
                    break;
                case "II":
                    num2 = 2;
                    break;
                case "III":
                    num2 = 3;
                    break;
                case "IV":
                    num2 = 4;
                    break;
                case "V":
                    num2 = 5;
                    break;
                case "VI":
                    num2 = 6;
                    break;
                case "VII":
                    num2 = 7;
                    break;
                case "VIII":
                    num2 = 8;
                    break;
                case "IX":
                    num2 = 9;
                    break;
                case "X":
                    num2 = 10;
                    break;
            }
        }
        int res = 0;
        switch (blocks[1]) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num1 - num2;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num1 / num2;
                break;
        }
        return res;
    }


}