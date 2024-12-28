# Java Practical Exam Preparation

This repository contains a collection of Java programs aimed at helping me and my freinds to prepare for our upcoming practical exam. The repository is divided into four sections: Sample Programs, OOPS Programs, Applet Programs, and Java ODBC Programs.

## Repository Structure

```bash  
📦 java-practical-exam-prep
├── 📂 SamplePrograms
├── 📂 AppletPrograms
├── 📂 ODBCPrograms
└── README.md
```

## 1. Sample Programs
The SamplePrograms folder contains a variety of Java programs that cover core concepts such as:

- Loops and Control Statements
- Arrays and Strings
- File Handling
- Object-Oriented Programming (OOP)

## 2. OOPS Programs
The OOPSPrograms folder contains Object-Oriented Programming (OOP) concepts such as:

- Classes and Objects
- Inheritance, Polymorphism, Encapsulation, and Abstraction
- Constructors and Method Overloading
- Interfaces and Abstract Classes

## 3. Applet Programs
The AppletPrograms folder contains Java Applet programs that showcase:

- Drawing shapes
- Handling events in applets
- Animations in applets

## 4. ODBC Programs

The ODBCPrograms folder contains programs demonstrating database connectivity using Java ODBC. These programs include:

- Connecting to a database
- Executing SQL queries
- Handling result sets

## How to Run the Programs

<mark>Important! whenever you open the CMD you have to ensure that the path has set</mark>
1. Open the Command Prompt or Terminal.
2. Navigate to the directory where the Java program is located.

```bash
set path=c:\jdk1.3\bin
```

### Sample Programs

1. Navigate to the **SamplePrograms** folder.
2. Compile the Java files using:

```
javac ProgramName.java
```
3. Run the program using:
```bash
java ProgramName
```
### OOPS Programs

1. Navigate to the **OOPSPrograms** folder.
2. Compile the Java files using:
```
javac OOPProgramName.java
```
3. Run the program using:
```
java OOPProgramName
```

### Applet Programs

1. Navigate to the **AppletPrograms** folder.
2. Compile the Applet files using:
```
javac AppletName.java
```
3. Run the applet using an applet viewer or a browser that supports applets:
```
appletviewer AppletName.java
```

### ODBC Programs

1. Ensure you have the required JDBC driver set up for ODBC connectivity.
2. Navigate to the **ODBCPrograms** folder.
3. Compile the Java ODBC files using:

```
javac ODBCProgramName.java
```
4. Run the program using:
```
java ODBCProgramName
```
5. Package Program
If you encounter a program with import statements like import comp.factorial;, the comp.factorial refers to a package that contains the factorial class or utility. To identify and find the package and its corresponding program files, follow these steps:

      1)Understand the import Statement

      The import statement specifies the location of the class or utility in a hierarchical structure.
      For example, import comp.factorial; means:
       ```
      **comp is the package.**
       ```
      factorial is a class or interface within the comp package.

      2) Locate the Base Directory

      Packages are stored as a directory structure on the filesystem.
      The comp package should exist as a folder named comp in the base directory.

      3)Search for the Package Directory

      Check the directory containing the source code files for a folder named comp.
      Ensure that the comp folder contains a file named factorial.java (for Java programs).

      ### *Thanks for reading and all the best ❤️🫂*

