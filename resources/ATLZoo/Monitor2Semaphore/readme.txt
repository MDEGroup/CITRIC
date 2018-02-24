Metamodel files
---------------
 * Program.ecore
 * Program.km3

Example files
-------------
 * SingleResource.pgrm: input SingleResource pseudocode
 * SingleResource.ecore: corresponding SingleResource model
 * SingleResource-Semaphore.ecore: generated Semaphore-based SingleResource model
 * SingleResource-Semaphore-reserialized.pgrm: corresponding Semaphore-based pseudocode

 * ReadersAndWriters.pgrm: input ReadersAndWriters pseudocode
 * ReadersAndWriters.ecore: corresponding ReadersAndWriters model
 * ReadersAndWriters-Semaphore.ecore: generated Semaphore-based ReadersAndWriters model
 * ReadersAndWriters-Semaphore-reserialized.pgrm: corresponding Semaphore-based pseudocode

Transformation files
--------------------
 * Monitor2Semaphore.atl


"Program.ecore" is the metamodel for Program models.
The Km3 file provides a readable version of the Program metamodel in the km3 format.

The Monitor2Semaphore transformation ("Monitor2Semaphore.atl") can be tested with either the SingleResource ("SingleResource.ecore") or ReadersAndWriters ("ReadersAndWriters.ecore") model example as input.
It returns a Semaphore-based Program model ("<example-name>-Semaphore.ecore").

".pgrm" files provide a textual pseudocode version of the input and output models.
Moving from/to such a textual representation is beyong the scope of this example.