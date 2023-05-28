public class Main
{
	public static void main(String[] args) {
	TADPilha p = new TADPilha(2);
	
	int n = 10, resto;
	
	while(n != 0){
	    resto = n%2;
	    p.empilha(resto);
	    System.out.println("a pilha p tem: "+p.conta());
	    n=n/2;
	}
	System.out.println("mostra ao contrario");
	p.mostraAoContrario();
	System.out.println("mostra normal");
	p.mostra();
}
}


public class TADPilha{
    int dados[];
    int topo;
    int capacidade;
    //construtor
    public TADPilha(int c){
        capacidade = c;
        topo = -1;
        dados = new int [capacidade];
    }

public boolean empilha (int x){
    if(!cheia()){
 topo++;
 dados[topo]=x;
 return true;
    }
    System.out.println ("cheia");
    return false;
}

public void mostraAoContrario(){
    for (int i=topo; i>=0; i--)
    System.out.println(dados[i]);
}
public void mostra(){
    for (int i=0; i<=topo; i++)
    System.out.println(dados[i]);
}
public boolean cheia(){
  return (topo == capacidade-1);  
}
public boolean vazia(){
    return (topo == -1);
}
public int conta (){
    return topo+1;
}
}
