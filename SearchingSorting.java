class SearchingSorting {
  private int []myArray = new int[50];
  private int arraySize = 10;

  public void generateRandomArray() {
    for(int i=0;i<arraySize;i++) {
      myArray[i] = (int)(Math.random()*10)+10;
    }
  }

  public void printArray() {
    for(int pa=0;pa<arraySize;pa++) {
      System.out.print(myArray[pa] + " ");
    }

    System.out.println("\n");
  }

  public void deleteElementAtIndex(int index) {
    for(int del = index; del<arraySize;del++) {
      myArray[del] = myArray[del+1];
    }
    arraySize--;
  }

  public void swapValues(int indexOne, int indexTwo){
          int temp = theArray[indexOne];
          theArray[indexOne] = theArray[indexTwo];
          theArray[indexTwo] = temp;
  }

  public void bubbleSort(){
    for(int i=arraySize-1;i>1;i--) {
      for(j=0;j<i;j++){
        if(myArray[j]>myArray[j+1])
        swapValues(myArray[j], myArray[j+1]);
      }
    }
  }

public static void main(String args[]) {
  SearchingSorting ss = new SearchingSorting();
  ss.generateRandomArray();
  ss.printArray();
  //ss.deleteElementAtIndex(0);
  //ss.printArray();
  ss.bubbleSort();
  ss.printArray();
}




}
