/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author Hmmm1
 */
public class Tecnico extends Funcionario {
    protected String função;
    
    public Tecnico(String nome,double salario,String nivel,String função){
        this.codigo=Integer.toString(Universidade.cod_funcionario);
        Universidade.cod_funcionario++;
        this.tipo="Técnico";
        this.nome=nome;
        this.salario=salario;
        this.nivel=nivel;
        this.função=função;
    }
    
    @Override
    public double calcularSalario(String nivel){
        if("T1".equals(nivel)){
            return (this.salario+=(this.salario*0.1));
        }
        else{
            return (this.salario+=(this.salario*0.2));
        }
    }

}
