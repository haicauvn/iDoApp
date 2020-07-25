package com.example.todo_app;

public class MyDoes {
    String titledoes, datedoes, descdoes, keydoes;

    public String getKeydoes() {
        return keydoes;
    }

    public void setKeydoes(String keydoes) {
        this.keydoes = keydoes;
    }

    public MyDoes() {
    }

    public MyDoes(String titledoes) {
        this.titledoes = titledoes;
    }

    public MyDoes(String titledoes, String datedoes, String descdoes, String keydoes) {
        this.titledoes = titledoes;
        this.datedoes = datedoes;
        this.descdoes = descdoes;
        this.keydoes = keydoes;
    }

    public MyDoes(String titledoes, String datedoes, String descdoes) {
        this.titledoes = titledoes;
        this.datedoes = datedoes;
        this.descdoes = descdoes;
    }

    public MyDoes(String titledoes, String datedoes) {
        this.titledoes = titledoes;
        this.datedoes = datedoes;
    }

    public String getTitledoes() {
        return titledoes;
    }

    public void setTitledoes(String titledoes) {
        this.titledoes = titledoes;
    }

    public String getDatedoes() {
        return datedoes;
    }

    public void setDatedoes(String datedoes) {
        this.datedoes = datedoes;
    }

    public String getDescdoes() {
        return descdoes;
    }

    public void setDescdoes(String descdoes) {
        this.descdoes = descdoes;
    }

    @Override
    public String toString() {
        return "MyDoes{" +
                "titledoes='" + titledoes + '\'' +
                ", datedoes='" + datedoes + '\'' +
                ", descdoes='" + descdoes + '\'' +
                '}';
    }
}
