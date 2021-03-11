/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdespesas;

import java.util.Date;

/**
 *
 * @author 13125877
 */
public class Despesas {
    private int id;
    private enum tipo{Fixa,Variável};
    private String titulo;
    private Double valor;
    private Date dataVencimento;
    private enum periodicidade{mensal,diária,semanal};

    
    
    public Despesas(int id, String titulo, Double valor, Date dataVencimento) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }
    
     public Despesas(int id, String titulo, Double valor) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
    }
    
    
    public void Imprimir(){
        System.out.println("#----------------------------#");
        System.out.println("ID: " + this.getId());
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Vencimento: " + this.getDataVencimento());
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    
}
