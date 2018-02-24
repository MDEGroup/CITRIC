Metamodel files
---------------
 * KM3.ecore
 * KM3.km3
 * Metrics.ecore
 * Metrics.km3

Example files
-------------
 * KM3-KM3.ecore: the KM3 metamodel test file
 * KM3-Metrics.xmi: the Metrics model generated from the KM3 model

Transformation files
--------------------
 * KM32Metrics.atl

"KM3.ecore" and "Metrics.ecore" are the metamodels for KM3 and Metrics models.
Km3 files provide readable versions of these metamodels in the km3 format.

The KM32Metrics transformation ("KM32Metrics.atl") can be tested with the KM3 model ("KM3-KM3.ecore") as input.
It returns a Problem model ("KM3-Metrics.xmi").

The test file corresponds to the KM3 metamodel expressed in KM3.
"KM3.km3" provides a readable version of the KM3 source metamodel (textual format).
This file has to be injected into a KM3 model to produce the test KM3 model ("KM3-KM3.ecore").
