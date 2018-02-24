/*
 * Created on 18 janv. 2005
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */

import java.io.*;
import java.util.*;

/**
 * @author rosenthal
 *
 * TODO To change the template for this generated type comment go to
 * Window - Preferences - Java - Code Style - Code Templates
 */
public class LoadDXF {
	
	public static void main(String[] args) {
		try {
			File fIn = new File("cubeFreddy.dxf");
			FileReader FRin = new FileReader( fIn );
			BufferedReader in = new BufferedReader( FRin );
			String line;
			Vector v = new Vector();
			
			Integer oldPointNb = new Integer(-1);
	
			boolean firstMesh = true;
			
			String dxfFile = "<DXF>\n";
			int i = 1;
			String mesh = "";
			
			while ((line = in.readLine()) != null ){

				System.out.println( i++);
				Integer tag = new Integer (Integer.parseInt(line.trim()) );
				if (! v.contains(tag)) {
					v.add(tag);
				}
				line = in.readLine();


				if (tag.intValue()==8)
					mesh = line;
	
				if ((tag.intValue()>9)&&(tag.intValue()<40)){
					
					if ((!firstMesh)&&(tag.intValue()%10!=oldPointNb.intValue()%10))
						dxfFile += "/>\n" ;					
					
					if ((!firstMesh)&&(tag.intValue()==10))
						dxfFile += "	</Mesh>\n" ;
					
					if (tag.intValue()==10)
						dxfFile += "	<Mesh name=\""+ mesh +"\">\n";
					
					if ((tag.intValue()%10)!=(oldPointNb.intValue()%10)) 
						dxfFile += "		<Point name=\"p" + new Integer(tag.intValue()%10).toString() + "\"";
					
					
					firstMesh=false;
					oldPointNb = tag;
					
					if (tag.intValue()/10==1)
						dxfFile += " x=\"" + line + "\"";
					if (tag.intValue()/10==2)
						dxfFile += " y=\"" + line + "\"";
					if (tag.intValue()/10==3)
						dxfFile+= " z=\"" + line + "\"";
				}

			}
		
				dxfFile += "/>\n";					
				dxfFile += "	</Mesh>\n";
				dxfFile += "</DXF>\n";
				File fOut = new File("./cubeFreddy.xml");
				FileWriter frOut = new FileWriter( fOut );
				frOut.write(dxfFile.toCharArray());
				frOut.close();
			
			
			System.out.println( "finished LoadDXF" );
		}
		catch(Exception e){
			System.out.println( "error " + e);
		}
	}
		
	
}
