package Recursividade;

public class Fibonacci {
    private Integer valuePrevious = 0;
    private Integer valueCurrent = 0;

    int calcularFibonacci(int position){

        if (position == 0){
            return valueCurrent;
        }

        if ( 0 < position){
            int proximo = valueCurrent + valuePrevious;
            this.valuePrevious = this.valueCurrent;
            valueCurrent = proximo;

        }

        if (valueCurrent == 0){
            valueCurrent++;
        }

        return valueCurrent = calcularFibonacci(position -1);
    }

   // void acharPosicao(int position){

   // }
}
