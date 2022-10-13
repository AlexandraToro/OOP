package mvp.mvp;

public class Presenter {

    private final Model model;
    private final View view;
    private int sign;
    public Presenter(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void execute() {
        model.setFirst(view.getValue("Enter first number "));
        model.setSecond(view.getValue("Enter second number "));
        sign  = view.getValue("Select the number of the operation: \n" +
                "1 - summa \n" +
                "2 - difference \n" +
                "3 - integer division \n" +
                "4 - multiplication \n" +
                "5 - exponentiation \n");
        switch (sign){
            case 1: view.print("Sum is " + model.getSum());
            break;
            case 2: view.print("Difference is  " + model.getDifference());
                break;
            case 3: view.print("Integer division is " + model.getDivision());
                break;
            case 4: view.print("Multiplication is " + model.getMultiplication());
                break;
            case 5: view.print("Exponentiation is " + model.getExponentiation());
                break;
        }
    }

    private static class MockView implements View {

        private int count = 0;

        @Override
        public int getValue(String message) {
            count++;
            return 1;
        }

        @Override
        public void print(String message) {
            if (!message.equals("Sum is 2")) {
                throw new AssertionError("Incorrect sum");
            }
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) {
        Model sumModel = new Model();
        MockView mockView = new MockView();
        Presenter presenter = new Presenter(sumModel, mockView);

        presenter.execute();
        if (mockView.getCount() != 2) {
            throw new AssertionError("Incorrect call of getValue()");
        }
    }
}
