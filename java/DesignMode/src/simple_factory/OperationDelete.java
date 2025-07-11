package simple_factory;

public class OperationDelete implements Operation{

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA - numberB;
    }
}
