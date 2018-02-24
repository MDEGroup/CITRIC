Metamodel files
---------------
 * UMLDI-20030818.xmi
 * MSProject.ecore
 * MSProject.km3

Example files
-------------
 * example-uml.xmi: input UML model (produced with Poseidon For UML CE 3.0)
 * example-project.ecore: corresponding MSProject model
 * example.xml: XML file corresponding to the generated MSProject model

Transformation files
--------------------
 * UmlActivityDiagram2MSProject.atl

"UMLDI-20030818.xmi" and "MSProject.ecore" are the metamodels for UML and MSProject models.
The Km3 file provides a readable version of the MSProject metamodel in the km3 format.

The UmlActivityDiagram2MSProject transformation ("UmlActivityDiagram2MSProject.atl") can be tested with the UmlActivityDiagram model ("example-uml.xmi") as input.
It returns a MSProject model ("example-project.ecore").

"example.xml" provides an XML version of the obtained project result.
This file is the result of two successive operations on the MSProject model produced by UmlActivityDiagram2MSProject:
  1. A transformation from the MSProject to the XML model.
This transformation generates all the tags required for XML import in MSProject.
  2. An extraction from the XML model to text
These steps are not detailled in this example.