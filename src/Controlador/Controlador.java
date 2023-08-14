/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Dados.Departamento;
import Dados.Efetivo;
import Dados.Substituto;
import Dados.Tecnico;
import Dados.Universidade;
import javax.swing.JDialog;

/**
 *
 * @author Hmmm1
 */
public class Controlador {
    public static Universidade universidade;
    
    public static Boolean inicializar(String nome,String departamento1,String departamento2){
        universidade=new Universidade();
        Universidade.set_nome(nome);
        Departamento dep=new Departamento(departamento1);
        if(universidade.set_departamentos(dep)){
            if(departamento2.equals("")){
                return true;
            }
            else{
                Departamento dep2=new Departamento (departamento2);
                return universidade.set_departamentos(dep2);
            }  
        }
        else{
            return false;
        }
    }
    
    public static Boolean setDepartamento(String nome){
        return universidade.set_departamentos(new Departamento(nome));
    }
    
    public static Boolean cadastrar_docente_efetivo(Departamento departamento,
        Efetivo efetivo){
       return departamento.setfuncionario(efetivo);
    }
    
    public static Boolean cadastrar_docente_substituto(Departamento departamento,
            Substituto substituto){
       return departamento.setfuncionario(substituto);
       
    }
    
    public static Boolean cadastrar_tecnico(Departamento departamento,Tecnico tecnico){
        return departamento.setfuncionario(tecnico);
    }
    
    public static Departamento buscar_departamento(String nome){
        Departamento departamentos[]=universidade.exibir_departamento();
        for(Departamento departamento:departamentos){
            if(departamento!=null && departamento.exibir_nome().equals(nome)){
                return departamento;
            }
        }
        return null;
    }
    
    public static String[][] exibir_funcionarios(Universidade universidade){
        return universidade.exibir_funcionarios();
    }
    
    public static String[][] exibir_docentes(Universidade universidade){
        return universidade.exibir_docentes();
    }
    
    public static String[][] exibir_docentes_efetivos(Universidade universidade){
        return universidade.exibir_docentes_efetivos();
    }
    
    public static String[][] exibir_docentes_substitutos(Universidade universidade){
        return universidade.exibir_docentes_substitutos();
    }
    
    public static String[][] exibir_tecnicos(Universidade universidade){
        return universidade.exibir_tecnicos();
    }
    
    public static String[][] buscar_funcionario_nome(String nome){
        return universidade.buscar_funcionario_nome(nome);
    }
    
    public static String[][] buscar_funcionario_codigo(String codigo){
        return universidade.buscar_funcionario_codigo(codigo);
    }
    
    public static String[][] buscar_funcionario_salario(double min,double max){
        return universidade.buscar_funcionario_salario(min,max);
    }
    
    public static void fecharDialog(JDialog dialog) {
        dialog.dispose();
    }
    
    public Double exibir_gastos(Departamento dep){
        return dep.exibir_gastos();
    }
    
    public String exibir_cod(Departamento dep){
        return dep.exibir_cod();
    }
}
