
package excepcion; //Es un pauqete que organiza el proyecto

import java.util.ArrayList; // Importa la clase ArrayList, para la lista dinámica.

import java.util.Scanner; // Importa la clase Scanner, para leer datos desde el teclado.


public class excep {   

    public static void main(String[] args) {  
    // Método principal main
        Scanner sc = new Scanner(System.in);  
        // Se crea un objeto Scanner para leer entradas del usuario.

        ArrayList<String> historial = new ArrayList<>();  
        // Se crea una lista (historial) para guardar las operaciones realizadas.

        boolean continuar = true;  
        // Variable booleana 

        while (continuar) {  
        // Bucle principal que se repite mientras continuar sea true.
        
            try {  
            // Inicio del bloque try (intenta ejecutar este código, si hay error, lo atrapa catch).

                System.out.println("\n Calculadora:");  
                // Mensaje en pantalla

                System.out.println("1. Suma");  
                System.out.println("2. Resta");  
                System.out.println("3. Multiplicacion");  
                System.out.println("4. Division");  
                System.out.println("5. Raiz cuadrada");  
                System.out.println("6. Salir");  
                // Imprime el menú de opciones.

                System.out.print("Seleccione una opcion: ");  
                // Pide al usuario que seleccione una opción.

                int opcion = sc.nextInt();  
                // Lee la opción seleccionada por el usuario.

                if (opcion == 6) {  
                // Si la opción es 6, significa salir del programa.
                    System.out.println("Saliendo programa..............");  
                    continuar = false;  
                    // Cambia continuar a false para terminar el bucle.
                    break;  
                    // Sale inmediatamente del while.
                }

                System.out.print("Ingrese el primer numero: ");  
                // Pide al usuario el primer número.

                double num1 = sc.nextDouble();  
                // Lee el primer número ingresado.

                double num2 = 0;  
                // Inicializa num2 en 0.

                if (opcion >= 1 && opcion <= 4) {  
                // Si la opción es suma, resta, multiplicación o división…
                    System.out.print("Ingrese el segundo numero: ");  
                    // Pide el segundo número.
                    num2 = sc.nextDouble();  
                    // Lee el segundo número.
                }

                double resultado = 0;  
                // Variable para guardar el resultado de la operación.

                String operacion = "";  
                // Variable para guardar el texto de la operación realizada.

                switch (opcion) {  
                // Según la opción seleccionada, se hace un cálculo distinto.
                    case 1:  
                        resultado = num1 + num2;  
                        operacion = "Suma: " + num1 + " + " + num2 + " = " + resultado;  
                        break;

                    case 2:  
                        resultado = num1 - num2;  
                        operacion = "Resta: " + num1 + " - " + num2 + " = " + resultado;  
                        break;

                    case 3:  
                        resultado = num1 * num2;  
                        operacion = "Multiplicación: " + num1 + " * " + num2 + " = " + resultado;  
                        break;

                    case 4:  
                        if (num2 == 0) {  
                        // Si el segundo número es 0, no se puede dividir.
                            throw new ValorNoValido(" No se puede dividir entre cero.");  
                            // Lanza excepción personalizada con mensaje de error.
                        }
                        resultado = num1 / num2;  
                        operacion = "Division: " + num1 + " / " + num2 + " = " + resultado;  
                        break;

                    case 5:  
                        if (num1 < 0) {  
                        // Si el número es negativo, no se puede calcular raíz cuadrada.
                            throw new ValorNoValido("No se puede calcular la raiz cuadrada de un numero negativo.");  
                            // Lanza excepción personalizada.
                        }
                        resultado = Math.sqrt(num1);  
                        // Calcula la raíz cuadrada con la clase Math.
                        operacion = "Raiz cuadrada de " + num1 + " = " + resultado;  
                        break;

                    default:  
                        System.out.println(" Opcion invalida.");  
                        // Si no es ninguna de las opciones válidas.
                        continue;  
                        // Regresa al inicio del while.
                }

                System.out.println(" Resultado: " + resultado);  
                // Imprime el resultado de la operación.

                historial.add(operacion);  
                // Guarda la operación en el historial.

                // Preguntar si desea volver al menú
                System.out.print("\n Desea realizar otra operacion? (s/n): ");  
                // Pide al usuario si quiere hacer otra operación.
                String respuesta = sc.next().toLowerCase();  
                // Lee la respuesta y la convierte a minúscula.
                if (!respuesta.equals("s")) {  
                // Si la respuesta no es "s", termina el programa.
                    continuar = false;  
                    System.out.println("Saliendo del programa........");  
                }

            } catch (ValorNoValido e) {  
            // Atrapa errores de tipo ValorNoValido (números inválidos como dividir entre 0).
                System.out.println( e.getMessage());  
                // Muestra el mensaje de error de la excepción.

            } catch (Exception e) {  
            // Atrapa cualquier otro error (por ejemplo, si se ingresa texto en lugar de número).
                System.out.println("️ Entrada invalida. Intente nuevamente.");  
                sc.nextLine(); // Limpiar el buffer para evitar bucle infinito.
            }
        }

        sc.close();  
        // Cierra el Scanner para liberar recursos.
    }
}