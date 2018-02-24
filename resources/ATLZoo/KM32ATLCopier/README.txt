The KM32ATLCopier transformation creates a transformation of copy for a source KM3 model.

This kind of transformation is a HOT (Higher Order Transformation): it takes a transformation as target.

Source model conforms to KM3 metamodel and target model conforms to ATL metamodel.
A sample source model (sample-KM3.ecore) and its corresponding target model (ATLCopier.ecore) are given.

File configuration.PNG shows how to configure the transformation for launch.
It is now possible to use the "Metamodel by URI" button to use a metamodel already registered in EMF.
We advise you to use this new feature to configure this transformation because ATL metamodel is already registered in EMF by ADT plugins.
Thanks to that, the latest version of ATL metamodel will always be used.

To serialize the generated ATL transformation you can use ATL extractor available in AM3 project (http://dev.eclipse.org/viewcvs/indextech.cgi/~checkout~/gmt-home/subprojects/AM3/index.html).
You can create easily input models thanks to ATL injector (also available in AM3 project).

If you have some problems, please use ATL mailing list (http://groups.yahoo.com/group/atl_discussion/).
