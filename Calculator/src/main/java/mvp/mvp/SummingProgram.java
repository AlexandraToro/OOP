package mvp.mvp;

import java.util.Scanner;

public class SummingProgram {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Model sumModel = new Model();
        View view = new ViewImpl(scn, System.out);
        Presenter presenter = new Presenter(sumModel, view);
        presenter.execute();
    }
}
