package behavioural.interpretor;

public class Main {
    public static void main(String[] args) {
        Morse context = new Morse("- .- .. .-- .- -. -. --- .----");
        String[] contextArray = context.getContext().split(" ");

        Expression morseExpression = null;

        for (String code : contextArray) {
            int codeLength = code.length();

            switch (codeLength) {
                case 1:
                    morseExpression = new OneCharExpression();
                    break;
                case 2:
                    morseExpression = new TwoCharsExpression();
                    break;
                case 3:
                    morseExpression = new ThreeCharsExpression();
                    break;
                case 4:
                    morseExpression = new FourCharsExpression();
                    break;
                case 5:
                    morseExpression = new FiveCharsExpression();
                    break;
                default:
                    break;
            }

            morseExpression.interpret(new Morse(code));
        }
    }
}