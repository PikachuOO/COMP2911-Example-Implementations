#!/bin/sh

javac *.java -Xlint:unchecked
java Main
rm *.class
