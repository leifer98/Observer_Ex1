package observer;

public class ConcreteMember implements Member{
	private UndoableStringBuilder copy;

	/**
	 * the function updates the pointer to the admin status using shallow copy
	 * @param usb the admin status
	 */
	@Override
	public void update(UndoableStringBuilder usb) {
		// TODO Auto-generated method stub
		this.copy = usb;
	}

	/**
	 * A function to get the copy of the status
	 * @return the shallow copy of the admin status
	 */
	public UndoableStringBuilder getCopy() {
		return this.copy;
	}
}
