// from UML Diagram on page 350
public class StackOfIntegers {
	private int[] elements;
	private int size;
	private int capacity = 16;

	/** construct stack with capacity 16 */
	public StackOfIntegers() {
        elements = new int[capacity];
	}

	/** construct stack with the specified max capacity */
	public StackOfIntegers(int newCapacity) {
		elements = new int[newCapacity];
	}

	/** returns true if stack is empty */
	public boolean empty() {
		return size == 0;
	}

	/** return the top element of the stack */
	public int peek() {
		return elements[size - 1];
	}
	
	/** stores an integer into the top of the stack */
	public void push(int value) {
		if (size >= elements.length) {
			int[] largerSize = new int[elements.length * 2];
			System.arraycopy(elements, 0, largerSize, 0, elements.length);
			elements = largerSize;
		}
		elements[size++] = value;
	}

	/** return the integer at the top of stack and removes it */
	public int pop() {
		return elements[--size];
	}

	/** returns number of elements in stack */
	public int getSize() {
		return size;
	}
}