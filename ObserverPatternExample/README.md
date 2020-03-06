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


# Assumptions and Details taken into consideraton while implementing Shop Consortium : 

```bash
The purpose of this application is to get the details of the a product order in a shop and broadcast 
the details of delivery to all the registered drivers. Incase of any updates in the product delivery
the drivers will be notified again.

Inorder to implement a notification system to send notifications about delivery requests to drivers,
I will be using Observer pattern which will make it easier to broadcast the information to all the drivers.
This pattern makes it easier to communicate the request to all the drivers using one to many relationship
without having any dependency on the Subject(Shop Class/ delivering store).

Shop Class implements an interface Subject which has regiter, unregister and notify methods.

Shop Class will maintain the product details, delivery address and drivers list inorder to allow registering, 
degistering and notifiying the drivers. This is achieved by overriding the methods from the Subject interface.
This makes it easier to add or remove driver objects in future providing flexibility to the code.
Duplicated code is avoided by overriding the methods from Subject interface and by overriding the observer interfaces update method.

Driver class will maintain the driver name and will receive updates if the subject/observable
( Shop class) updates any new delivery requests.

DeliveryRequest class has been used to write j-unit tests. I have considered 6 driver objects and 2 shop objects(electronics, flowers)
to test scenarios for delivery request broadcasting.

For testing purpose, 5 drivers have been registered for electronics delivery and 3 drivers have been
registered for flowers delivery.

Using product delivery method from shop class, the delivery address is notified to respective drivers.

Testing for de-registering a driver and broadcasting the delivery request to updated list of drivers is considered.
The delivery address has also been updated after removindg a driver from the list, so the output displays drivers delivering
electronics to dorchester but the driver dave has been de-registered from this list.

Outputs for the tests is as follows:
john has received air ipods to be delivered at :: Boston
jay has received air ipods to be delivered at :: Boston
dave has received air ipods to be delivered at :: Boston
chloe has received air ipods to be delivered at :: Boston
alice has received air ipods to be delivered at :: Boston
smith has received daisy to be delivered at :: Malden
chloe has received daisy to be delivered at :: Malden
alice has received daisy to be delivered at :: Malden

 ---output after de-registering dave from driver list and updating delivery address to Dorchester---

john has received air ipods to be delivered at :: Dorchester
jay has received air ipods to be delivered at :: Dorchester
chloe has received air ipods to be delivered at :: Dorchester
alice has received air ipods to be delivered at :: Dorchester

Observer pattern has been used for this implementation scenario since it makes easier 
broadcasting of data to many observers without any dependency on the Subject.

Please refer Class_Diagram_Observer_Pattern.pdf for class model of my application.

```

