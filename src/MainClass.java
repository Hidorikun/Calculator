import Controller.NormalController;
import View.NormalView;

import javax.swing.*;

public class MainClass {
    private NormalView normalView;
    private NormalController normalController;
    private JFrame frame;

    public static void main(String[] args) {
        MainClass mainClass = new MainClass();

        //instantiate view
        mainClass.normalView = new NormalView();

        //instantiate controller
        mainClass.normalController = new NormalController(mainClass.normalView);

        //instantiate frame
        mainClass.frame = new JFrame("Calculator 1.3.0");
        mainClass.frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainClass.frame.add(mainClass.normalView);
        mainClass.frame.pack();
        mainClass.frame.setVisible(true);

    }
}
