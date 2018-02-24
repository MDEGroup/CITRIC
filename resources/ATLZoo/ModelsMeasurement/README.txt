--------------------------------------------------------------------------------
For questions and/or comments:

    Eric Vepa (evepa <at> sodius.com)
    
    SODIUS (www.sodius.com)
    6, rue de la Cornouaille - BP 91941
    44319 Nantes, France
--------------------------------------------------------------------------------

The ModelsMeasurement project is used to collect measurement data on KM3
 meta-models or UML2 models, using libraries implementing some metrics
 (MOOD, MOOD2, MOOSE, EMOOSE and QMOOD).
 The measure level can be changed by setting an other value for the first helper
 measureLevel of the transformation KM32Measure or UML22Measure.
 
Please note that the output HTML file is extracted with the XML extractor.
 So the first line should be removed and replaced by:
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN"
  "http://www.w3.org/TR/html4/strict.dtd">
 
Developed using:
  - Eclipse SDK (3.3.0)
  - Eclipse EMF (2.3.0)
  - Eclipse M2M-ATL (2.0RC2)
  - Eclipse UML2 Project (2.1.0)
  - [Optional] Eclipse Jar2UML (1.0.10)

Contents:
  --> "ModelsMeasurement": The ATL project folder.
    |--> "conf": The folder which contains configuration files.
      \--> "ModelsMeasurement build.xml.launch": The configuration file of the
 ANT script "build.xml".
    |--> "lib": The folder which contains the libraries, used by the
 transformations, in ATL and ASM format.
      \--> "lib": 
        \--> "log4j.jar": The logger used by the com.sodius.atl.xhtml.jar.
      \--> "com.sodius.atl.xhtml.jar": The Jar file used for validating the
 XHTML file generated with ATL.
      \--> "EMOOSE4KM3.{atl,asm}": The EMOOSE4KM3 library.
      \--> "EMOOSE4UML2.{atl,asm}": The EMOOSE4UML2 library.
      \--> "FLAME4KM3.{atl,asm}": The FLAME4KM3 library.
      \--> "FLAME4UML2.{atl,asm}": The FLAME4UML2 library.
      \--> "MeasureHelpers.{atl,asm}": The MeasureHelpers library.
      \--> "MOOD4KM3.{atl,asm}": The MOOD4KM3 library.
      \--> "MOOD4UML2.{atl,asm}": The MOOD4UML2 library.
      \--> "QMOOD4KM3.{atl,asm}": The QMOOD4KM3 library.
      \--> "QMOOD4UML2.{atl,asm}": The QMOOD4UML2 library.
      \--> "TableHelpers.{atl,asm}": The TableHelpers library.
    |--> "metamodels":  The folder which contains the meta-models in KM3 and
 Ecore format.
      \--> "HTML.{km3,ecore}": The HTML meta-model.
      \--> "Measure.{km3,ecore}": The Measure meta-model.
      \--> "SVG.{km3,ecore}": The SVG meta-model.
      \--> "Table.{km3,ecore}": The Table meta-model.
      \--> "XHTML.{km3,ecore}": The XHTML meta-model.
      \--> "XML.{km3,ecore}": The XML meta-model.
    |--> "models": The folder which contains input and output models.
      \--> "example.km3": An example of input KM3 file.
      \--> "example.uml": An example of input UML2 file.      
      \--> "example-Measure.ecore": A temporary model of measure.
      \--> "example-SVGBarChart4KM3.svg": The file generated for the
 example.km3 and for SVG bar chart presentation.
      \--> "example-SVGBarChart4UML2.svg": The file generated for the
 example.uml and for SVG bar chart presentation.
      \--> "example-SVGPieChart4KM3.svg": The file generated for the
 example.km3 and for SVG pie chart presentation.
      \--> "example-SVGPieChart4UML2.svg": The file generated for the
 example.uml and for SVG pie chart presentation.
      \--> "example-TabularHTML4KM3.html": The file generated for the
 example.km3 and for HTML presentation.
      \--> "example-TabularHTML4UML2.html": The file generated for the
 example.uml and for HTML presentation.
      \--> "example-XHTML4KM3.html": The file generated for the
 example.km3 and for XHTML presentation.
      \--> "example-XHTML4UML2.html": The file generated for the
 example.uml and for XHTML presentation.
      \--> "script.js": The external JavaScript file used by the generated
 XHTML file.
      \--> "stylesheet.css": The external CSS file used by the generated
 XHTML file. 
    |--> "transformations": The folder which contains the transformations in
 ATL and ASM format.
      \--> "HTML2XML.{atl,asm}": The HTML2XML transformation.
      \--> "KM32Measure.{atl,asm}": The KM32Measure transformation.
      \--> "Measure2Table.{atl,asm}": The Measure2Table transformation.
      \--> "Measure2XHTML.{atl,asm}": The Measure2XHTML transformation.
      \--> "SVG2XML.{atl,asm}": The SVG2XML transformation.
      \--> "Table2SVGBarChart.{atl,asm}": The Table2SVGBarChart transformation.
      \--> "Table2SVGPieChart.{atl,asm}": The Table2SVGPieChart transformation.
      \--> "Table2TabularHTML.{atl,asm}": The Table2TabularHTML transformation.
      \--> "UML22Measure.{atl,asm}": The UML22Measure transformation.
      \--> "XHTML2XML.{atl,asm}": The XHTML2XML transformation.
    |--> ".project": The Eclipse ATL Project file.
    |--> "ant-contrib.jar": Additional ANT tasks.
    |--> "build.xml": The ANT script of the project for launching the
 transformations.
    |--> "build.properties": Project properties for the ANT script.
    |--> "epl-v10.html": This project is under the Eclipse Public License.
    |--> "README.txt": This file.
   
HowTo:
 --> Open the AM3 Perspective. 
 --> In the build.xml:
    --> Choose an input terminal model to measure among {KM3,UML2}
	--> Choose an output presentation format among {HTML,SVG,XHTML}
		--> If SVG is chosen, choose a kind of chart among {Bar,Pie}
 --> Run the "build.xml"  (the launch file is already configured):
       Right click on "build.xml" file --> Run As --> Ant Build.
 --> The generated output file is in the "models" folder.
 