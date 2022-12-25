package observer;
import java.util.*;

public class GroupAdmin implements Sender {
	
	private UndoableStringBuilder current_status = new UndoableStringBuilder();
	private List<Member> members = new LinkedList<>();

	/**
	 * The function adds a member to the group
	 * @param obj = a string to add (a new member)
	 */
	@Override
	public void register(Member obj) {
		// TODO Auto-generated method stub
		obj.update(this.current_status);
		this.members.add(obj);	
	}

	/**
	 * The function removes a member from the group
	 * @param obj = the string we want to remove
	 */
	@Override
	public void unregister(Member obj) {
		// TODO Auto-generated method stub
		this.members.remove(obj);
	}
	/**
	 * Inserts a desirable Sting at a wanted place, by index
	 * @param offset = index where to insert the desirable String
	 * @param obj = the desirable String to insert
	 */
	@Override
	public void insert(int offset, String obj) {
		// TODO Auto-generated method stub
		current_status.insert(offset, obj);
	}
	/**
	 * Appends a given String to the existing status.
	 * @param obj = a string that the user wants to append to the existing String.
	 */
	@Override
	public void append(String obj) {
		// TODO Auto-generated method stub
		current_status.append(obj);
	}
	/**
	 * Deletes a desirable part of the status,
	 * desirable part given by start and end indexes
	 * @param start = The index from which the user wants to start deleting.
	 * @param end = The index where the user wants to stop deleting.
	 */
	@Override
	public void delete(int start, int end) {
		// TODO Auto-generated method stub
		current_status.delete(start, end);
	}
	/**
	 *  Undoing the last action that was preformed on the String
	 */
	@Override
	public void undo() {
		// TODO Auto-generated method stub
		current_status.undo();
	}

	/**
	 * A function to get the private members list
	 * @return the members list
	 */
	public List<Member> getMembers() {
		return this.members;
	}
}
