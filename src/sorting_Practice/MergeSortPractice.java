package sorting_Practice;

public class MergeSortPractice {
    int[] array;
    int[] tempmergeArray;
    int length;

    public static void main(String[] args) {
        int[] inputArr={48, 36, 13,19,94,21};
        MergeSortPractice ms= new MergeSortPractice();
        ms.sort(inputArr);
        for (int i:inputArr){
            System.out.print(i+" ");
        }
    }

public void sort(int inputArr[]){
    this.array=inputArr;
    this.length=inputArr.length;
    this.tempmergeArray=new int[length];
    divideArray(0,length-1);


}
public void divideArray(int LowerIndex, int HigerIndex){
    if (LowerIndex<HigerIndex){
        int middle=LowerIndex+(HigerIndex-LowerIndex)/2;

        divideArray(LowerIndex,middle);

        divideArray(middle+1,HigerIndex);
        mergeArray(LowerIndex, middle, HigerIndex);
    }
    }
    public void mergeArray(int LowerIndex, int middle, int HigerIndex){
        for(int i=LowerIndex; i<HigerIndex;i++){
            tempmergeArray[i]=array[i];
        }
        int i= LowerIndex;
        int j=middle+1;
        int k=LowerIndex;

        while (i<=middle && j<=HigerIndex){
            if(tempmergeArray[i]<=tempmergeArray[j]){
                array[k]=tempmergeArray[i];
                i++;
            }
            else {
                array[k]=tempmergeArray[j];
                j++;
            }
            k++;
        }
        while (i<=middle){
            array[k]=tempmergeArray[i];
            k++;
            i++;
        }
    }
}
