#!/usr/bin/env bash
javac OctalToDecimalConverter.java
java OctalToDecimalConverter --base 8 67 > actual
diff actual expectedOutput55
java OctalToDecimalConverter --base 8 1 > actual
diff actual expectedOutput1
java OctalToDecimalConverter --base 8 9 > actual
diff actual expectedOutput9
