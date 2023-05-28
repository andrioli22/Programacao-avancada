public class Main
{
	public static void main(String[] args) {
		
		// criando um construtor
		triangulo x = new triangulo (7, 7, 7, 2);
		
		//metodos 
		    if (x.formatriangulo () == 0){
		    System.out.println("os valores nao formam um triangulo");
		}
		else {
		    System.out.println("os valores formam um triangulo");
		    
		    
		    x.mostraTipo();
		}
		
		x.perimetro();
		System.out.println("o perimetro é " + x.perimetro());
		
		
		System.out.println ("a area e " + x.area());
	}
}

public class triangulo {
    //atributos - variaveis
    int ladoa;
    int ladob;
    int ladoc;
    int alt;
    
    // construtores (chamado no new)
    
    public triangulo (int a, int b, int c, int d){
        ladoa = a;
        ladob = b;
        ladoc = c;
        alt = d;
    }
    
    //Métodos = funcionalidades
    
    public int formatriangulo(){
        
         //maior que o valor absoluto da diferenca dos outros dois lados
         
        int aux = 0;
        if (ladoa>diferenca(ladob,ladoc)&& 
            ladob>diferenca(ladoa, ladoc) &&
            ladoc>diferenca(ladoa,ladob)&&
            
        //menor que a soma dos outros dois lados
        
        ladoa<ladob+ladoc &&
        ladob<ladoa+ladoc &&
        ladoc<ladoa+ladob)
        
        aux = 1; //eh um triangulo
        return aux;
    }
    
    public void mostraTipo(){
        
    //equilatero (3 lados sao iguais)
// isosceles (2 lados sao iguais e um diferente
// escaleno (3 lados sao diferentes)

if (ladoa==ladob && ladoa==ladoc)
    System.out.println ("triangulo equilatero");
    else if (ladoa!=ladob && ladoa!=ladoc && ladob!=ladoc){
    System.out.println ("triangulo escaleno");
    }
    else {
        System.out.println ("triangulo triangulo");
    }
}
    private int diferenca (int a, int b){
        
        //por exemplo: se passar 3 e 4 (nesta ordem), retorna 1
        //se passar 4 e 3, retorna 1
        
    int aux;
        aux = b-a;
        if (aux < 0) aux = aux * (-1);
        return aux; 
}
public int perimetro(){
    return ladoa+ladob+ladoc;
}

public int area(){
return alt*ladoc;
}
}
