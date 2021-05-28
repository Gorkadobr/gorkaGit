public class ArabOp {
    public static int ArabOperation(String[]blocks) {
        String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int num1 = 0;
        int num2 = 0;
        int res = 0;
        if (Main.ArabOrRome(blocks)== false) {
            for (int i = 0; i < arab.length; i++) {
                if (blocks[0].equals(arab[i])) {
                    for (int a = 0; a < arab.length; a++) {
                        if (blocks[2].equals(arab[a])) {
                            num1 = Integer.parseInt(blocks[0]);
                            num2 = Integer.parseInt(blocks[2]);
                        }
                    }
                }
            }
        }
            if (Main.ArabOrRome(blocks)== true){
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
                default:
                    throw new IllegalStateException("Операция должна содержать знак +, -, *, или /");
            }
        return res;
    }
}
