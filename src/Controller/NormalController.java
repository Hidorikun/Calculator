package Controller;

import Model.Operations;
import View.NormalView;
import java.awt.event.*;

public class NormalController {
    private NormalView normalView;
    private Operations operations;
    private int equaled = 0;

    public NormalController(NormalView normalView, Operations operations){
        this.operations = operations;
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
        this.normalView.actEgal(new ActEgal());
        this.normalView.actButonClear(new ActButonClear());
        this.normalView.actAdunare(new ActAdunare());
        this.normalView.actScadere(new ActScadere());
        this.normalView.actInmultire(new ActInmultire());
        this.normalView.actImpartire(new ActImpartire());
        this.normalView.actBack(new ActBack());
        this.normalView.actButon0(new ActButon0());
    }

    private void computeResult(){
        if (equaled == 0){

            String aux = normalView.getTextField();
            if (aux.isEmpty())
                aux = "0";

            if (normalView.getResultLabel().equals("")){
                operations.setResult(Integer.parseInt(normalView.getTextField()));

            }else if (normalView.getResultLabel().endsWith("-")){
                operations.setResult(operations.getScadere(operations.getResult(), Integer.parseInt(aux)));

            }else if (normalView.getResultLabel().endsWith("+")){
                operations.setResult(operations.getAdunare(operations.getResult(), Integer.parseInt(aux)));

            }else if (normalView.getResultLabel().endsWith("*")){
                operations.setResult(operations.getInmultire(operations.getResult(), Integer.parseInt(aux)));

            }else if (normalView.getResultLabel().endsWith("/")){
                if (aux.equals("0")) aux = "1";
                operations.setResult(operations.getDiv(operations.getResult(), Integer.parseInt(aux)));
            }else{
                operations.setResult(Integer.parseInt(aux));
            }

        }else{
            normalView.setResultLabel("");
            operations.setResult(Integer.parseInt(normalView.getTextField()));
            equaled = 0;
        }
    }

    class ActButon0 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");

            normalView.setTextField(normalView.getTextField() + "0");
        }
    }

    class ActButon1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");

            normalView.setTextField(normalView.getTextField() + "1");
        }
    }

    class ActButon2 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "2");
        }
    }

    class ActButon3 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "3");
        }
    }

    class ActButon4 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "4");
        }
    }

    class ActButon5 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "5");
        }
    }

    class ActButon6 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "6");
        }
    }

    class ActButon7 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "7");
        }
    }

    class ActButon8 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "8");
        }
    }

    class ActButon9 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            if (normalView.getTextField().equals("0"))
                normalView.setTextField("");
            normalView.setTextField(normalView.getTextField() + "9");
        }
    }


    class ActEgal implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            computeResult();
            normalView.setResultLabel(normalView.getResultLabel() + normalView.getTextField());
            normalView.setTextField(String.valueOf(operations.getResult()));
            equaled = 1;

        }
    }

    class ActButonClear implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            normalView.setTextField("0");
            normalView.setResultLabel("");
            operations.setResult(0);
            equaled = 0;
        }
    }

    class ActAdunare implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            computeResult();
            normalView.setResultLabel(normalView.getResultLabel() + " " +  normalView.getTextField() + "  +");
            normalView.setTextField("");
        }
    }

    class ActScadere implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            computeResult();
            normalView.setResultLabel(normalView.getResultLabel() + " " +  normalView.getTextField() + "  -");
            normalView.setTextField("");
        }
    }

    class ActInmultire implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            computeResult();
            normalView.setResultLabel("(" +normalView.getResultLabel() + " " +  normalView.getTextField() + " ) *");
            normalView.setTextField("");
        }
    }

    class ActImpartire implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            computeResult();
            normalView.setResultLabel("(" + normalView.getResultLabel() + " " +  normalView.getTextField() + " ) /");
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
            if (aux.equals("")) aux = "0";
            normalView.setTextField(aux);
        }
    }
}
	