# 5540-Big-Data

## Running Web Visualization
We used Eclipse to run our web servlets. 

### To import the project into eclipse: 
File > Import.. > General > Existing Projects into Workspace > Enter the Java directory as the directory root > Finish

### Project Properties
The JavaSE-1.8 System library was used 
Java version 1.8 is used

### Congfigure Input CSV Directory
In the Java/src/DataReader.java file, change the csvDirPath variable to point to where your csv directory is that holds all the query files. 

### To start servlets: 
Right click on TwitterAnalysis project > Run as > Run on Server > Select or create server 

We used JBoss Enterprise Application Platform 6.1+ as the server. 

### To open the web pages:
Click on any of the html files in the HTML folder. Each page has a link to the other queries for navigation. 
