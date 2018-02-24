The MeasuringModelRepositories collects measurement data on KM3 metamodels.

Contents:
 - ATL project directory named "MeasuringModelRepositories".
   - This "README.txt".
   - InputModels directory with "emptyMerge-Measure.ecore", "oldMerge-Measure.ecore" and some KM3 metamodels.
   - Metamodels directory with HTML, Measure, SVG, Table and XML file in .km3 and .ecore format.
   - OutputModels directory.
   - Transformations directory with "HTML2XML.atl", "KM32EMF.atl", "KM32Measure.atl", "Measure2Table.atl", "RefineAndMergeMeasure.atl", "SVG2XML.atl", "Table2SVGBarChart.atl", "Table2SVGPieChart.atl" and "Table2TabularHTML.atl" transformation files.
   - "build.xml" and "build_merge.xml" ANT script files and these shared configuration files "MeasuringModelRepositories build.xml.launch" and "MeasuringModelRepositories build_merge.xml.launch".
   
Open the AM3 Perspective.

Using ANT scrip:
 - Open "build.xml" and "build_merge.xml" files and give a correct ant-contrib.jar path and a correct absolute workspace path.
 - Run the "build.xml" with: Right click -> Run As -> ANT Build (the launch file is already configured).
 - Run the "build_merge.xml" with: Right click -> Run As -> ANT Build (the launch file is already configured).
 - The results are sorted in subdirectories Merge, SVGBarChart, SVGPieChart and TabularHTML of the directories OutputModels.
 