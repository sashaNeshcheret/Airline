# Airline
Create console application “Airline”:

Define aircraft class hierarchy. There should be 3 levels of the hierarchy.

Create an airline company that stores airplanes.

Calculate total capacity and carrying capacity of all the aircraft in the airline.

Sort the aircrafts by flight range (from smaller to larger) and display it on screen.

Find aircraft corresponding to the specified range of fuel consumption parameters (liters per hour).

Console menu should contain following commands at bare minimum:

Calculate the total capacity and carrying capacity of all the aircraft in the airline.
Display the list of aircraft of the company sorted by flight range.
Find airplanes corresponding to a given range of fuel consumption parameters.
Application must meet the requirements:

Stick to java code convention.
Use OOP : classes, inheritance, polymorphism, encapsulation, interfaces, etc.
Each class must have a meaningful name and reasonable composition.
Inheritance should only be applied when it makes sense.
Classes must be correctly decomposed into packages
Requirements for task design:

Source code must be stored on GitHub, the applicant must provide read access to the repository.
The code should be compiled by Java 8.
The project should be assembled with maven install command or gradle build (optionally).
Repository must contain root file README.MD with instructions for launching the application and any other necessary documentation for the application (in English).
Running the application should not require an application server or installation of any software except for Java and maven / gradle.
Data can be stored in any format. Files can be (but not necessarily) used to store aircraft.
Opensource libraries and frameworks are allowed.
Evaluation criteria:

functional correctness according to the technical requirements,
application usability,
readability, maintainability and compliance of the code with OOP and SOLID principles,
documentation for the application and the code,
unit tests availability,
any non-standard technical solutions,
any additional features not specified in the technical requirements, but making the application more functional or convenient,
task execution time.
Download the application from the repository with the command

git clone https://github.com/sashkalife/Airline.git

Run the aplication with the command

mvn install
java -jar airplane-1.0.-SNAPSHOT.jar
