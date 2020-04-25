/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.io.File;

/**
 *
 * @author Mahomedalid
 */

/*
* Metodo contructor principal
* Metodo main solo obtiene la ruta
* @param ruta Se Crea ruta (fisica) de en donde esta Lexer.Flex

* Metodo generarLexer
* Se importa libreria File para con esta poder ir a @ruta

//Se crea automanticamente al momento de correr metodo principal, Lexer.java (con ayuda de Lexer.flex)
*/
public class Principal {
    public static void main(String[] args) {
        String ruta = "D:/Users/bryan/Documents/NetBeansProjects/AnalizadorLexico/src/codigo/Lexer.Flex";
        generarLexer(ruta);
    
    }
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
