

public class Main {
    public static void main(String[] args) {
        try {
            var opcion="";
            var rpta="";
            do {
                opcion=Utilidad.validarOpcion();
                switch (opcion){
                    case "1"-> {

                    }
                    case "2"-> {

                    }
                    case "3"-> {

                    }
                    case "4"-> {

                    }
                    case "5"-> {

                    }
                    case "6"-> {

                    }
                    case "7"-> {
                        System.exit(0);
                    }
                }
                System.out.println("¿Desea continuar(S/N)?");
                rpta=Utilidad.lector.readLine();
            }while(rpta.equalsIgnoreCase("s"));
        }catch (Exception e){

        }
    }
}