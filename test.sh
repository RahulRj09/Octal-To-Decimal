#!/usr/bin/env bash
javac BaseConverter.java
java BaseConverter --base 8 67 > actual
diff actual expectedOutput55
java BaseConverter --base 8 1 > actual
diff actual expectedOutput1
java BaseConverter --base 8 9 > actual
diff actual expectedOutput9
