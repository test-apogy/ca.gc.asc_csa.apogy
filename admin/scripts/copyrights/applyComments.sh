#!/bin/bash

CSCRIPT=$(dirname $0)/copyright-adder.py

echo "CSCRIPT: $CSCRIPT"

# First strip the comments
for i in $(find . -name \*.java -o -name \*.MF -o -name \*.xml)
do
    tmpFileName=$(tempfile)
    $CSCRIPT strip $i > $tmpFileName
    mv $tmpFileName $i
done

