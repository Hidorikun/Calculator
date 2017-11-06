import Controller.NormalController;
import Model.Operations;
import View.NormalView;

import javax.swing.*;

public class MainClass {
    private Operations operations;
    private NormalView normalView;
    private NormalController normalController;
    private JFrame frame;

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();

        //instantiate model
        mainClass.operations = new Operations();

        //instantiate view
        mainClass.normalView = new NormalView();

        //instantiate controller
        mainClass.normalController = new NormalController(mainClass.normalView, mainClass.operations);

        //instantiate frame
        mainClass.frame = new JFrame("Calculator 1.3.0");
        mainClass.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainClass.frame.add(mainClass.normalView);
        mainClass.frame.pack();
        mainClass.frame.setVisible(true);

    }
}
