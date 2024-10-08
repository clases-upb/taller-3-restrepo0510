/*
 * This source file was generated by the Gradle 'init' task
 */
package taller3;

public class App {

   public static void main(String[] args) {
   

   }

   /*
    * 1. Construya un algoritmo e implemente la función en Java Escribir_asc que
    * reciba tres números enteros diferentes
    * y devuelva en un String en orden ascendente con el siguiente formato:
    * "##### - ##### - #####", donde el primero es
    * el mayor de todos, el segundo el del medio, el tercero el menor de todos. Si
    * hay al menos dos números iguales,
    * devolverá el mensaje: "Error: La función no considera números iguales". Si
    * hay un error inesperado, deberá mostrar
    * el mensaje: "Ocurrió un error inesperado".
    */
public static String Escribir_asc(int nro_1, int nro_2, int nro_3){
      try {
         if (nro_1 == nro_2 || nro_1 == nro_3 || nro_2 == nro_1 || nro_2 == nro_3 || nro_3 == nro_1 || nro_3 == nro_2) {
            return "Error: La función no considera números iguales";
         }
 
         int p_1, p_2, p_3;
 
         if (nro_1 > nro_2 && nro_1 > nro_3) {
            p_1 = nro_1;
            if (nro_2 > nro_3) {
                p_2 = nro_2;
                p_3 = nro_3;
            } else {
                p_2 = nro_3;
                p_3 = nro_2;
            }
        } else if (nro_2 > nro_1 && nro_2 > nro_3) {
            p_1 = nro_2;
            if (nro_1 > nro_3) {
                p_2 = nro_1;
                p_3 = nro_3;
            } else {
                p_2 = nro_3;
                p_3 = nro_1;
            }
        } else {
            p_1 = nro_3;
            if (nro_1 > nro_2) {
                p_2 = nro_1;
                p_3 = nro_2;
            } else {
                p_2 = nro_2;
                p_3 = nro_1;
            }
        }
 
         return String.format("%d - %d - %d", p_1, p_2, p_3);
 
         
      } catch (Exception e) {
     
         return "Ocurrió un error inesperado";
      }
    }



   /*
    * 2. Construya un algoritmo e implemente la función en Java Obtener_cifras que
    * recibe un número entre 0 y 50.000
    * y devuelve byte con las cifras que tiene. Por ejemplo 10 tiene dos cifras,
    * 9999 tiene 4 cifras. Si el número
    * no está en el rango devuelve 0. Y si hay un error inesperado, devuelve -1.
    * 
    */
public static byte Obtener_cifras(int nro) {
      try {
         int nro_min = 0;
         int nro_max = 50000;
         if (nro < nro_min || nro > nro_max) {
            return 0;
         }

         byte nro_cifras = (byte) String.valueOf(nro).length();
         return nro_cifras;

      } catch (Exception e) {
         return -1;
      }
   }


   /*
    * 3. Construya un algoritmo e implemente la función en Java Clasificar_char que
    * recibe un caracter, y
    * devuelve un string de acuerdo con las siguientes condiciones: si es un
    * alfabético, deuvelve "ES LETRA";
    * si es numérico, devuelve "ES NUMERO" o si es un carácter especial, devuelve
    * "ESPECIAL".
    * Los caracteres se validan de acuerdo con la tabla ascii básica y lo explicado
    * en clase.
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */
public static String Clasificar_char(char carcter){
 
      try {
         int asciiValue= (int) carcter;
       
         if (asciiValue >= 65 && asciiValue <= 90 || asciiValue >= 97 && asciiValue <= 122) {
            return "ES LETRA";
         }
       
         else if(asciiValue >= 48 && asciiValue <= 57){
            return "ES NUMERO";
         }
       
         else if (asciiValue >= 32 && asciiValue <= 47 || asciiValue >= 58 && asciiValue <= 64 || asciiValue >= 91 && asciiValue <= 96 || asciiValue >= 123 && asciiValue <= 127){
            return "ESPECIAL";
         }
       
      else{
         return "";
      }
       
      } catch (Exception e) {
       
         return "Ocurrió un error inesperado";
      }
          }

   /*
    * 
    * 4. Construya un algoritmo e implemente la función en Java
    * Hallar_division_exacta que pida dos números enteros,
    * calcule la división del primero sobre el segundo, y al final si la división
    * es exacta, devuelva "DIVISION EXACTA"
    * y de lo contrario devuelva "DIVISION NO EXACTA". (Exacta significa que tiene
    * cociente, pero no residuo).
    * 
    * Si alguno de los dos números que recibe es cero o negativo, devuelva
    * "NO SE ADMITE CERO O NEGATIVOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * Nota: Revise el funcionamiento del operador mod que le puede ayudar.
    * 
    * 
    * 
    */
public static String Hallar_division_exacta(int nro_1, int nro_2) {
      try {
         int nro_0 = 0;
         if (nro_1 <= nro_0 || nro_2 <= nro_0) {
            return "NO SE ADMITE CERO O NEGATIVOS";

         }

         int division_ = nro_1 % nro_2;

         if (division_ == 0) {
            return "DIVISION EXACTA";
         } else {
            return "DIVISION NO EXACTA";
         }

      } catch (Exception e) {

         return ("Ocurrió un error inesperado");
      }
   }

   

