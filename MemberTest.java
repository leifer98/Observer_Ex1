package observer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MemberTest {

	@Test
	void testUpdate() {
		ConcreteMember m1 = new ConcreteMember();
		UndoableStringBuilder str = new UndoableStringBuilder();
		m1.update(str);
		assertEquals(str, m1.getCopy());
	}

}
