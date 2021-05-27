public class ArabOp {
    public static int ArabOperation(String[]blocks) {
        String[] arab = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        int num1 = 0;
        int num2 = 0;
        int res = 0;
        if (Main.ArabOrRome(blocks)== false) {
            for (int i = 0; i < arab.length; i++) {
                if (blocks[0].equals(arab[i])) {
                    num1 = Integer.parseInt(blocks[0]);
                }
            }
            for (int i = 0; i < arab.length; i++) {
                if (blocks[2].equals(arab[i])) {
                    num2 = Integer.parseInt(blocks[2]);
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
        }
        return res;
    }
}
