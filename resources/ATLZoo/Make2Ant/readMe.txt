Make2Ant :
	The first command need a command Unix sed:
		on the terminal, type: sed -nf make2xml.sed makefile >makefile.xml
	import XML model for the file makefile.xml
	run XML2Make.atl
	run Make2Ant.atl
	run Ant2XML.atl
	run XML2Text.atl : in this file, the third line must be changed.
			   The user must give the repertory in which must be build.xml


files in directory 'example':
 Makefile is an example of file in entry;
 makefile.xml is the file obtained from the 'sed' command;
 makeFile.xmi is the Model imported from makefile.xml (corresponds to the XML Metamodel);
 makeFileMake.xmi is the file obtained after running XML2Make.atl (corresponds to the Make Metamodel);
 antFile.xmi is the file obtained after running Make2Ant.atl (corresponds to the Ant Metamodel);
 build.xmi is the file obtained after running Ant2XML.atl (corresponds to the XML Metamodel);
 build.xml is the file obtained after running XML2Text.atl
	(after having changed the third line: "writeTo('myDirectory\\build.xml')");