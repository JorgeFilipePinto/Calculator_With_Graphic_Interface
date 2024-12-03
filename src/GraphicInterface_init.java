import java.rmi.Naming;

public class GraphicInterface_init {
    public static void main(String[] args) {
        String[][] calculatormatrix = {
                {"%", "CE", "C", ""},
                {"1/x", "^", "SQRT", "/"},
                {"7", "8", "9", "*"},
                {"4", "5", "6", "-"},
                {"1", "2", "3", "+"},
                {"", "0", ",", "="}
        };

        GraphicInterface graphicInterface = new GraphicInterface(calculatormatrix,"Jorge Calculator", 100, 100, 20, 20);

        graphicInterface.init();
    }
}
