package org.fasttrackit;

public class MathOperation {
    double nr1,nr2;
    double rezultat;




    public double suma(double nr1, double nr2){
        rezultat = nr1+nr2;
        return rezultat;
    }

    public double scadere(double nr1, double nr2){
        rezultat = nr1-nr2;
        return rezultat;
    }

    public double produs(double nr1, double nr2){
        rezultat = nr1*nr2;
        return rezultat;
    }

    public double impartire(double nr1, double nr2){
        rezultat = nr1/nr2;
        return rezultat;
    }

}
