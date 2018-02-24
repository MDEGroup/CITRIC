Metamodel files
---------------
 * MSOfficeExcel_SpreadsheetMLSimplified.ecore
 * MSOfficeExcel_SpreadsheetMLSimplified.km3
 * XML.ecore
 * XML.km3

Models' examples files
-----------------------
 * ExcelXMLFileExample.xml: valid Excel XML-text file
 * ExcelXMLFileExample.ecore: XML model corresponding to the previous XML file 
 * ExcelModelExample.ecore: generated Excel SpreadsheetMLSimplified model
 

Transformation files
--------------------
 * XML2SpreadsheetMLSimplified.atl



"MSOfficeExcel_SpreadsheetMLSimplified.ecore" and "XML.ecore" are the metamodels for SpreadsheetMLSimplified and XML models.
Km3 files provide readable versions of these metamodels in the km3 format.

If you want to reinject by yourself the Excel XML file into an XML model, don't forget to change the file's extension from ".xmi" to ".ecore" before launching the transformation 
(because the default XML injector produces models in XMI format).

