import java.util.ArrayList;
import java.util.Iterator;

// INCOMPLETE LOGIC 
class protocol {
	private static final int READY = 0;
	private static final int CONNECTED = 1;
	private String[] registerValues = new String[3];
	private String[] checkValues = new String[3];
	private String[] removeValues = new String[3];
	private String[] displayValues = new String[3];
	private ArrayList<String[]> registerArray = new ArrayList<String[]>();
	private static int state = READY;

	public ArrayList processString ( String input ) {
		String output=input;
		int i =0;
		boolean removeFlag = false;
		ArrayList outputValues = new ArrayList();

		if(state == READY) {
			if(input.trim().matches("^HELLO$")) {
				output = "HI";
				state = CONNECTED;
			} else {
				output = "ERROR 0x002";
			}
			outputValues.add(output);
		} 
		else if ( state == CONNECTED ) {
			if(input.trim().matches("^REGISTER(.*)")) { 
				boolean duplicateCheck = true;
				String value = input.trim().substring(input.trim().indexOf(" ")+1);
				registerValues = value.split(" ");
				if(registerValues.length == 3)
				{
					Iterator itr = registerArray.iterator();
					while(itr.hasNext()){
						checkValues=(String[]) itr.next();
						if(registerValues[0].equals(checkValues[0])&&registerValues[1].equals(checkValues[1])&&registerValues[2].equals(checkValues[2])){
							duplicateCheck = false;
						}
					}
					if(duplicateCheck == true)
						registerArray.add(registerValues);
					output = "STATUS TRUE" ;
				}
				else
				{
					output = "ERROR 0x003";
				}
				outputValues.add(output);
			}
			else if(input.trim().matches("^REMOVE(.*)")) { 
				String value = input.trim().substring(input.trim().indexOf(" ")+1);
				registerValues = value.split(" ");
				if(registerValues.length == 3)
				{
					Iterator<String[]> itr = registerArray.iterator();
					while(itr.hasNext())
					{
						removeValues = (String[]) itr.next();
						i++;
						if(removeValues[0].equals(registerValues[0]) && removeValues[1].equals(registerValues[1]) && removeValues[2].equals(registerValues[2]))
						{
							removeFlag = true;
							itr.remove();
						}
					} 
					System.out.println(registerArray + "--"+registerArray.size());
					output = " STATUS "+ removeFlag; // Shown only as example
				}
				else
				{
					output = "ERROR 0x004";
				}
				outputValues.add(output);
			}
			else if(input.trim().matches("^QUERY(.*)")) { 
				String value = input.trim().substring(input.trim().indexOf(" ")+1);
				String queryValues[] = new String[100];
				int count = 0;
				registerValues = value.split(" ");
				if(registerValues.length == 3)
				{
					Iterator<String[]> itr = registerArray.iterator();
					while(itr.hasNext())
					{
						displayValues = (String[]) itr.next();
						i++;
						if(displayValues[0].equals(registerValues[1]))
						{
							if(registerValues[2].equals("*"))
							{
								queryValues[count+1] = "RESPONSE "+displayValues[0]+" "+displayValues[1]+" "+displayValues[2];
								count++;
							}
							else if(registerValues[2].equals(displayValues[1]))
							{
								queryValues[count+1] = "RESPONSE "+displayValues[0]+" "+displayValues[1]+" "+displayValues[2];
								count = 1;
							}
						}
					} 
					queryValues[0] = "QUERY-REPLY "+registerValues[0]+" "+count;
					for(int j = 0; j < count+1; j++)
					{
						//System.out.println("iN PROTOCOL"+queryValues[j]);
						outputValues.add(queryValues[j]);
					}
					System.out.println(outputValues);
				}
				else
				{
					output = "ERROR 0x005";
					outputValues.add(output);
				}
			}
			else if(input.trim().matches("^BYE(.*)")) {
				state = READY;
				outputValues.add("LATER");
			}
		}
		return outputValues;
	}
}
