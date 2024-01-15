package projetoheranca;

public class Funcionario {

    public String nome;
    public double salario;
    public int codfunc;

    public Funcionario () {}
   
    public Funcionario(String nome, double salario, int codfunc) {
        this.nome = nome;
        this.salario = salario;
        this.codfunc = codfunc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getCodfunc() {
        return codfunc;
    }

    public void setCodfunc(int codfunc) {
        this.codfunc = codfunc;
    }
 
}
