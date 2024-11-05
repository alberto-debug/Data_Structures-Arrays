import java.util.Arrays;

public class ArrayInsertion {

    public static void main(String[] args){

        int my_Array[] = {10,20,30,40,50};

        //Define the position to substitute, position 3 of the array .
        int index_position = 2;

        //Define the new value
        int new_Value = 35;

        System.out.println("original values of the before insertion : \n " + Arrays.toString(my_Array));

        //pushing array elementes from position 3 downwards
        for (int i = my_Array.length-1; i>index_position; i--){
            my_Array[i] = my_Array[i-1];
        }

        //Assigning value to array index 2
        my_Array[index_position] = new_Value;

        //printing all elements after Insertion
        System.out.println("New Array elements after Insertion of value 35: \n" + Arrays.toString(my_Array));
    }
}
