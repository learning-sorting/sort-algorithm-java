public class BubbleSortGabrielR {
    public static void main(String [] args){
        int aux;
        int [] array = {4,200,1,203,98,105,7,8,10,23,24,25,33,303,400}; //Array that will be sorted.
            for(int i = 0; i < array.length; i ++){
                for(int j = 0; j < array.length - 1  ;j++){
                    if(array[j] > array[j+1]){
                        aux = array[j];        //Get the bigger number that will be swapped
                        array[j] = array[j+1];    //Get the small number
                        array[j+1] = aux;      
                    }
                }
            }
            
            //Print the array sorted
            for(int i = 0 ; i < array.length ; i ++)
                System.out.print(array[i] + " ");
    }
}