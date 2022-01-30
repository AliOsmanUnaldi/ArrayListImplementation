package collections;

public class MyArrayList<T> {
	private T[] array1;
	private T[] array2;
	private int count = 0;

	public void add(T item) {
		if (count == 0) {
			count++;
			array1 = (T[]) new Object[count];
			array1[0] = item;
		} else {

			array2 = (T[]) new Object[count + 1];
			for (int i = 0; i < count; i++) {
				array2[i] = array1[i];
			}
			array2[count] = item;
			array1 = array2;
			count++;
		}

	}

	public void print() {
		for (T t : array2) {
			System.out.println(t);
		}
	}

	public void remove(int index) {

		for (int i = index; i < count - 1; i++) {
			array1[i] = array1[i + 1];
		}

		count--;

		array2 = (T[]) new Object[count];

		for (int i = 0; i < count; i++) {
			array2[i] = array1[i];
		}
	}

	public void size() {
		System.out.println(count);
	}

}
