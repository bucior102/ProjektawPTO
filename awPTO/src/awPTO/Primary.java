package awPTO;

import java.util.Iterator;
import java.util.Set;

import awPTO.Gates.OR;

public class Primary {

	private InToPost inToPost;
	private Helper helper;
	private OR or;
	
	
	
	public Primary(Helper helper) {
		this.helper = helper;
		this.inToPost = new InToPost(helper.getLine());
	}
	
	public void printPrimaryVariablesMatrix() {
			Iterator  binaryIterator = helper.getBinaryMatrix().iterator();
			String pomBinary;
			String pomVariable;
			Iterator variableIterator = helper.getVariables().iterator();
			while (variableIterator.hasNext()) {
				System.out.print("|"+variableIterator.next().toString()+"|");			
			}
			System.out.println();
		while(binaryIterator.hasNext()) {
			
			pomBinary = (String) binaryIterator.next();
			for (int i = 0; i < pomBinary.length(); i++) {
				System.out.print("|"+pomBinary.charAt(i)+"|");
			}
			System.out.println();
		}
	}
	
	
	
}
