#!/usr/bin/env bash
javac BaseConverter.java
java BaseConverter --base 8 67 > actual
diff actual expectedOutput55forbase8
java BaseConverter --base 8 1 > actual
diff actual expectedOutput1forbase8
java BaseConverter --base 2 5 > actual
diff actual expectedOutput5forbase2
java BaseConverter --base 8 9 > actual
diff actual expectedOutput9forbase8
java BaseConverter 10 > actual
diff actual expectedOutput10