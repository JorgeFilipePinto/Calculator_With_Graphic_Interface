import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Servidor {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099); // Inicia o
            registro RMI
            Calculadora calc = new CalculadoraIMP();
            Naming.rebind("rmi://localhost:1099/Calculadora",
                    calc);
            System.out.println("Servidor RMI em execução...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}