import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Utilidad {
    public static BufferedReader lector= new BufferedReader(new InputStreamReader(System.in));

    private static List<String> menu= List.of(":: Bienvenido/a Al Conversor de Monedas ::\n"
            ,"(1)Dolar ==> Peso Argentino",
            "(2)Peso Argentino ==> Dolar",
            "(3)Dolar ==> Real Brasileño",
            "(4)Real Brasileño ==> Dolar",
            "(5)Dolar ==> Peso Colombiano",
            "(6)Peso Colombiano ==> Dolar",
            "(7) Salir","::".repeat(10));
    public static String validarOpcion() throws IOException {
        var opcion="";
        do{
            menu.forEach(System.out::println);
            System.out.println("Ingrese una opcion valida");
            opcion=lector.readLine().trim();
        }while(!opcion.matches("[1-7]"));
        return opcion;
    }
}
