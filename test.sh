#!/usr/bin/env bash
javac OctalToDecimalConverter.java
java OctalToDecimalConverter 67 > actual
diff actual expectedOutput55
java OctalToDecimalConverter 1 > actual
diff actual expectedOutput1
java OctalToDecimalConverter 9 > actual
diff actual expectedOutput9
