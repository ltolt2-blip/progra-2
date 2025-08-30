
package carro;


public class main {
    
    public static void main(String[] args) {
        Carro miCarro = new Carro ( "BMW" ,2000);
        Carro otroCarro = new Carro ( "Toyota" ,1000);
        
        if (miCarro.equals(otroCarro))
                System.out.println("Iguales");
                System.out.println (miCarro);
    }
}
