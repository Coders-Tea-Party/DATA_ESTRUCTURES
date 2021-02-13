package Sololearn_Java_Poblemas;

import java.util.Timer;

/**
 * 
 *
 * @author gendry
 */
public class Main {
    public static void main(String[] args) {
        
        System.out.println("Deuda restante: "+Problemas.Calcular_Prestamo(20000));
        System.out.println("Cadena invertida: "+Problemas.Invertir_Cadena("JAVA"));
        System.out.println("Binario: "+Problemas.Convertir_Binario(3));
        
        int x= 5;
        int y= 2;
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        
        a.area();
        b.area();
        
        Bowling game = new Bowling();
        
        game.addPlayer("Dave", 15);
        game.addPlayer("Amy", 17);
        game.addPlayer("Rob", 99);
        
        System.out.println(game.getWinner());
    }
}
