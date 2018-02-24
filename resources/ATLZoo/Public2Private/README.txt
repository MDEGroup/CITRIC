The Public2Private ATL transformation makes all public attributes of a UML 1.4 model private.
Getters and setters are also created appropriately (i.e. no setter for a frozen attribute).

This transformation uses ATL refining mode as defined in [1]:
"In ATL, source models are read-only and target models are write-only;
this prohibits in-place transformations. However, such transformations are
quite common in certain domains. Therefore, ATL provides a mechanism to
answer this need: refining mode. This mode can be used for transformations
having the same source and target metamodel. Unmatched source elements are
automatically copied into target model, as if a default copying rule was
present."

Thanks to refining mode, only two rules have to be written: one for read-only (i.e. "frozen"
in UML terminology) attributes and one for read-write attributes.

Source and target models conform to UML the 1.4 metamodel provided as UMLDI.xmi.
A sample source model (PetriNet.xmi) and its corresponding target model (PetriNet-Privatized.xmi) are given.
Both models are also given in PNG format for easy visualization.
Additional source models may be created using Poseidon (http://www.gentleware.com/).

File Configuration.png shows how to configure the transformation for launch.

References:
[1] Jouault, F., and Kurtev, I., Transforming Models with ATL, in proceedings of the Model Transformation in Practice Workshop, October 3rd 2005, part of the MoDELS 2005 conference