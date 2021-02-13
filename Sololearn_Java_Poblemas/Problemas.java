package Sololearn_Java_Poblemas;

import java.util.HashMap;
import java.util.Iterator;

/**
 * <p>version JDK 11.0.10<p>
 *<i>@author Gendry Gonzalez Collazo ->> Problemas del 2 - 6 Curso de Java en
 * Sololearn
 */
class Problemas {

    /**
     * <p>
     * Problema 2
     * <p>
     * Calcular la suma de dinero restante despues de 6 meses devolviendo un
     * <i>10% mensualmente
     */
    static int Calcular_Prestamo(int prestamo) {
        int counter = 0;          //variable contadora del ciclo while
        int aux = prestamo;        //variable auxiliar para almacenar la cantidad y el resultado finalmente
        while (counter < 6) {      //6 ciclos
            aux -= (aux * 0.1);      //multiplicacion  de la variable (10% = 1/10 = 0.1)
            counter++;           //incremento
        }
        return aux;
    }

    /**
     * <p>
     * Problema 3
     * <p>
     * Invertir una cadena de texto con el uso de ciclo for y variable auxiliar
     */
    static String Invertir_Cadena(String cadena) {
        char[] chain = cadena.toCharArray();           //convierte en char array el string
        char[] r_chain = new char[chain.length];        //crea un char array de longitud de la cadena dada
        int aux = 0;                                   //variable auxiliar
        String finalSt = "";

        for (int i = cadena.length(); i > 0; i--) {   //ciclo for donde i = longitud de la cadena dada
            r_chain[aux] = chain[(i - 1)];                 //cambio de la ultima posicion de la cadena a el primero del array resultante
            finalSt += r_chain[aux];                     //String final
            aux++;                                     //aumento del auxiliar        
        }
        return finalSt;                            //conversion a string
    }

    /**
     * <p>
     * Problema 4
     * <p>
     * Conversion a binario de un entero y lo devuelve como cadena de texto
     */
    static String Convertir_Binario(int noBinary) {
        String binary = Integer.toBinaryString(noBinary);
        return binary;
    }
}

/**
 * <p>
 * Problema 5
 * <p>
 * Implementar una clase abstracta extender dos clases de el y calcular el area
 */
abstract class Shape {  //clase abstracta 

    int width;         //int ancho

    abstract void area();    //metodo abstracto area
}

class Square extends Shape {  //poliformismo de la clase shape

    Square(int width) {      //constructor del cuadrado
        super.width = width;
    }

    @Override
    void area() {   //sombreado del metodo area
        System.out.println("Area del cuadrado: " + width * width);
    }
}

class Circle extends Shape {   //poliformismo de la clase shape

    Circle(int width) {         //constructor del circulo
        super.width = width;
    }

    @Override
    void area() {     //sombreado de la clase area
        System.out.println("Area del circulo: " + Math.PI * width * width);
    }
}
/**
 * <p>Problema 6<p> Iterar sobre un hashMap para
 * comparar sus valores y regresar el mayor
 * de ellos
 */
class Bowling {       //clase bowling       
    HashMap<String, Integer> players;   //creando tabla hasMap
    public Bowling() {                  //constructor de la clase
        players = new HashMap<String, Integer>();     //inicializando hashmap
    }
    void addPlayer(String name, int p){         //metodo para añadir valores
        players.put(name, p);
    }
    public String getWinner(){       //metodo que devuelve el de mayor valor
        String winner=""; 
        int max_val=0;            //variable de valor maximo
        Iterator<String> iter =players.keySet().iterator();   //iterador del hashmap para recorrerlo
        while(iter.hasNext()){               //ciclo while mientras exista valor en el hash
            String player=iter.next();       //variable que almacena el indice
            if (players.get(player)>max_val){      //condicional que compara el valor actual con la variable
                max_val=players.get(player);       //coloca el valor maximo si se cumple condicional
                winner=player;                     //establece el indice del valor maximo
            }
        }

        return winner;       //devuelve el indice de valor maximo del hashmap
    }
}
