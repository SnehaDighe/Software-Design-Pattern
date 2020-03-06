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

# Visitor Design Pattern 

```bash
This Application is a Grocery Shopping Application which uses Visitor Design pattern
to calculate the total price of all the groceries which is in the cart. It also calculates
the price for each item. Discounts are applied to few items based on certain conditions.
Visitor design pattern makes it easy to calculate cost for different item by using specific
conditions for discount.
Assumptions made for this application:
1) I have considered 3 grocery items : Dairy products, Vegetables, Snacks
2) Calculation for vegetables = price per kg of the vegetable * weight in kg of the vegetable.
3) Calculation for Dairy Products:
    3.1) If the price of the products is greater than 20, a 5$ discount is given for that item.
    3.2) If the price of product is less than or equal to 20, no discount is provided.
4) Calculation for Snacks:
    4.1) If the total snack items is more than 10, a 15% discount is provided on the toatl snack amount.
    4.2) If the total snack item is less than or eual to 10, no discount is provided.
The total cost of all the items in the cart is calculated using array of all this different items.
```


