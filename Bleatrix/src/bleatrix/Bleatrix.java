
package bleatrix;

import java.util.Scanner;

public class Bleatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dezNumeros = new int[10];
        String resultado = null;
        String[] splitadora = null;
        int tamanho = -1;
        int t;
        int n;
        int c = 0;
        boolean dormiu = false ;
        if(sc.hasNext()){
            t = sc.nextInt();
            if(t != 0){
                for(int b = 1; b <= t; b++){
                    c = 1;
                    dormiu = false;
                    dezNumeros = new int[10];
                    n = sc.nextInt();
                    if(n == 0){
                        geraOutput(b,0);
                        dormiu = true;                        
                    } 
                    while(dormiu != true){
                        resultado = Integer.toString(n*c);
                        splitadora = resultado.split("");
                        for(int s = 0; s < splitadora.length; s++){
                            if(dezNumeros[Integer.parseInt(splitadora[s])] == 0){
                                dezNumeros[Integer.parseInt(splitadora[s])] = 1;
                                dormiu = checaSeNanou(dezNumeros);
                            }    
                        }
                        if(dormiu == false)
                            c++;
                    }
                    if(n != 0)
                        geraOutput(b, n*c);
                }  
            }  
        }
    }

    private static boolean checaSeNanou(int[] numerosSheep) {
        for (int d = 0; d < numerosSheep.length; d++){
            if(numerosSheep[d] == 0)
                return false;
        }
        return true;
    } 

    private static void geraOutput(int b, int nc) {
        if(nc == 0)
            System.out.println("Case #"+b+":"+" INSOMNIA");
        else
            System.out.println("Case #"+b+": "+ nc);
    }
}
