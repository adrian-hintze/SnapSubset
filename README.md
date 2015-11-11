# SnapSubset

SnapSubset allows the user to easily create a functional program that consists of a subset of Snap*!*.

This is a WIP and much can still be done. If it gets worked on will depend on the success of 
[Snapp*!*](https://github.com/Rydion/Snapp) and other projects that may use SnapSubset.

SnapSubset works by modifying [Snap*!*](https://github.com/jmoenig/Snap--Build-Your-Own-Blocks)'s source code, deleting part of it and rewriting 
the remaining subset to keep it functional. Which parts get deleted is defined by the user
using [info files](https://github.com/Rydion/SnapSubset#info-files).

# Demo

SnapSubset comes with the .info files used to create the reduced version of Snap*!* 
featured in Snapp*!*.

Create an executable at (http://snapp.citilab.eu/)[http://snapp.citilab.eu/]
using the **Presentation mode only** option to see what the end result looks like.

# Usage

Copy the working folder and SnapSubset.jar to whatever folder you like.

Put your .info files into /working/info/ and execute SnapSubset.jar through the command-line.

# Info files

Comming soon

# Requirements

- Requires at least Java 8

# Grammar

The grammar has been written for [Antlr4](http://www.antlr.org/).

## License 

SnapSubset

written by Adrian Hintze adrian.hintze AT est.fib.upc.edu

Copyright (C) 2015 by Adrian Hintze

SnapSubset is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later version.

This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License along with this program. If not, see http://www.gnu.org/licenses/.
