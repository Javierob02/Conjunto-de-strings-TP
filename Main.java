package com.company;

public class Main {

    public static void main(String[] args) {
	ConjuntoDeStrings c1 = new ConjuntoDeStrings("Hola", "que", "tal", "estás", "Hola", "que");
    ConjuntoDeStrings c2 = new ConjuntoDeStrings("todo", "mal");
    ConjuntoDeStrings c3 = new ConjuntoDeStrings("que", "tal");
    ConjuntoDeStrings c4 = new ConjuntoDeStrings("que", "estás", "todo", "mal");
    ConjuntoDeStrings c5 = new ConjuntoDeStrings("Hola", "que", "tal", "estás", "mal");
    System.out.println("--------------CARDINAL--------------------");
    System.out.println(c1.elementos());
    System.out.println(c1.cardinal());
    System.out.println("---------------ESTÁ_VACÍO-------------------");
    System.out.println(c1.elementos());
    System.out.println(c1.estáVacío());
    System.out.println("---------------AÑADE-------------------");
    System.out.println(c1.elementos());
    System.out.println("buenas");
    System.out.println(c1.añade("buenas"));
    System.out.println(c1.elementos());
    System.out.println("---------------PERTENECE-------------------");
    System.out.println(c1.elementos());
    System.out.println("no");
    System.out.println(c1.pertenece("no"));
    System.out.println("----------------UNIÓN------------------");
    System.out.println(c1.elementos());
    System.out.println(c2.elementos());
    System.out.println((c1.unión(c2)).elementos());
    System.out.println("---------------INTERSECCIÓN-------------------");
    System.out.println(c1.elementos());
    System.out.println(c4.elementos());
    System.out.println((c1.intersección(c4)).elementos());
    System.out.println("---------------DIFERENCIA-------------------");
    System.out.println(c1.elementos());
    System.out.println(c4.elementos());
    System.out.println((c1.diferencia(c4)).elementos());
    System.out.println("-----------------EQUALS-----------------");
    System.out.println(c1.elementos());
    System.out.println(c5.elementos());
    System.out.println(c1.equals(c5));
    System.out.println("----------------CONTENIDO------------------");
    System.out.println(c1.elementos());
    System.out.println(c3.elementos());
    System.out.println(c1.contenido(c3));
    System.out.println("------------------ELEMENTOS----------------");
    System.out.println(c1.elementos());
    }
}
