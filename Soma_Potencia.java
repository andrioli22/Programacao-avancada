public class Main
{
	public static void main(String[] args) {
		mensagem("dkfjn");
		System.out.println("10+2 = " + soma(10,2));
		pot(10,2);
		
	}
	
	public static void mensagem (String m){
	    System.out.println(m);
	}
	
	public static int soma (int a, int b){
	    return a+b;
	}
	
	public static void pot (int x, int y){
	    mensagem (x+" elevado a "+y+"="+Math.pow(x,y));
	}
}
