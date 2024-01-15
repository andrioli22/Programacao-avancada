package projetoheranca;

public class TestaHeranca {

    public static void main(String[] args) {

        Gerente x = new Gerente(2400, "Paulo", 16700, 55320 ); // x é gerente...

        Funcionario[] set = new Funcionario[3];
        set[0] = x;
        set[1] = new Funcionario("Antonieta",
                760.5, 49211); // set[1] é empregado

        set[2] = new Funcionario("Aurio",
                1220.5, 43678); // set[2] é empregado

        for (int i = 0; i < set.length; i++) {
            System.out.println(set[i].getNome()
                    + " " + set[i].getSalario());
        }

//            Funcionario f = new Funcionario ();
//            f.nome = "Daniel";
//            f.codfunc = 123;
//            f.salario = 1000;
//          
//            Gerente g = new Gerente ();
//            g.nome = "Jose";
//            g.codfunc = 999;
//            g.salario = 2000;
//            g.bonus = 500;  
    }

}
