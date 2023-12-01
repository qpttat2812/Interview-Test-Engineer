package learn_java;

public class OOP {
	public static void main(String[] args) {
		int[] a = { 15, 1, 3, 4, 5, 15, 6, 7, 15, 4 };
		
		System.out.println(getThirdLargestElement(a));

	}

	public static int[] getDescendingArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int swap = 0;
			for (int j = 0; j < a.length ; j++) {
				if(a[j] < a[i]) {
					swap = a[j];
					a[j] = a[i];
					a[i] = swap;
				}
			}
		}
		return a;
	}
	
	public static int getThirdLargestElement(int[] a) {
		a = getDescendingArray(a);

		int count = 0;
		int num = 0;
		for(int i = 0; i < a.length; i++) {
			for(int j = 1; j < a.length; j++) {
				if (a[i] != a[j]) {
					count++;
					if(count == 2) {
						num = a[j];
						break;
				}
			}
		}
	}
		return num;
	}

}
