/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company;

public class NodoArbol {
	private String dato;
	private Integer frecuencia;
	private NodoArbol izq;
	private NodoArbol der;
	
	public Integer getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(Integer frecuencia) {
		this.frecuencia = frecuencia;
	}
	public String getDato() {
		return dato;
	}
	public void setDato(String dato) {
		this.dato = dato;
	}
	public NodoArbol getIzq() {
		return izq;
	}
	public void setIzq(NodoArbol izq) {
		this.izq = izq;
	}
	public NodoArbol getDer() {
		return der;
	}
	public void setDer(NodoArbol der) {
		this.der = der;
	}

	NodoArbol(String d, Integer n){
		dato=d;
		frecuencia=n;
		izq=null;
		der=null;
	}
}
