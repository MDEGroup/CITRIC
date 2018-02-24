This transformation transforms UML class diagrams into AnyLogic [1] simulation models. The
transformation is executed in two steps:

1) The UML model is transformed into an AnyLogic model conforming to a (simplified) AnyLogic
   Metamodel (Metamodels/AnyLogic.ecore).

2) The obtained AnyLogic model is then transformed into AnyLogic's XML format. This is done
   by transformation into a model conforming to the XML metamodel (Metamodels/XML.ecore). 
   The obtained model can be written to XML using the AM3 XML extractor.

For intput, the transformation takes an UML model containing UML activity diagrams. The model
has to conform to the Eclipse UML2 project's UML2 metamodel (http://www.eclipse.org/uml2/2.0.0/UML) [2]. 
Additionally concrete diagram syntax should be provided as an UMLDI model conforming to the
TOPCASE DI metamodel (http://www.topcased.org/DI/1.0) [3]. The input model should be annotated with
performance annotations applying the SPT profile (Input/Profile/SPT.profile.uml).

To run the transformation execute the provided ANT build script (build.xml). To change the input and
output model adjust the properties at the beginning of the file. One example input is provided.

To run the simulation in AnyLogic, the ActivityDiagramLibrary (AnyLogicLibrary/ActivityDiagramLibrary.alp) 
needs to be loaded first.


Current Limitations:

 - The transformation ony handels the following activity diagram elements:
      Initial Node
      Final Node
      Join Node
      Merge Node
      Fork Node
      Decission Node (limited to Yes/No decissions)
      Action
      SendSignalAction
      AcceptEventAction
  - Currently a single activity is transformed; interaction between activities is not yet supported.
  - Every action is assigned to a seperate CPU in the simmulation. How deployment information should be
    transformed has yet to be explored.


Files:
  /build.xml                                  ANT build script to run the transformation

  /Transformations/UML2AnyLogic.atl           Transformation from a UML and a UMLDI model to an AnyLogic model
  /Transformations/AnyLogic2XML.atl           Transformation from an AnyLogic model to an XML "model"

  /Metamodels/AnyLogic.ecore                  Simplified AnyLogic metamodel
  /Metamodels/XML.ecore                       ATL's XML metamodel

  /Input/Profile/SPT.profile.uml              Simplified SPT (or MARTE) profile for Eclipse UML2 
  /Input/ToyModels/BookOrderProcessing.uml    Example activity: Book Order Processing
  /Input/ToyModels/BookOrderProcessing.umldi  Diagram information of example activity


References:

[1] XJ Technologies, AnyLogic simulation tool, http://www.xjtek.com

[2] Eclipse UML2 Project, http://www.eclipse.org/uml2

[3] TOPCASED Project, http://www.topcased.org