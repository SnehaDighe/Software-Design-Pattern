# Project Template

This is a Java Maven Project Template


# How to compile the project

We use Apache Maven to compile and run this project. 

You need to install Apache Maven (https://maven.apache.org/)  on your system. 

Type on the command line: 

```bash
mvn clean compile
```

# How to create a binary runnable package 


```bash
mvn clean compile assembly:single
```


# How to run

```bash
mvn -q clean compile exec:java -Dexec.executable="edu.bu.met.cs665.Main" -Dlog4j.configuration="file:log4j.properties"
```

We recommand the above command for running the project. 

Alternativly, you can run the following command. It will generate a single jar file with all of the dependencies. 

```bash
mvn clean compile assembly:single

java -Dlog4j.configuration=file:log4j.properties -classpath ./target/JavaProjectTemplate-1.0-SNAPSHOT-jar-with-dependencies.jar  edu.bu.met.cs665.Main
```


# Run all the unit test classes.


```bash
mvn clean compile test

```

# Using Findbugs 

To see bug detail using the Findbugs GUI, use the following command "mvn findbugs:gui"

Or you can create a XML report by using  


```bash
mvn findbugs:gui 
```

or 


```bash
mvn findbugs:findbugs
```


For more info about FindBugs see 

http://findbugs.sourceforge.net/

And about Maven Findbug plugin see 
https://gleclaire.github.io/findbugs-maven-plugin/index.html


You can install Findbugs Eclipse Plugin 

http://findbugs.sourceforge.net/manual/eclipse.html



SpotBugs https://spotbugs.github.io/ is the spiritual successor of FindBugs.


# Run Checkstyle 

CheckStyle code styling configuration files are in config/ directory. Maven checkstyle plugin is set to use google code style. 
You can change it to other styles like sun checkstyle. 

To analyze this example using CheckStyle run 

```bash
mvn checkstyle:check
```

This will generate a report in XML format


```bash
target/checkstyle-checker.xml
target/checkstyle-result.xml
```

and the following command will generate a report in HTML format that you can open it using a Web browser. 

```bash
mvn checkstyle:checkstyle
```

```bash
target/site/checkstyle.html
```


# Generate  coveralls:report 

```bash
mvn -DrepoToken=YOUR-REPO-TOCKEN-ON-COVERALLS  cobertura:cobertura coveralls:report
```


# Assumptions for the BattleShip Game 

```bash
This is a one player to computer battleship game.
Every ship is holding only one cell in the grid.
I am using strategy pattern for this game where human turn and computer turn are behaviors
for battleship game handled by battleship controller, humanturn and computerturn classes.
Board controller is created as a 5 by 5 matrix and the value for this grid is taken from 
a constant file.
Battleship controller controls the entire game starting from player move to maintaining the state 
of the board to maintaining counters which helps to decide who won the game.
' - ' is used to display water cells of the ocean.
' H ' is used to display Human player ship.
' C ' is used to display Computer ship.
' X ' is used to display a successful hit.
' * ' is used to display incorrect move.
Player ships and Computer Ships are placed at random positions on the board.
Inorder to play the game, player needs to enter co-orinates on the console after
running the program.
Computer moves are made using random generated numbers from the code.
Counter is maintained to check whether the computer wins or the human player.
Outputs are displayed on console and to play the game using println methods and scanner methods.
```
# Refactoring
```bash

For Refactoring purpose, I have chosen Battleship Game Project, Assignment 4.
1)Method Extraction:
I have used Random class to generate variables at 2 places in class Battleship.java inside the methods deployPlayerShips( ) and deployComputerShips( ). Here the same lines of code is used which can be extracted to a method and used.
For Refactoring process, I have extracted the code in to method generateRandomValues( ) which returns integer array and is used to get the x and y co-ordinates for deploying ships in the for loop. This will help me to avoid duplicate lines of code.
//generate random values for x and y coordinates
public static int[] generateRandomValues(){
  Random ran = new Random();
  int x = ran.nextInt(5);
  int y = ran.nextInt(5);
  int[] array = {x,y};
  return array;
}

2)Organizing Data:
I want to remove the hardcoded values from my code by putting it into a Constants file, so that at the later stage of the application if there is a requirement to change the limits for such values, it can be changed from a single file instead of changing it at multiple places.

Constants.java
public static final int random_integer_bound = 5;//limit for the random integers.

The limits for the random integer generation can now be changed from the constants file without changing any other files.

3)Deleting unused methods:
Few  methods which are not used through out the course of application can be removed. So I am removing method getComputerCoordinates( ) from ComputerTurn.java as a part of code cleanup.

4)Changing the access modifier for the attributes of a class by making it private.

```

