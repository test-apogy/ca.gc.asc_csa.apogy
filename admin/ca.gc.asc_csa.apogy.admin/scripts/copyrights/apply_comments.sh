#!/bin/bash

CSCRIPT=$(dirname $0)/copyright-adder.py
COPYRIGHT=$(dirname $0)/../../org.eclipse.symphony.admin/legal/copyrights.txt

echo "CSCRIPT: $CSCRIPT"

# First strip the comments
for i in $(find . -name \*.java -o -name \*.xml -o -name \*.xcore ! -type d)
do
    tmpFileName=$(tempfile)
    $CSCRIPT strip $i > $tmpFileName
    if [ $? -eq 0 ]
    then
        mv $tmpFileName $i

        $CSCRIPT apply $i $COPYRIGHT > $tmpFileName
        if [ $? -eq 0 ]
        then
            mv $tmpFileName $i
        fi
    fi
done

