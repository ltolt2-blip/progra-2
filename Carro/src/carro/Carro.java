
package carro;


public class Carro {

private String marca;
private int precio;

public Carro (String marca, int precio)
{
 this.marca = marca;
 this.precio = precio; }

public int getPrecio ()
{  return precio;}

public String getMarca ()
{ return marca;}

public boolean aquals (Object obj )
{
    Carro otro = (Carro) obj;
    return (otro.getPrecio() == this.precio) && (otro.getMarca().equals(this.marca));
}

protected Object clone () {
    return new Carro (marca, precio);
}

public String toString (){
    return "(" +marca + " , " + precio + " ) ";
}

}
