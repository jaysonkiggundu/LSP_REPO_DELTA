I had to manually configure JUnit on my Macbook with VSCode.

So to run this program successfully.

1. Navigate to the root directory "JavaProjectRoot"

2. Run command javac -cp "lib/junit-platform-console-standalone-1.9.0.jar" src/org/howard/edu/lsp/assignment6/*.java
This will compile all the Java files for assignment6.

3. Then run command java -cp "lib/junit-platform-console-standalone-1.9.0.jar:src" org.junit.platform.console.ConsoleLauncher --scan-classpath
This will run the JUnit Java Tests.