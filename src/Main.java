

public class Main {
    public static void main(String[] args) {
        try {
            var opcion="";
            var rpta="";
            var monto=0f;
            do {
                opcion=Utilidad.validarOpcion();
                switch (opcion){
                    case "1"-> {
                        var conversion = ConsultarAPI.Consultar("USD", "ARS");
                        conversion.ConvertirMoneda();
                    }
                    case "2"-> {
                        var conversion=ConsultarAPI.Consultar("ARS","USD");
                        conversion.ConvertirMoneda();
                    }
                    case "3"-> {
                        var conversion=ConsultarAPI.Consultar("USD","BRL");
                        conversion.ConvertirMoneda();
                    }
                    case "4"-> {
                        var conversion=ConsultarAPI.Consultar("BRL","USD");
                        conversion.ConvertirMoneda();
                    }
                    case "5"-> {
                        var conversion=ConsultarAPI.Consultar("USD","COP");
                        conversion.ConvertirMoneda();
                    }
                    case "6"-> {
                        var conversion=ConsultarAPI.Consultar("COP","USD");
                        conversion.ConvertirMoneda();
                    }
                    case "7"-> {
                        System.exit(0);
                    }
                }
                System.out.println("¿Desea continuar(S/N)?");
                rpta=Utilidad.lector.readLine();
            }while(rpta.equalsIgnoreCase("s"));
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}