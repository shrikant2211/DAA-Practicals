public class InsertionSort {
  public static void main(String[] args){

    int[] arr = {64,34,25,12,22};

    for(int i = 1; i < arr.length; i++){
      int key = arr[i];
      int j = i-1;

      while(j >= 0 && arr[i] > key){
        arr[j+1] =  arr[i];
        j--;
      }

      arr[j+1] = key;
    }

    System.out.println("Sorted Array:");
    for(int num : arr){
      System.out.println(num+"");
    }
  }
  
}
