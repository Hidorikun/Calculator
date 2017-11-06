package Model;

public class Operations {
    int result;

    public Operations(){
        result = 0;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public int getScadere(int a, int b){
        return a - b;
    }

    public int getAdunare(int a, int b){
        return a + b;
    }

    public int getInmultire(int a, int b){
        return a * b;
    }

    public int getDiv(int a, int b){
        return a / b;
    }
}
