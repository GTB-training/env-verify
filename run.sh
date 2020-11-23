#!/bin/sh

echo '> JDK properties'
java src/main/java/gtb/env/verify/App.java

echo '> JDK version >= 11'
gradle test
