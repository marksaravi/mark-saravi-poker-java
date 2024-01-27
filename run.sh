#! /bin/bash
rm *.class
javac App.java
cat poker-hands.txt| java App