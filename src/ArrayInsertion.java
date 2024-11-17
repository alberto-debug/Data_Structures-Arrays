import java.util.Arrays;

public class ArrayInsertion {

    public static void main(String[] args){

        int my_Array[]  = {10, 20, 30, 40, 50};

        //Define the position to substitute, position 3 of the array
        int index_position = 2;

        //Define the new value
        int new_Value = 25;

        //printing all elements before Insertion


        //pushing array elementes from position 3 downwards


        //Assigning value to array index 2


        //printing all elements after Insertion


    }
}
//Objetivo do Loop: O loop percorre o array de trás para frente, movendo cada elemento uma
// posição para a direita. Isso cria um espaço vazio na posição index_position, onde o novo valor (new_Value) será inserido mais tarde.
//
//Início: int i = my_Array.length - 1
//
//O loop começa com i definido como o último índice do array.
//Se my_Array tem 5 elementos ({10, 20, 30, 40, 50}), my_Array.length será 5, então i começa em 4 (my_Array.length - 1).
//
//Condição: i > index_position
//
//O loop continuará enquanto i for maior que index_position (neste caso, index_position = 2).
//Isso significa que o loop vai parar assim que i atingir 2 + 1 = 3, pois queremos mover apenas os elementos depois de index_position.