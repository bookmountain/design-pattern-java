package behavioural.interpretor;

public class ThreeCharsExpression implements Expression {
    public ThreeCharsExpression() {
    }

    @Override
    public void interpret(Morse context) {
        String code = context.getContext();
        String result = null;

        if (code.contentEquals("...")) {
            result = "S";
        } else if (code.contentEquals("-..")) {
            result = "D";
        } else if (code.contentEquals(".-.")) {
            result = "R";
        } else if (code.contentEquals("..-")) {
            result = "U";
        } else if (code.contentEquals(".--")) {
            result = "W";
        } else if (code.contentEquals("-.-")) {
            result = "K";
        } else if (code.contentEquals("--.")) {
            result = "G";
        } else if (code.contentEquals("---")) {
            result = "O";
        } else {
            result = "";
        }

        System.out.print(result);
    }
}
