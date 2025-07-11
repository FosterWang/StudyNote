package simple_factory;

public class SimpleFactory {
    public Operation createOperation(String oper) {
        return switch (oper) {
            case "+" -> new OperationAdd();
            case "-" -> new OperationDelete();
            default -> null;
        };
    }
}
