package Controller;

import Util.ExpressionEvaluator;
import View.NormalView;
import java.awt.event.*;

public class NormalController {
    private NormalView normalView;

    public NormalController(NormalView normalView){
        this.normalView = normalView;

        this.normalView.actButon1(new ActButon1());
        this.normalView.actButon2(new ActButon2());
        this.normalView.actButon3(new ActButon3());
        this.normalView.actButon4(new ActButon4());
        this.normalView.actButon5(new ActButon5());
        this.normalView.actButon6(new ActButon6());
        this.normalView.actButon7(new ActButon7());
        this.normalView.actButon8(new ActButon8());
        this.normalView.actButon9(new ActButon9());
        this.normalView.actEgal(new ActEqual());
        this.normalView.actButonClear(new ActButonClear());
        this.normalView.actAdunare(new ActAdunare());
        this.normalView.actScadere(new ActScadere());
        this.normalView.actInmultire(new ActInmultire());
        this.normalView.actImpartire(new ActImpartire());
        this.normalView.actBack(new ActBack());
        this.normalView.actButon0(new ActButon0());
        this.normalView.textField(new TextField());
    }

    private void computeResult(){
        normalView.setTextField(String.valueOf(ExpressionEvaluator.evaluate(normalView.getResultLabel())));
    }

    private void transferExpression(Character operation){
        if (normalView.getResultLabel().matches(".*[-+/*]"))
            normalView.setResultLabel(normalView.getResultLabel() + " " + normalView.getTextField() + " " + operation);
        else
            normalView.setResultLabel(normalView.getTextField() + " " + operation);
    }

    private void transferExpressionWithBrackets(Character operation){
        if (normalView.getResultLabel().matches(".*[-+/*]"))
            normalView.setResultLabel("( " + normalView.getResultLabel() + " " + normalView.getTextField() + ") " + operation);
        else
            normalView.setResultLabel(normalView.getTextField() + " " + operation);
    }

    private void clear(){
        normalView.setTextField("");
        normalView.setResultLabel("");
    }
    class ActButon0 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getResultLabel().endsWith("="))
                clear();
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");

            normalView.setTextField(normalView.getTextField() + "0");
        }
    }

    class ActButon1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getResultLabel().endsWith("="))
                clear();
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");

            normalView.setTextField(normalView.getTextField() + "1");
        }
    }

    class ActButon2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getResultLabel().endsWith("="))
                clear();
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "2");
        }
    }

    class ActButon3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getResultLabel().endsWith("="))
                clear();
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "3");
        }
    }

    class ActButon4 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getResultLabel().endsWith("="))
                clear();
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "4");
        }
    }

    class ActButon5 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getResultLabel().endsWith("="))
                clear();
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "5");
        }
    }

    class ActButon6 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getResultLabel().endsWith("="))
                clear();
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "6");
        }
    }

    class ActButon7 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getResultLabel().endsWith("="))
                clear();
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "7");
        }
    }

    class ActButon8 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getResultLabel().endsWith("="))
                clear();
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "8");
        }
    }

    class ActButon9 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getResultLabel().endsWith("="))
                clear();
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "9");
        }
    }


    class ActEqual implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            transferExpression('=');
            computeResult();
        }
    }

    class ActButonClear implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            clear();
        }
    }

    class ActAdunare implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            transferExpression('+');
            normalView.setTextField("");
        }
    }

    class ActScadere implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            transferExpression('-');
            normalView.setTextField("");
        }
    }

    class ActInmultire implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            transferExpressionWithBrackets('*');
            normalView.setTextField("");
        }
    }

    class ActImpartire implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            transferExpressionWithBrackets('/');
            normalView.setTextField("");
        }
    }

    class ActBack implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String aux = normalView.getTextField();
            if (aux.length() > 0){
                aux = aux.substring(0, aux.length()-1);
            }
            if (aux.equals("")) aux = "";
            normalView.setTextField(aux);
        }
    }

    class TextField implements KeyListener{

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();
            if (key == KeyEvent.VK_ENTER) {
                transferExpression('=');
                computeResult();
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
}
	