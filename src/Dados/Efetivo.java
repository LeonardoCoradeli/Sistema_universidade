/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dados;

/**
 *
 * @author Hmmm1
 */
public class Efetivo extends Docente {
    protected String area;
    
    public Efetivo(String nome,double salario,String nivel,String titulação,String area){
        this.codigo=Integer.toString(Universidade.cod_funcionario);
        Universidade.cod_funcionario++;
        this.tipo="Docente Efetivo";
        this.nome=nome;
        this.salario=salario;
        this.nivel=nivel;
        this.titulação=titulação;
        this.area=area;
    }
    
    @Override
    public double calcularSalario(String nivel){
        switch (nivel) {
            case "D1":
                return (this.salario+=(this.salario*0.05));
            case "D2":
                return (this.salario+=(this.salario*0.1));
            default:
                return (this.salario+=(this.salario*0.2));
        }
    }
    

}