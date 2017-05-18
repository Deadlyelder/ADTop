# ADTop (Attack-Defence Tree optimizer)

<!--- TODO: Add description as introduction, papers --->

## Dependencies

* Java JDK 8u92
* Maven
* Scene Builder
* Any IDE like for e.g. [eclipse](https://eclipse.org/ide/)

## Installation

ADTop is build as Maven project which makes it easier to install the project.




You need java JDK 8u92 or later version.

ADTop is a Maven project, when you pull the project, you need to update project
and clean it.

ADTop user Java FX that's why you need a software to create future screen in
FXML. You can user Scene Builder.

Class gui charge index FXML file created via Scene builder. This FXML file is
connected to Index controller. Index controller contains other controllers.
Java FX, FXML structure is nested application. You can access to attributs of
FXML file ex: button thanks to @FXML tag. Index controller is the principal
controller. It has a principal Attribute called Pack. This object contains all
models used in ADTop. Measure container, Attack-defence tree etc..

All models are in the model class.

Jackson is used to import export Measure container.
Apache POI is used to import export Association Matrix.
Apache XML is used to parse XML. (ADT is bidirectionnal object, that's why Tree
is parsed manually)



Execution: You can simply pull the project download dependencies via maven download
dependencies menu (right click on project).

Generate JAR : you can generate a Jar via maven clean install menu.

BRANCHES

Master and development (merged) final delivered version
addCost (with some additional features like adding and editing costs.)

## Further information

Additionally, interested parties can contact [itrust consulting](https://www.itrust.lu)
or call `0035226176212` for further information information.
