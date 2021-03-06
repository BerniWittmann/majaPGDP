package Aufgabenblatt11;

public class Comparison extends Condition {
    private Expression lhs;
    private Comp operator;
    private Expression rhs;

    public Comparison(Expression lhs, Comp operator, Expression rhs) {
        super();
        this.lhs = lhs;
        this.operator = operator;
        this.rhs = rhs;
    }

    public Expression getLhs() {
        return lhs;
    }

    public Comp getOpeator() {
        return operator;
    }

    public Expression getRhs() {
        return rhs;
    }

    public String toString() {
        String result = "";
        if (lhs.firstLevelPriority() > 1) {
            result += "(" + lhs.toString() + ")";
        } else {
            result += lhs.toString();
        }
        if (rhs != null) {
            result += " " + operator.toString() + " ";
            if (rhs.firstLevelPriority() > 1) {
                result += "(" + rhs.toString() + ")";
            } else {
                result += rhs.toString();
            }
        }
        return result;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int firstLevelPriority() {
        return (lhs != null && rhs != null) ? 2 : 1;
    }
}
