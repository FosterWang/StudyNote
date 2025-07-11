package simple_factory;

public class Client {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Operation Add = factory.createOperation("+");
        System.out.println("1 + 2 = " + Add.getResult(1, 2));
        Operation Delete = factory.createOperation("-");
        System.out.println("3 - 1 = " + Delete.getResult(3, 1));
    }
}
