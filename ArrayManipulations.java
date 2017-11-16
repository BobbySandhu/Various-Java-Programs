    public class ArrayManipulations {

        int myArray[] = new int[50];
        int arraySize = 10;

        public void insert(int val){
          if(arraySize<50){
            myArray[arraySize] = val;
            arraySize++;
          }
          System.out.println("Now arraySize is: "+arraySize);
        }

        public void deleteIndex(int val){

          if(val<arraySize)
            {
            for(int d=val;d<arraySize;d++)
            {
                myArray[d] = myArray[d+1];
            }
            arraySize--;
            System.out.println(" deleted "+val);
            }
        }

        public void generateRandomArray(){

            for(int i =0 ;i<arraySize;i++){
                myArray[i] = (int)(Math.random()*10)+10;
            }
        }

        public void printArray(){
            for(int p =0 ;p<arraySize;p++){
                System.out.print(myArray[p] + " ");
            }
            System.out.println();
        }

        public void bubbleSort() {
          for(int i = arraySize-1; i>1; i--)
          {
            for(int j=0;j<i;j++){
              if(myArray[j]>myArray[j+1]){
                int temp = myArray[j];
                myArray[j] = myArray[j+1];
                myArray[j+1] = temp;
              }
            }
          }
        }

        public static void main(String args[]) {

            ArrayManipulations obj = new ArrayManipulations();
            obj.generateRandomArray();
            obj.printArray();
            obj.bubbleSort();
            obj.printArray();
            //obj.deleteIndex(5);
            //obj.printArray();
            obj.insert(333);
            obj.printArray();
            obj.bubbleSort();
            obj.printArray();


        }
    }
