package appdespesas;
import jdk.nashorn.internal.objects.NativeDate;
public class AppDespesas {
    public static void main(String[] args) {
        Despesas despesas = new Despesas(1,"Passagem",400.00);
        despesas.Imprimir();
    }
}
