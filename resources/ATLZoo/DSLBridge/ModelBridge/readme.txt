Example files
-------------
 * SimpleExample/SimpleExampleM.xml: the DSL model xml file exported (as exported by DSLTools)
 * SimpleExample/SimpleExampleM-XML.ecore: the XML model corresponding to this XML file
 * SimpleExample/SimpleExampleM-DSLModel.ecore: the DSLModel model generated from the previous XML model and the DSL model of the Metamodel bridge ("SimpleExampleMM-DSL.ecore")
 * SimpleExample/SimpleExampleM-KM2.ecore: the KM2 model generated from the previous DSLModel model and the DSL model of the Metamodel bridge ("SimpleExampleMM-DSL.ecore")
 * SimpleExample/ATL-KM22SimpleExample.ecore: the ATL model generated from the KM3 model of the Metamodel bridge ("SimpleExampleMM-KM3-2.ecore")
 * SimpleExample/ATL-KM22SimpleExample.atl: the ATL file corresponding to the previous ATL model
 * SimpleExample/SimpleExampleM-EMF.ecore: the EMF model generated from the previous KM2 model using the generated ATL-KM22SimpleExample.atl transformation


Transformation files
--------------------
 * XML2DSLModel.atl
 * DSLModel2KM2.atl
 * KM32ATL_KM22MM.atl
 * KM2Tools.atl

The XML2DSLModel transformation ("XML2DSLModel.atl") can be tested with the XML model ("SimpleExample/SimpleExampleM-XML.ecore") as input.
The source XML model is obtained by injecting the initial xml file ("SimpleExample/SimpleExampleM.xml") into an XML model.
This transformation returns a DSLModel model ("SimpleExample/SimpleExampleM-DSLModel.ecore").

The DSLModel2KM2 transformation ("DSLModel2KM2.atl") can be tested with the DSL model ("SimpleExample/DSL2EMF/SimpleExampleMM-DSL.ecore"), along with the DSL model produced by the Metamodel bridge ("SimpleExampleMM-DSL.ecore") as input.
This transformation returns a KM2 model ("SimpleExample/SimpleExampleM-KM2.ecore").

The KM32ATL_KM22MM transformation ("KM32ATL_KM22MM.atl") can be tested with the KM3 model produced by the Metamodel bridge (use the "SimpleExample/EMF2DSL/SimpleExampleMM-KM3-2.ecore" one) as input.This transformation returns an ATL model ("SimpleExample/ATL-KM22SimpleExample.ecore").
This ATL model can be extracted into an ATL file ("SimpleExample/ATL-KM22SimpleExample.atl").

The generated ATL-KM22SimpleExample.atl transformation can be tested with the KM2 model ("SimpleExample/SimpleExampleM-KM2.ecore") as input, along with the "KM2Tools.atl" library.
This transformation returns an EMF model ("SimpleExample/SimpleExampleM-EMF.ecore").

