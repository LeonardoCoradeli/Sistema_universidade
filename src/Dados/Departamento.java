/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import java.util.Arrays;

/**
 *
 * @author Hmmm1
 */
public class Departamento {
    protected String codigo;
    protected String nome;
    protected Funcionario funcionarios[];
    protected static int num_funcionarios=0;
    
    public Departamento(String nome){
        this.codigo=Integer.toString(Universidade.num_departamento);
        this.nome=nome;
        funcionarios = new Funcionario[Universidade.MAX];
    }
    
    public Boolean setfuncionario(Funcionario funcionario){
        for (Funcionario fun : funcionarios) {
            if (fun != null && fun.nome.equals(funcionario.nome)) {
                return false;
            }
        }
        
        this.funcionarios[Departamento.num_funcionarios] = funcionario;
        Departamento.num_funcionarios++;
        return funcionarios[Departamento.num_funcionarios-1] != null;
    }
    
    public String[][] exibir_funcionarios() {
    if (this.funcionarios == null) {
        return null;
    }

    int numFuncionarios = this.funcionarios.length;
    String[][] retorno = new String[numFuncionarios][5];
    for (int i = 0; i < numFuncionarios; i++) {
        if (funcionarios[i] != null) {
            String[] exibicao = funcionarios[i].exibir();
            if (exibicao.length == 4) {
                retorno[i] = new String[] { exibicao[0], exibicao[1], exibicao[2], exibicao[3], this.nome };
            }
        }
    }
    return retorno;
}

    
    public String[][] exibir_tecnicos(){
        if (this.funcionarios == null) {
        return null;
    }

    int numFuncionarios = this.funcionarios.length;
    String[][] retorno = new String[numFuncionarios][5];
    for (int i = 0; i < numFuncionarios; i++) {
        if (funcionarios[i] != null && funcionarios[i].tipo.equals("Técnico")) {
            String[] exibicao = funcionarios[i].exibir();
            if (exibicao.length == 4) {
                retorno[i] = new String[] { exibicao[0], exibicao[1], exibicao[2], exibicao[3], this.nome };
            }
        }
    }
    return retorno;
}
    
    public String[][] exibir_docentes(){
        if (this.funcionarios == null) {
        return null;
    }

    int numFuncionarios = this.funcionarios.length;
    String[][] retorno = new String[numFuncionarios][5];
    for (int i = 0; i < numFuncionarios; i++) {
        if (funcionarios[i] != null && funcionarios[i].tipo.contains("Docente")) {
            String[] exibicao = funcionarios[i].exibir();
            if (exibicao.length == 4) {
                retorno[i] = new String[] { exibicao[0], exibicao[1], exibicao[2], exibicao[3], this.nome };
            }
        }
    }
    return retorno;
}
   
    public String[][] exibir_docentesEfetivos(){
        if (this.funcionarios == null) {
        return null;
    }

    int numFuncionarios = this.funcionarios.length;
    String[][] retorno = new String[numFuncionarios][5];
    for (int i = 0; i < numFuncionarios; i++) {
        if (funcionarios[i] != null && funcionarios[i].tipo.equals("Docente Efetivo")) {
            String[] exibicao = funcionarios[i].exibir();
            if (exibicao.length == 4) {
                retorno[i] = new String[] { exibicao[0], exibicao[1], exibicao[2], exibicao[3], this.nome };
            }
        }
    }
    return retorno;
}
    
    public String[][] exibir_docentesSubstitutos(){
        if (this.funcionarios == null) {
        return null;
    }

    int numFuncionarios = this.funcionarios.length;
    String[][] retorno = new String[numFuncionarios][5];
    for (int i = 0; i < numFuncionarios; i++) {
        if (funcionarios[i] != null && funcionarios[i].tipo.equals("Docente Substituto")) {
            String[] exibicao = funcionarios[i].exibir();
            if (exibicao.length == 4) {
                retorno[i] = new String[] { exibicao[0], exibicao[1], exibicao[2], exibicao[3], this.nome };
            }
        }
    }
    return retorno;
}
    
    public String[][] pesquisar_funcionario_codigo(String codigo){
        String funcionarios_pesquisados[][] = new String[num_funcionarios][5];
        int j=0;
        for (int i = 0; i < num_funcionarios; i++) {
            if (funcionarios[i].codigo.contains(codigo)) {
                String func[] = funcionarios[i].exibir();
                funcionarios_pesquisados[i][0] = func[0];
                funcionarios_pesquisados[i][1] = func[1];
                funcionarios_pesquisados[i][2] = func[2];
                funcionarios_pesquisados[i][3] = func[3];
                funcionarios_pesquisados[i][4] = this.nome;
                j++;
            }
        }
        return funcionarios_pesquisados;

    }
    
    public String[][] pesquisar_funcionario_nome(String nome){
        String funcionarios_pesquisados[][] = new String[num_funcionarios][5];
        int j=0;
        for (int i = 0; i < num_funcionarios; i++) {
            if (funcionarios[i]!=null && funcionarios[i].nome.contains(nome)) {
                String func[] = funcionarios[i].exibir();
                funcionarios_pesquisados[j][0] = func[0];
                funcionarios_pesquisados[j][1] = func[1];
                funcionarios_pesquisados[j][2] = func[2];
                funcionarios_pesquisados[j][3] = func[3];
                funcionarios_pesquisados[j][4] = this.nome;
                j++;
            }
        }
        return Arrays.copyOf(funcionarios_pesquisados, j);
    }
    
    public String[][] pesquisar_funcionario_por_salario(double min,double max) {
        String funcionarios_pesquisados[][] = new String[num_funcionarios][5];
        int j=0;
        for (int i = 0; i < num_funcionarios; i++) {
            if (funcionarios[i]!=null && funcionarios[i].getSalario()>=min && funcionarios[i].getSalario()<=max) {
                String func[] = funcionarios[i].exibir();
                funcionarios_pesquisados[j][0] = func[0];
                funcionarios_pesquisados[j][1] = func[1];
                funcionarios_pesquisados[j][2] = func[2];
                funcionarios_pesquisados[j][3] = func[3];
                funcionarios_pesquisados[j][4] = this.nome;
                j++;
            }
        }
        return Arrays.copyOf(funcionarios_pesquisados, j);
    }


    
    public String exibir_nome(){
        return this.nome;
    }
    
    public Double calcular_salario(Funcionario funcionario,String nivel){
        return funcionario.calcularSalario(nivel);
    }
    
    public Double exibir_gastos(){
        Double soma=0.0;
        for(Funcionario fun:funcionarios){
            if(fun!=null){
                soma=soma+fun.getSalario();
            }
        }
        return soma;
    }
    
    public String exibir_cod(){
        return this.codigo;
    }
}
