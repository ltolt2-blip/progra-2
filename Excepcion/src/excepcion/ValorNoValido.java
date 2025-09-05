
package excepcion; //Es un paquete que roganiza el proyecto

public class ValorNoValido extends Exception {   //Es una calse publica que extiende Exception

    public ValorNoValido() {}  
    // Constructor vacío (sin parámetros).  
    

    public ValorNoValido(String mensaje) {  
    // Segundo constructor, que recibe un mensaje como parámetro.  
    

        super(mensaje);  
        // Llama al constructor de la clase padre (Exception),  

    }
}
