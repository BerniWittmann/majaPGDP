package Aufgabenblatt11;

public class Number extends Expression {
    private int value;

    public Number(int value) {
        super();
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public int firstLevelPriority() {
        return 1;
    }

    public String toString() {
        return "" + value;
    }
}

