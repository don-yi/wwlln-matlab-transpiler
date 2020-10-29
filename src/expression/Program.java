package expression;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Import> expressions;

    public Program() {
        this.expressions = new ArrayList<>();
    }

    public void addExpression(Import e) {
        expressions.add(e);
    }
}
