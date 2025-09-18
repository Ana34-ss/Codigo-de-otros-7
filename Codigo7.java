import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {
    public static void main(String[] args) {

        // Error: Estaba usando `Scanner s = new Scanner();` sin pasar System.in como argumento.
        Scanner s = new Scanner(System.in);

        // Error: Estaba usando `HashMap<Byte, Double>`, lo cual no tiene sentido para un mapa de países y capitales.
        // Además, la variable usada era `ca`, pero luego usabas `capitales` que no existía.
        HashMap<String, String> capitales = new HashMap<>();

        // Error de sintaxis: Faltaba el valor para "El Salvador".
        capitales.put("Canadá", "Ottawa"); // Error ortográfico corregido
        capitales.put("Estados Unidos", "Washington DC");
        capitales.put("México", "México DF");
        capitales.put("Belice", "Belmopán");
        capitales.put("Costa Rica", "San José"); // Corrijo capitalización
        capitales.put("El Salvador", "San Salvador"); // Añadido valor faltante
        capitales.put("Guatemala", "Ciudad de Guatemala");
        capitales.put("Honduras", "Tegucigalpa");
        capitales.put("Nicaragua", "Managua");
        capitales.put("Panamá", "Panamá");

        String c = "";

        // Inicio del ciclo
        do {
            // Error: `System.in.print` no existe. Lo correcto es `System.out.print`
            System.out.print("Escribe el nombre de un país y te diré su capital (o escribe 'salir' para terminar): ");
            
            // Error: `s.nextDouble()` no es correcto, se espera un String. Cambié por `nextLine()`
            c = s.nextLine();

            // Error: `equal` no existe. La forma correcta es `equals`
            if (!c.equalsIgnoreCase("salir")) {
                
                // Error: `containsValue` no es lo correcto. Buscamos por clave, no por valor.
                if (capitales.containsKey(c)) {
                    // Error: `System.print` no existe. Es `System.out.print`
                    System.out.print("La capital de " + c);
                    // Error: `ca.put(c)` no devuelve el valor, eso inserta una clave. Lo correcto es `get(c)`
                    System.out.println(" es " + capitales.get(c));
                } else {
                    System.out.print("No conozco la respuesta. ");
                    System.out.print("¿Cuál es la capital de " + c + "?: ");

                    // Usabas `String ca = s.nextLine();`, pero ya había una variable con nombre `ca` como HashMap.
                    // Cambié el nombre a `nuevaCapital` para evitar confusión.
                    String nuevaCapital = s.nextLine();

                    // Guardamos el nuevo par en el mapa
                    capitales.put(c, nuevaCapital);

                    System.out.println("Gracias por enseñarme nuevas capitales.");
                }
            }

        // Error: `wile` está mal escrito. Debe ser `while`
        } while (!c.equalsIgnoreCase("salir"));

        // Cerramos el scanner
        s.close();
    }
}
