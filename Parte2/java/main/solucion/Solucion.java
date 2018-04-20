import java.io.*;
package solucion;

public class Solucion {
  
  static boolean problema(String s){
    // conseguimos el largo de s y se guarda crea arre para guardar los datos del subtring
    int n = s.length();
    int arre[] = new int[n];
 
    // se calcula el substinrg
    subString(s, n, arre);
 
    //se calcula el largo del substring más grande
    int largo = arre[n-1];
 
  }
}
  static void substring(String s, int a, int arre[]){
    
    //se calcula el largo del substring más corto
    int largo = 0;
    int aux;
 
    arre[0] = 0;
    i = 1;
 
    //guardamos en arre i
    while (i < a)
    {
    if (str.charAt(i) == str.charAt(largo))
    {
        largo++;
        arre[i] = largo;
        i++;
    }
    else
    {
        if (largo != 0)
        {
            //caso en el que xxxxyxxxxx e i=8
            largo = arre[largo-1];
        }
        else //caso en el que el substring más largo sea 0
        {
            arre[i] = 0;
            i++;
        }
    }
    }
}
