/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author Hmmm1
 */
public class Substituto extends Docente{
    protected int cargaHoraria;
    
    public Substituto(String nome,double salario,String nivel,String titulação,int cargahoraria){
        this.codigo=Integer.toString(Universidade.cod_funcionario);
        Universidade.cod_funcionario++;
        this.tipo="Docente Substituto";
        this.nome=nome;
        this.salario=salario;
        this.nivel=nivel;
        this.titulação=titulação;
        this.cargaHoraria=cargahoraria;
    }
    
    @Override
    public double calcularSalario(String nivel){
        switch (nivel) {
            case "S1":
                return (this.salario+=(this.salario*0.05));
            default:
                return (this.salario+=(this.salario*0.1));
        }
    }
    
}
