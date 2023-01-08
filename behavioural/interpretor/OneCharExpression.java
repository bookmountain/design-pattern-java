package behavioural.interpretor;

public class OneCharExpression implements Expression {
    public OneCharExpression() {
    }

    @Override
    public void interpret(Morse context) {
        String code = context.getContext();
        String result = null;

        if (code.contentEquals(".")) {
            result = "E";
        } else if (code.contentEquals("-")) {
            result = "T";
        } else {
            result = "";
        }

        System.out.print(result);
    }
}

