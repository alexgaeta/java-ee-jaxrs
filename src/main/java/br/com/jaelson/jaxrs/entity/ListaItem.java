package br.com.jaelson.jaxrs.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by jaels on 03/11/2016.
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ListaItem {
    private int id;
    private String descricao;
    private  int qtde;

     public  ListaItem(){

     }

    public ListaItem(int id, String descricao, int qtde) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }
}
