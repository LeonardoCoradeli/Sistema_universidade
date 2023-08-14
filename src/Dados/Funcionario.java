/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author Hmmm1
 */
public abstract class Funcionario {
    protected String codigo;
    protected String tipo;
    protected String nome;
    protected double salario;
    protected String nivel;
    protected static int cod=0;
    
    public abstract double calcularSalario(String nivel);
    
    public  String[] exibir(){
        String retorno[]=new String[4];
        retorno[0]=this.codigo;
        retorno[1]=this.nome;
        retorno[2]=this.tipo;
        retorno[3]=this.nivel;
        return retorno;
    }
    
    public Double getSalario(){
        return this.salario;
    }
}
