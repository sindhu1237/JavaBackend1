**## Exception Handling**
- _Exception_ => Something unusual or unexpected.
* # What is exception?
    - An unexpected scenario.
      `void readContentsofaFile(String filename){
      File f = new File(filename with path);
      FileReader fr = new FileReader(f);
      fr.read();
      }`
      `main() {
      readContentsofaFile('abc.text');
      }`
    - If the file doesn't exist leads to **File Not Found Exception**.
      `Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();`
      **output : "Hello"
      Input mismatch foundException**

* # What happens if an exception is not handled ?
- Program crashes
- Application shutdown
- stops abruptly.
- Bad surprise for clients.

* # How to handle an exception and why is that necessary ?
- Application doesn't crash and client can see something sensible if exception is handled.
- Exception can be handled using try, catch and finally.

`void readContentsofaFile(String filename){
try{
File f = new File(filename with path);
FileReader fr = new FileReader(f);
fr.read();
}catch(FileNotFoundException e){
System.out.println(e);
}
}`
`main() {
readContentsofaFile('abc.text');
}`

* # Is there a way to write try catch which can handle all kind of exceptions ?

* # what is the purpose of finally?

- final data member =>  cannot change value
- final method => can't be overridden.
- final class => can't be inherited.
- finalize => A method in class to be executed before Garbage Collector frees the memory taken by the object.It is the last opportunity to free unmanaged resources (ports, databases and files).
- finally => block associated with try and catch.

* # Can we have multiple catch blocks and what is the use of it?
- Yes we can have multiple catch blocks following a try block. Each catch block is used to catch and handle a specific type of exception that might be thrown within the corresponding try block.
  `try {
  // Code that might throw exceptions
  } catch (ExceptionType1 e1) {
  // Exception handling for ExceptionType1
  } catch (ExceptionType2 e2) {
  // Exception handling for ExceptionType2
  } catch (ExceptionType3 e3) {
  // Exception handling for ExceptionType3
  }`

* # Do we need to have an exception block for all kind of exceptions?
- No, Exception class catch block can handle all kinds of exception.


**Throwable** - base class for excetion and error.
**Error** - The kind of problem from which the program can't recover even with exception handling.
No catch blocks for this.

* Parent exception can handle child exception but not vice-versa.
    - eg; NullPointer exception can be handled by RunTimeException as well as Exception class.
* If we have multiple catch blocks,
    - specific exceptions catch clauses should come before generic exception catch clauses.
    - child exceptions appear before parent exceptions.

* # Is it possible for the exceptions in nested catch blocks to be unhandled?
- If the program doesn't handle the exception in all nested try-catch blocks, it will crash.

**Checked Exception**
- The classes which derive directly from the exception class
  e.g: SQL Exception, PortInuse, FileNotFound, I/O Exception
    1. can happen even if the code is written correctly. [SQL Connection can throw SQLException if the wifi is lost.]
    2. Java tries to predict them. [Reading files, communicating over network etc]
    3. Java checks them at compile time. [try-catch or mark method with throws (dangerous) or compilation will fail.]
    4. Java's way of forcing exception handling like if exception handling is not handle the code will not compile.
       **UnChecked Exception**
- The classes which derive directly from the runtime exception.
  e.g:DivideByZero, NullPointer and ArrayIndexOutofBound etc.
    1. Generally won't occur in well written programs.
    2. will not check at compiletime.
    3. Java will not force to handle exceptions.
    4. can be handled by safe coding.


**Custom Exception**
- When to make a custom exception?
- how to make a custom exception?
- how to use a custom exception?

* When we are already throwing exception inside method, then why do we have to declare 'throws exception'?
- we need to tell client our method is going to throw exception try to handle it.


**throw vs throws**
**throws** :
- it doesn't throw an exception
- it is just a declaration on a method to let clients know that this method can cause what kind of exception. So, that clients can do exception handling and fix their code.

**throw** :
- 