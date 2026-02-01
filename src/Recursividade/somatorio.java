package Recursividade;

public class somatorio {

    int calcularSomatorio(int valor){

        if (valor == 1){
            return 1;
        }

        return valor + calcularSomatorio(valor -1);
    }
}
