package observer;

import static observer.JvmUtilities.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GroupAdminTest {

	@Test
	void testRegister() {
		ConcreteMember m1 = new ConcreteMember();
		GroupAdmin g = new GroupAdmin();
		g.append("hello everyone!");		
		g.register(m1);

//		System.out.println(objectFootprint(m1.getCopy()));
//		System.out.println(objectTotalSize(m1.getCopy()));
//		System.out.println(jvmInfo());

		assertEquals(true, (g.getMembers().contains(m1)));
	}

	@Test
	void testUnregister() {
		ConcreteMember m1 = new ConcreteMember();
		GroupAdmin g = new GroupAdmin();
		g.append("hello everyone!");		
		g.register(m1);
		g.unregister(m1);
		
		assertEquals(false, (g.getMembers().contains(m1)));
	}

	@Test
	void testInsert() {
		ConcreteMember m1 = new ConcreteMember();
		GroupAdmin g = new GroupAdmin();
		g.append("hello everyone!");		
		g.register(m1);
        g.insert(5, " world");
        assertEquals("hello world everyone!", m1.getCopy().toString());
	}
	
	@Test
	void testInsertOutOfBounds() {
		ConcreteMember m1 = new ConcreteMember();
		GroupAdmin g = new GroupAdmin();
		g.append("hello everyone!");		
		g.register(m1);
        g.append("hello");
        assertNull(m1.getCopy().insert(30, " world"));
	}

	@Test
	void testAppend() {
		ConcreteMember m1 = new ConcreteMember();
		GroupAdmin g = new GroupAdmin();
		g.register(m1);

		g.append("\n");
        g.append("hello");
        g.append("\t");
        g.append("world");
        assertEquals("\nhello\tworld", m1.getCopy().toString());
	}

	@Test
	void testDelete() {
		ConcreteMember m1 = new ConcreteMember();
		GroupAdmin g = new GroupAdmin();
		g.append("hello");
		g.delete(-1,67);
        assertNull(m1.getCopy());
	}

	@Test
	void testUndo() {
		ConcreteMember m1 = new ConcreteMember();
		GroupAdmin g = new GroupAdmin();
		g.undo();
        assertNull(m1.getCopy());
	}

}
