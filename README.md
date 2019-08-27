#java-delimited-file-parser
We like to give our candidates the opportunity to do what they do best, code. Below is an exercise we have used quite successfully over the past few years to hire great engineers. Please review, complete the exercise, and return to me.

We are going to score exercises on criteria like cleanliness, structure of code, correctness (we hope engineers actually run the code and test that it works), extensibility of design, data structure, efficiency in the solution, etc. We are firm believers in sound engineering principles and elegant coding solutions.

Demonstrate Use of Files, Strings and Simple Patterns in Java

Hypothetical Technical Requirement:

Create a program that is able to read lines of text from a file and parse each line into a list of tokens using various token delimiters.  Each invocation will determine its delimiter by the file extension. You should support tabs, and fixed width at a minimum. For example, given the following file (test.tab) contents:

This<tab>is<tab>a<tab>test
red<tab>green<tab>blue

NOTE: <tab> is the tab character, \t.

The implementation would first return the list [“This”, “is”, “a” and “test”] and then the list [“red”, “green” and “blue”].

Since we anticipate eventually parsing other types of files (ex: CSV, space and pipe delimited), the solution should be extensible to allow for that growth.  It is expected that you will use OO principles and best practices in Java.  

For this project, you should assume that your solution will be one component of a larger system and should take into consideration organization and documentation for other developers on the team, as well as technical factors such as varying input data and scalability.  This is an opportunity to demonstrate your API design and development skills.  

Feel free to ask clarifying questions or document assumptions made while designing your solution.

The java implementation should include a CLI (main method) to run on a file.  Assume the only argument given is the filename to process. If you do not see that as adequate, choose your own command line options, but you are responsible for documenting them.  You do not need to provide a script, the user of the program will run it using “java -jar <jar> <args>”.

In addition to the Java implementation, please provide unit tests covering success and error cases using the testing framework of your choice.  It is recommended to use a build system such as maven or gradle to build and execute tests. This solution is your best chance to impress us with your design and code writing skills, so make the best use of the opportunity.   

Once completed, please zip up the project into a single file and return it to me.