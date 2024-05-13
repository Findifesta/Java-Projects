package com.LISTA;

//Verifica a área e perímetro de um triângulo

public class Triangulo {
private double lado;
private double area;
private double perimetro;

public Triangulo(double lado) {
	this.lado = lado;
}

public double getLado() {
	return lado;
}
public double getArea() {
	return area;
}
public double getPerimetro() {
	return perimetro;
}

public void calcArea(){
	area = (getLado() * Math.sqrt(3)) / 2;
	System.out.println("A área do triangulo eh "+getArea());
}
public void calcPerimetro(){
	perimetro = getLado() * 3;
	System.out.println("A área do triangulo eh "+getPerimetro());
}

}
