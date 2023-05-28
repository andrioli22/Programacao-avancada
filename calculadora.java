public class Main
{
	public static void main(String[] args) {
		Calculadora c = new Calculadora (4,5);
		c.soma();
		c.mostraResultado();
		c.Produto();
		c.mostraResultado();
	}
	
	 
	
	
}



public class Calculadora {
    int x;
    int y;
    int resultado;
    
    public Calculadora (int a, int b){
        x = a;
        y = b;
    }

public void potencia(){
     //resultado = Math.pow(x,y);
    
}
public void soma (){
    resultado = x+y;
    
}
public void mostraResultado (){
System.out.println ("resultado = "+resultado);
}
public void Produto(){
    resultado = x*y;
}

}
