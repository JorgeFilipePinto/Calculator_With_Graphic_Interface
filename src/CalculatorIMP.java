import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorIMP extends UnicastRemoteObject implements Calculator {
    public CalculadoraIMP() throws RemoteException {
        super();
    }
    public double addFunction(double a, double b) throws RemoteException {
        return a + b;
    }
}