package behavioural.interpretor;

public class FourCharsExpression implements Expression {
    public FourCharsExpression() {
    }

    @Override
    public void interpret(Morse context) {
        String code = context.getContext();
        String result = null;

        if (code.contentEquals("....")) {
            result = "H";
        } else if (code.contentEquals("-...")) {
            result = "B";
        } else if (code.contentEquals(".-..")) {
            result = "L";
        } else if (code.contentEquals("..-.")) {
            result = "F";
        } else if (code.contentEquals("...-")) {
            result = "V";
        } else if (code.contentEquals("--..")) {
            result = "Z";
        } else if (code.contentEquals("-.-.")) {
            result = "C";
        } else if (code.contentEquals("-..-")) {
            result = "X";
        } else if (code.contentEquals(".--.")) {
            result = "P";
        } else if (code.contentEquals(".---")) {
            result = "J";
        } else if (code.contentEquals("--.-")) {
            result = "Q";
        } else if (code.contentEquals("-.--")) {
            result = "Y";
        } else {
            result = "";
        }

        System.out.print(result);
    }
}
