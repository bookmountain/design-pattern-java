package behavioural.interpretor;

public class FiveCharsExpression implements Expression {
    public FiveCharsExpression() {
    }

    @Override
    public void interpret(Morse context) {
        String code = context.getContext();
        String result = null;

        if (code.contentEquals(".----")) {
            result = "1";
        } else if (code.contentEquals("..---")) {
            result = "2";
        } else if (code.contentEquals("...--")) {
            result = "3";
        } else if (code.contentEquals("....-")) {
            result = "4";
        } else if (code.contentEquals(".....")) {
            result = "5";
        } else if (code.contentEquals("-....")) {
            result = "6";
        } else if (code.contentEquals("--...")) {
            result = "7";
        } else if (code.contentEquals("---..")) {
            result = "8";
        } else if (code.contentEquals("----.")) {
            result = "9";
        } else if (code.contentEquals("-----")) {
            result = "0";
        } else {
            result = "";
        }

        System.out.print(result);
    }
}
