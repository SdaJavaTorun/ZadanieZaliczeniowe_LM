package com.zadaniezaliczeniowe;

/**
 * Created by RENT on 2017-03-18.
 */
public class Human {

    public String imie;
    public String nazwisko;
    public String plec;
    public int nrDzialu;
    public float placa;
    public int wiek;
    public int dzieci;
    public boolean stan_cywilny;

    public Human() {

    }

    public Human(String imie, String nazwisko, String plec, int nr_dzialu, float placa, int wiek, int dzieci, boolean stan_cywilny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.nrDzialu = nr_dzialu;
        this.placa = placa;
        this.wiek = wiek;
        this.dzieci = dzieci;
        this.stan_cywilny = stan_cywilny;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    public int getNrDzialu() {
        return nrDzialu;
    }

    public void setNrDzialu(int nrDzialu) {
        this.nrDzialu = nrDzialu;
    }

    public float getPlaca() {
        return placa;
    }

    public void setPlaca(float placa) {
        this.placa = placa;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getDzieci() {
        return dzieci;
    }

    public void setDzieci(int dzieci) {
        this.dzieci = dzieci;
    }

    public boolean isStan_cywilny() {
        return stan_cywilny;
    }

    public void setStan_cywilny(boolean stan_cywilny) {
        this.stan_cywilny = stan_cywilny;
    }

    @Override
    public String toString() {
        return "Human{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", plec='" + plec + '\'' +
                ", nrDzialu=" + nrDzialu +
                ", placa=" + placa +
                ", wiek=" + wiek +
                ", dzieci=" + dzieci +
                ", stan_cywilny=" + stan_cywilny +
                '}';
    }
}




