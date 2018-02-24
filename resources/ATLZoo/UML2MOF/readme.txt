Metamodel files
---------------
 * MOF-1.4.km3
 * MOF-1.4.xmi
 * UMLDI-20030818.km3
 * UMLDI-20030818.xmi

Example files
-------------
 * library-uml.zuml: the original Poseidon UML file
 * UML2MOF/library-uml.xmi: the corresponding UML model test file (as exported by Poseidon)
 * UML2MOF/library-mof.xmi: the MOF model generated from the previous UML model
 * MOF2UML/library-mof.xmi: the source MOF test file (corresponding to the result of the UML2MOF transformation)
 * MOF2UML/library-uml.xmi: the UML model generated rom the previous MOF model

Transformation files
--------------------
 * UML2MOF.atl
 * MOF2UML.atl

"UMLDI-20030818.xmi" and "MOF-1.4.xmi" are the MDR metamodels for UML and MOF models.
Note that the MOF metamodel is not required to execute the transformations, since the ATL engine is itself based on MOF (select the "MM is MOF" option in ADT).
Km3 files provide readable versions of these metamodels in the km3 format.

The UML2MOF transformation ("UML2MOF.atl") can be tested with the UML model ("UML2MOF/library-uml.xmi") as input.
It returns a MOF model ("UML2MOF/library-mof.xmi").
The MOF2UML transformation ("MOF2UML.atl") can be tested with the MOF model ("MOF2UML/library-mof.xmi") as input.
It returns a UML model ("MOF2UML/library-uml.xmi").
The model files handled by this couple of transformations are defined with MDR.

The "library-uml.zuml" file corresponds to the original UML model designed with the Poseidon tool.
The "UML2MOF/library-uml.xmi" file is the corresponding UML model, as exported in xmi format by Poseidon.
The "UML2MOF/library-mof.xmi" file is the MOF model produced by the UML2MOF transformation.
The "MOF2UML/library-mof.xmi" file is a copy of the previous file that is used as input of the MOF2UML transformation.
The "MOF2UML/library-uml.xmi" file is the UML model produced by the MOF2UML transformation. It should be openable by the Poseidon tool.