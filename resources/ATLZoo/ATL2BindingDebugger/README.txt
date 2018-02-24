The ATL2BindingDebugger ATL transformation adds a debug instruction to each binding in an ATL transformation.

For instance:
rule R1 {
	from
		s : ATL!Module
	to
		t : ATL!Module (
			name <- s.name
		)
}

Will be transformed into:
rule R1 {
	from
		s : ATL!Module
	to
		t : ATL!Module (
			name <- s.name.debug('R1.t.name')
		)
}

The following debug information is displayed in a console view or in a terminal when the generated transformation is executed:
	R1.t.name: 'ATL2BindingDebugger'

This transformation uses ATL refining mode as defined in [1].
This kind of transformation is a HOT (Higher Order Transformation): it takes a transformation as source and as target.

Source and target models conform to ATL metamodel.
A sample source model (sample-ATL-0.2.ecore) and its corresponding target model (Sample-ATL-0.2(Debug).ecore) are given.

File Configuration.png shows how to configure the transformation for launch.
It is now possible to use the "Metamodel by URI" button to use a metamodel already registered in EMF.
We advise you to use this new feature to configure this transformation because ATL metamodel is already registered in EMF by ADT plugins.
Thanks to that, the latest version of ATL metamodel will always be used.

To serialize the generated ATL transformation you can use ATL extractor available in AM3 project (http://dev.eclipse.org/viewcvs/indextech.cgi/~checkout~/gmt-home/subprojects/AM3/index.html).
You can create easily input models thanks to ATL injector (also available in AM3 project).

If you have some problems with this, please use ATL mailing list (http://groups.yahoo.com/group/atl_discussion/).

References:
[1] Jouault, F., and Kurtev, I., Transforming Models with ATL, in proceedings of the Model Transformation in Practice Workshop, October 3rd 2005, part of the MoDELS 2005 conference
