package Scount;


public class StringCount {


    private int Rows;
    private int numberChar;
    private boolean stop;

    public StringCount() {
        numberChar = 0;
        Rows = 0;
        stop = false;

    }

    public int numberRows() {
        return Rows;
    }

    public void AddOneRow() {
        Rows += 1;
    }

    public int numberCharacters() {
        return numberChar;
    }

    public int CountRows(String inputText) {
        if (inputText.equals("stop")){
           stop = true;
        }else{
        Rows = Rows +1;
       }

        return Rows;
    }


    public int countCharacters(String inputText) {
        if (inputText.equals("stop")){
            stop = true;
       }else {
            numberChar = numberChar + inputText.length();
       }

        return numberChar;
    }
    public void isInputStop(String Text) {
        stop = Text.equals("stop");


    }
    public boolean getStop() {

        return stop;
    }
}







