import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Andi Ernhofer
 *
 */
public class JUnitTest {

	@Test
	public void isEmpty() {
		stack1.Stack1 s = new stack1.Stack1(5);
		if(!s.isEmpty()){
			throw new RuntimeException("Fail isEmpty");
		}
	}
	
	@Test
	public void isFull() {
		stack1.Stack1 s = new stack1.Stack1(5);
		if(s.isFull()){
			throw new RuntimeException("Fail isFull");
		}
	}

	@Test
	public void push() {
		stack1.Stack1 s = new stack1.Stack1(5);
		s.push("A");
		s.push("B");
		if(!s.pop().equals("B")){
			throw new RuntimeException("push");
		}
	}
	
	@Test
	public void pop() {
		stack1.Stack1 s = new stack1.Stack1(5);
		s.push("X");
		s.push("Y");
		s.push("Z");
		if(!s.pop().equals("Z")){ //Das Letzte wird gepopd.
			throw new RuntimeException("push");
		}
	}
}