   /*
    * 5. En la siguiente tabla se encuentra la información de las habitaciones de
    * una finca hotel:
    * 
    * Habitación Camas Planta    AA/VENTILADOR
    *    101         2     Primera     AA
    *    102         1     Primera     VE
    *    201         3     Segunda     AA
    *    202         2     Segunda     VE
    *    301         2     Tercera     AA
    * 
    * 
    * Construya un algoritmo e implemente la función en Java Consultar_hab que
    * reciba en un byte el número de camas
    * y en un string si desea VE o AA, y deuvelva en un texto el o los números de
    * habitación que cumplen ese requisito.
    * Si son varias habitaciones, devuelvalas separadas por el caracter |
    * (normalmente, al lado izquierdo de la tecla del 1).
    * Ejemplo: "101|301"
    * Si el número de camas no está entre 1 y 3 o el string es diferente a AA o VE,
    * devuelva "DATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */
public static String Consultar_hab(byte n_camas, String ve_aa) {
      try {
         byte camas = 0;
         byte cama_m = 3;

         if (n_camas >= camas || n_camas >= cama_m) {

         } else {
            return "DATOS NO VÁLIDOS";
         }

         if (ve_aa == "VE" || ve_aa == "AA") {

         } else {
            return "DATOS NO VÁLIDOS";
         }

         if (n_camas == 1 && ve_aa == "VE") {
            return "102";
         }

         if (n_camas == 3 && ve_aa == "AA") {
            return "201";
         }

         if (n_camas == 2 && ve_aa == "VE") {
            return "202";
         }

         if (n_camas == 2 && ve_aa == "AA" || n_camas == 2 && ve_aa == "AA") {
            return "101|301";
         }

         return "";

      } catch (Exception e) {

         return "Ocurrió un error inesperado";
      }
   }

   
   /*
    * 
    * 6. Un restaurante vende 3 platos. Si el cliente solicita el plato 1, le dan
    * el postre gratis; si selecciona los platos
    * 1 y 2, le dan la bebida gratis y si selecciona los platos 1,2 y 3, le dan
    * postre y bebida.
    * Construya un algoritmo e implemente la función Obtener_obs en Java que reciba
    * 3 booleanos, uno para cada plato y en
    * un String devuelva el obsequio ganado en mayúscula, así: "BEBIDA", "POSTRE",
    * "BEBIDA Y POSTRE".
    * Si los 3 platos vienen en false, , devuelva "PLATOS NO VÁLIDOS".
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    */

public static String Obtener_obs(boolean plato_1, boolean plato_2, boolean plato_3) {
      try {
         if (!plato_1 && !plato_2 && !plato_3) {
            return "PLATOS NO VÁLIDOS";
         }

         if (plato_1 && plato_2 && plato_3) {
            return "BEBIDA Y POSTRE";
         }

         if (plato_1 && plato_2) {
            return "BEBIDA";
         }

         if (plato_1) {
            return "POSTRE";
         }

         return "PLATOS NO VÁLIDOS";

      } catch (Exception e) {
         return "Ocurrió un error inesperado";
      }
   }


   /*
    * 7. Un grupo de amigos hace un sorteo semanalmente con pelotas de ping pong,
    * para saber quién invita y a qué  la próxima salida.
    * Las opciones dependen del color que sacan en cada bola y son:
    * 
    * verde: Invita a las cervezas
    * azul: Invita a la pizza
    * rojo: Invita al postre
    * amarillo: Paga el parqueadero de todos
    * blanco o negro: Vaya y disfrute
    * Si la función recibe algo diferente a los colores dados, debe retornar
    * "Error en el color".
    * 
    * Se necesita una función en java Conocer_invitacion que reciba un string con
    * el color de la bola y retorna un
    * String con exactamente el texto de la invitación correspondiente.
    * 
    * Si hay un error inesperado, deberá mostrar el mensaje:
    * "Ocurrió un error inesperado".
    * 
    */

public static String Conocer_invitacion(String colors){
      try {
 
         if (colors == "verde"){
            return "Invita a las cervezas";
         }
         else if (colors == "azul"){
            return "Invita a la pizza";
         }
 
         else if (colors == "rojo"){
            return "Invita al postre";
         }
 
         else if (colors == "amarillo"){
            return "Paga el parqueadero de todos";
         }
 
         else if (colors == "blanco" || colors == "negro"){
            return "Vaya y disfrute";
         }
 
         else{
            return "Error en el color";
         }
 
         
      } catch (Exception e) {
 
          return "Ocurrió un error inesperado";
      }
    }

}

