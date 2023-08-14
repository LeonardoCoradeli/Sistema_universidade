/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

import static Dados.Departamento.num_funcionarios;
import java.util.Arrays;

public class Universidade {
    
    protected static String nome;
    protected Departamento departamentos[];
    protected static int num_departamento=0;
    protected static int cod_funcionario=0;
    
    final static int MAX=100;
    
    public Universidade(){
        departamentos=new Departamento[MAX];
    }
    
    public static void set_nome(String novonome){
        nome=novonome;
    }
    
    public Boolean set_departamentos(Departamento departamento){
        for (Departamento dep : this.departamentos) {
            if (dep != null && dep.nome.equals(departamento.nome)) {
                return false;
            }
        }
        
        this.departamentos[num_departamento] = departamento;
        num_departamento++;
        return departamentos[num_departamento-1] != null;
    }
    
    public String exibir_departamento(int indice){
        if(departamentos[indice]!=null){
            return departamentos[indice].nome;}
        else{
            return "Não encontrado";
        }
    }
    
     public Departamento[] exibir_departamento(){
        return this.departamentos;
    }
     
    public String[][] exibir_funcionarios(){
        String[][] resultado = new String[num_departamento * MAX][5];
        int Index = 0;
        for (int i = 0; i < num_departamento; i++) {
            String[][] funcionarios = departamentos[i].exibir_funcionarios();
            if(funcionarios!=null || funcionarios.length!=0){
              int numlinhas = funcionarios.length;
              System.arraycopy(funcionarios, 0, resultado, Index, numlinhas);
              Index += numlinhas;  
            }
            
        }
        return resultado;
    }
    
    public String[][] exibir_tecnicos(){
        String[][] resultado = new String[num_departamento * MAX][5];
        int Index = 0;
        for (int i = 0; i < num_departamento; i++) {
            String[][] tecnicos = departamentos[i].exibir_tecnicos();
            int numlinhas = tecnicos.length;
            System.arraycopy(tecnicos, 0, resultado, Index, numlinhas);
            Index += numlinhas;
        }
        return resultado;
    }
    
    public String[][] exibir_docentes(){
            String[][] resultado = new String[num_departamento * MAX][5];
            int Index = 0;
            for (int i = 0; i < num_departamento; i++) {
                String[][] docentes = departamentos[i].exibir_docentes();
                int numlinhas = docentes.length;
                System.arraycopy(docentes, 0, resultado, Index, numlinhas);
                Index += numlinhas;
            }
            return resultado;
     }
    
    public String [][]exibir_docentes_efetivos(){
        String[][] resultado = new String[num_departamento * MAX][5];
                int Index = 0;
                for (int i = 0; i < num_departamento; i++) {
                    String[][] efetivos = departamentos[i].exibir_docentesEfetivos();
                    int numlinhas = efetivos.length;
                    System.arraycopy(efetivos, 0, resultado, Index, numlinhas);
                    Index += numlinhas;
                }
                return resultado;
    }
    
    public String [][]exibir_docentes_substitutos(){
        String[][] resultado = new String[num_departamento * MAX][5];
                int Index = 0;
                for (int i = 0; i < num_departamento; i++) {
                    String[][] substitutos = departamentos[i].exibir_docentesSubstitutos();
                    int numlinhas = substitutos.length;
                    System.arraycopy(substitutos, 0, resultado, Index, numlinhas);
                    Index += numlinhas;
                }
                return resultado;
    }
    
    public String [][]buscar_funcionario_nome(String nome){
        String resultado[][] = new String[num_departamento * MAX][5];
        int j = 0;
        for (int i = 0; i < num_departamento; i++) {
            if (departamentos[i].pesquisar_funcionario_nome(nome) != null) {
                String[][] funcionariosEncontrados = departamentos[i].pesquisar_funcionario_nome(nome);
                for (int k = 0; k < funcionariosEncontrados.length; k++) {
                    resultado[j] = funcionariosEncontrados[k];
                    j++;
                }
            }
        }
        if (j == 0) {
            return null;
        } else {
            return Arrays.copyOf(resultado, j);
        }
    }
    
    public String [][]buscar_funcionario_codigo(String codigo){
        String resultado[][] = new String[num_departamento * MAX][5];
        int j = 0;
        for (int i = 0; i < num_departamento; i++) {
            if (departamentos[i].pesquisar_funcionario_codigo(codigo) != null) {
                String[][] funcionariosEncontrados = departamentos[i].pesquisar_funcionario_codigo(codigo);
                for (int k = 0; k < funcionariosEncontrados.length; k++) {
                    resultado[j] = funcionariosEncontrados[k];
                    j++;
                }
            }
        }
        if (j == 0) {
            return null;
        } else {
            return Arrays.copyOf(resultado, j);
        }
    }
    
    public String[][] buscar_funcionario_salario(double min,double max){
        String resultado[][] = new String[num_departamento * MAX][5];
        int j = 0;
        for (int i = 0; i < num_departamento; i++) {
            if (departamentos[i].pesquisar_funcionario_por_salario(min,max) != null) {
                String[][] funcionariosEncontrados = departamentos[i].pesquisar_funcionario_por_salario(min,max);
                for (int k = 0; k < funcionariosEncontrados.length; k++) {
                    resultado[j] = funcionariosEncontrados[k];
                    j++;
                }
            }
        }
        if (j == 0) {
            return null;
        } else {
            return Arrays.copyOf(resultado, j);
        }
    }

        
    public Departamento[] buscar_departamento_valor(Double valor){
        Departamento[] resultado = new Departamento[num_departamento];
        int cont=0;
        for(int i=0;i<departamentos.length;i++){
            if(departamentos[i]!=null && departamentos[i].exibir_gastos().equals(valor)){
                resultado[cont]=departamentos[i];
                cont++;
            }
        }
        return resultado;
    }


    
}
