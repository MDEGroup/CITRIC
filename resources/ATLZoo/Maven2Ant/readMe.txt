Maven2Ant :
	import XML model for the two files
	run XML2Maven.atl
	run Maven2Ant.atl
	run Ant2XML.atl
	run XML2Text.atl : in this file, the third line must be changed.
			   The user must give the repertory in which must be build.xml

files in directory 'example':
 project.xml and maven.xml are files in entry;
 project.xmi and maven.xmi are the Models imported from project.xml and maven.xml
 	(correspond to the XML Metamodel)
 projectFile.xmi and mavenFile.xmi are the files obtained after running XML2Maven.atl
	(correpond repecstively to MavenProject and MavenMaven Metamodels)
 antFile.xmi is the file obtained after running Maven2Ant.atl
	(corresponds to the Ant Metamodel)
 build.xmi is the file obtained after running Ant2XML.atl
	(corresponds to the XML Metamodel)
 build.xml is the file obtained after running XML2Text.atl
	(after having changed the third line: "writeTo('myDirectory\\build.xml')");