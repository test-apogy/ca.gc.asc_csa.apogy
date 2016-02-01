#!/bin/bash

CSCRIPT=$(dirname $0)/copyright-adder.py
COPYRIGHT=$(dirname $0)/../../org.eclipse.symphony.admin/legal/copyrights.txt

echo "CSCRIPT: $CSCRIPT"

# First strip the comments
for i in $(find . -name \*.java -o -name \*.MF -o -name \*.xml)
do
    tmpFileName=$(tempfile)
    $CSCRIPT strip $i > $tmpFileName
    mv $tmpFileName $i

    $CSCRIPT apply $i $COPYRIGHT > $tmpFileName
    mv $tmpFileName $i
done

