
public class ascendingOrder {

	public static void main(String[] args) {
		int numbers[] = {1, 20, 3, 14, 55 ,16};
		System.out.print("Original Orders: ");
		for(int i=0; i<numbers.length; i++)
			System.out.print(numbers[i]+ " ");
		for(int i=0; i<numbers.length; i++)
			for(int j=i; j<numbers.length; j++) 
				if(numbers[i]>numbers[j]) {
					int temp = numbers[i];
					numbers[i] = numbers[j];
					numbers[j] = temp;
				}
			
		System.out.print("\nAscending order: ");
		for(int i=0; i<numbers.length; i++)
			System.out.print(numbers[i]+ " ");
	}

}
