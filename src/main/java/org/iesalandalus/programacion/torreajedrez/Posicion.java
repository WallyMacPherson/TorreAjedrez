package org.iesalandalus.programacion.torreajedrez;

import java.util.Objects;

public class Posicion {
    private int fila;
    private char columna;

    /** constructor */
    public Posicion (int fila, char columna) {
        setFila(fila);
        setColumna(columna);
    }

    /** constructor copia */
    public Posicion(Posicion posicion) {
        if (posicion == null) {
            throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
        }
        setFila(posicion.getFila());
        setColumna(posicion.getColumna());
    }

    /** setter fila */
    private void setFila(int fila) {
        if (fila < 1 || fila > 8) {
			/*Hubiera creado una constante para el texto del error, pero dejo un literal
			  para ajustarme a la definicion de la clase */
            throw new IllegalArgumentException("ERROR: Fila no válida.");
        } else {
            this.fila = fila;
        }
    }

    /** getter fila */
    public int getFila() {
        return fila;
    }

    /** setter columna */
    private void setColumna(char columna) {
        if (columna < 'a' || columna > 'h') {
			/*Hubiera creado una constante para el texto del error, pero dejo un literal
			  para ajustarme a la definicion de la clase */
            throw new IllegalArgumentException("ERROR: Columna no válida.");
        } else {
            this.columna = columna;
        }
    }

    /** getter columna  */
    public char getColumna() {
        return columna;
    }

    /** método equals */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Posicion posicion = (Posicion) o;
        return fila == posicion.fila && columna == posicion.columna;
    }

    /** método hashCode */
    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }

    /** toString personalizado */
    @Override
    public String toString() {
        return "fila=" + fila + ", columna=" + columna;
    }

}
