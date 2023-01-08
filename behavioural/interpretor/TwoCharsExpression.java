package behavioural.interpretor;

public class TwoCharsExpression implements Expression {
    public TwoCharsExpression() {
    }

    @Override
    public void interpret(Morse context) {
        String code = context.getContext();
        String result = null;

        if (code.contentEquals("..")) {
            result = "I";
        } else if (code.contentEquals(".-")) {
            result = "A";
        } else if (code.contentEquals("-.")) {
            result = "N";
        } else if (code.contentEquals("--")) {
            result = "M";
        } else {
            result = "";
        }

        System.out.print(result);
    }
}