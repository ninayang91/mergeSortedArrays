
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={99,22,88,66,44,33,77,11,55};
		//bubbleSort(a);
		//selectionSort(a);
		//insertionSort(a);
		//mergeSort(a);
		//shellSort(a);
		//quickSort(a);
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}

	}
	
	public static void mergeSorted(int[] a, int[] b){
		int indexA=a.length-1;
		int indexB=b.length-1;
		int indexMerged=a.length+b.length-1;
		//merge, starting from the last element
		while(indexA>=0 && indexB>=0){
			if(a[indexA]>b[indexB]){
				a[indexMerged]=a[indexA];
				indexMerged--;
				indexA--;
			}else{
				a[indexMerged]=b[indexB];
				indexMerged--;
				indexB--;
			}
		}
		//copy remainning b[]
		while(indexB>=0){
			a[indexMerged]=b[indexB];
			indexMerged--;
			indexB--;
		}
	}

}
