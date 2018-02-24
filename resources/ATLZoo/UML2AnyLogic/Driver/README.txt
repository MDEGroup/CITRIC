The TUDEMF model handler
========================

This ATL model handler is an extension of the EMF model handler included
in ATL. It changes the behaviour of the original handler only in one point:
It handles not-standard primitive type (e.g., Point) by converting values
to Strings instead of throwing an "can not handle element" error.

It is applicable, for instance, to handle TOPCASED diagram interchange models,
where the metamodel defines the primitive types Point, Dimension, 
AbsoluteBendpoint, and RelativeBendpoint.

The model handler was tested with ATL 2.0 RC1.
