public class PrimitivesVsObjects {
	public boolean IsNameQ() {
		String name = readLine("Enter name: ");
		/*changed (name=="Q") to name.equals("Q")
		 *  == should be used to check a primitive type such as:
		 *  int, boolean, double, or char.
		 */
		name.equals("Q"); 
	}
}

public boolean IsNameQ() {
		String name = readLine("Enter name: ");
			char ch = name.charAt(0);
			return ((ch == 'Q') && (name.length() == 1));
}