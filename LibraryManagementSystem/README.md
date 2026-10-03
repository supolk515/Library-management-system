# Library management system

A small console-based Java exercise. Requires JDK 17 or later.

From the repository root:

```sh
javac -encoding UTF-8 -d out LibraryManagementSystem/*.java
java -cp out LibraryManagementSystem.LibraryApp
```

In IntelliJ IDEA, mark the repository root as Sources Root, select JDK 17 or later,
and run LibraryApp.main(). The previous entry point test.java has been replaced
by LibraryApp.java.

The program supports adding, displaying, searching, borrowing and returning books.
Search matches titles and authors without case sensitivity. Borrowing and returning
use an exact title match without case sensitivity and change one eligible copy per
request. Identically titled books are treated as copies, selected in insertion order.
Blank inputs and invalid numbers are rejected; input closure exits cleanly.

Data is held in memory and is lost when the program exits.
