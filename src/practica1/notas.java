
package practica1;

import java.util.Scanner;

/**
 * Clase que permite calcular la nota definitiva de un estudiante a partir de las notas de tres unidades y saber  si aprobo o no el curso
 */
public class notas {

double uf1, uf2, uf3;
double acu1, acu2, acu3, def;
//utilizames ecaner para poder introducir datos
Scanner entrada = new Scanner(System.in);
///vamos ca crear un metodo para ingresar



/**
 * este metodo sirve para pedirle al usuario que introduzca
 * las tres notas y se almacenen en las variables correspondientes
 */
public void IngresaNotas() {
//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
System.out.println("ingrese las notas del estudiante");
System.out.print("ingrese nota 1: ");
uf1= entrada.nextDouble();
System.out.print("ingrese nota 2: ");
uf2= entrada.nextDouble();
System.out.print("ingrese nota 3: ");
uf3= entrada.nextDouble();
}

/**
 * este metodo sirve para comprobar si las notas estan dentro del rango establecido, 
 * si no lo estan muestra que la nota esta mal introducida
 */

public void comprobarcion(){
if (uf1>10) {
System.out.println(" nota1 mal introducida");
}else {
System.out.println(" nota1 correcta");
}
if (uf2>10) {
System.out.println(" nota2 mal introducida");
}else {
System.out.println(" nota2 correcta");
}
if (uf3>10) {
System.out.println(" nota3 mal introducida");

}else {
System.out.println(" nota3 correcta");
}
}


/**
 * este metodo sirve para calcular la nota 
 * final del estudiante
 */
public void Calculonotas() {
acu1= uf1*0.35;
acu2 = uf2 * 0.35;
acu3 = uf3 * 0.30;
def = acu1 + acu2+ acu3;
//hasta aqui la tenemos calculada peor no la mostramos
}



/**
 * Este metodo sirve para mostrar las notas introducidas, los acumulados y la nota definitiva
 */
public void Mostrar() {
//print ln lo que hace es que al terminar el print baja la linea
System.out.println(" notas introducidas son:");
System.out.println(" nota1 = " + uf1);
System.out.println(" nota2 = " + uf2);
System.out.println(" nota3 = " + uf3);
System.out.println(" acumuado 1 = "+ acu1);
System.out.println(" acumuado 2 = "+ acu2);
System.out.println(" acumuado 3 = "+ acu3);
System.out.println(" nota definitiva es = "+ def);
}


/**
 * metodo que sirve para determinar si el alumno esta aprobado o suspendido dependiendo de su nota final
 */
public void aprobado() {
if(def<5 && def>=0) {
System.out.println("suspendio");
}else {
if (def>=5 && def<=10 ) {
System.out.println("aprobado");
}else {
System.out.println(" error en la notas");
}
}
}



/**
 * Este metodo llama a todos lo demas metodos de la clase
 * @param args llamada a los metodos
 */
public static void main(String[] args) {
// creamos mecanimos para llamar a cualquier metodo fuero de la clase
notas fc= new notas();
fc.IngresaNotas();
fc.comprobarcion();

fc.Calculonotas();
fc.Mostrar();
fc.aprobado();
}
}