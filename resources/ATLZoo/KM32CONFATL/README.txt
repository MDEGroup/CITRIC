KM3 metamodel to ATL comparison transformation

Bas Graaf
SERG - Software Engineering Research Group
Delft University of Technology
b.s.graaf@tudelft.nl

INTRO

This package include a higher-order transformation (HOT) that takes a
KM3 metamodel as source model and generates a model of an ATL
transformation. This transformation takes two source models (an
implementation and an architecture model) that conform to that
metamodel and generates a target model that is the union of the two
source models with each of the model elements labelled convergent,
divergent or absent depending on their occurrence in one or both of
the architecture and implementation models.

The HOT makes it possible to generically compare models conforming to
metamodels that describe architectural module views. The HOT accepts
source models that are injected KM3 models. They should define four
abstract elements, namely ViewElement, and its specialisations:
ViewEntity, ViewRelation, and ViewRoot. The rest of the metamodel
should extend these generic elements, for instance, a Module element
would extend a ViewEntity, while a Uses element would extend a
ViewRelation.

The HOT generates appropriate transformation rules and helpers for all
elements in the KM3 source model. The generated helpers for
determining whether an element in the implementation model correspond
to an element in the architecture model (isMapping) do this based on
naming for ViewEntity elements. For ViewRelation elements
correspondence is determined by checking whether the source and the
target of the ViewRelation are mappings of each other.


REQUIREMENTS

This package requires a correct installation of ATL and AM3 plugins
(2.0RC2 via Eclipse update). Furthermore, for visualisation of
generated models Graphviz is required.

EXECUTION

For a complete execution of all involved steps, simply execute the ANT
build script.


CONTENTS

This package contains an eclipse ATL project that includes the 
following files and directories:

metamodels:
	MADL.KM3 - an example metamodel for simple module-uses views
	KM3.ecore - metamodel for KM3 models (source metamodel of HOT)
	ATL-0.2.ecore - metamodel for ATL models (target metamodel of
	HOT)
	ATL-0.2-TCS.ecore, TCS.ecore - metamodels needed for
	extraction of ATL models into ATL file

	
models: 
	architectureModel.ecore - sample source model (for generated
	transformation)
	implementationModel.ecore - sample source model (for generated
	transformation)

transformations
	KM32CONFATL.atl - HOT for generation of comparison
	transformation model
	MADL2DOT.atl - Transformation to generate DOT model from MADL
	model for visualisation purpose
	DOT2Text.atl - Query to generate DOT code from DOT model
	KM32EMF.atl - Transform KM3 model into EMF model, such that it
	can serve as source or target metamodel for ATL
	transformations

build.xml - ANT build script that does the following:

	1) inject MADL.KM3 into a KM3 model

	2) apply KM32CONF.atl to injected KM3 model to generate ATL
	model

	3) extract ATL model in conf4MADL.atl file

	4) apply conf4MADL.atl to implementationModel.ecore and
	architectureModel.ecore to evaluate conformance

	5) Apply MADL2DOT to all source and target MADL models

	6) Extract all generated DOT models into .dot files

	7) Process generated .dot files with dotty to generate
	PostScript files
	
	All generated files are placed in the target directory
	(might require refresh of workspace).
	
target_example - contains example copies of the files 
	that should be generated automatically in the target 
	directory by the ANT build script
	