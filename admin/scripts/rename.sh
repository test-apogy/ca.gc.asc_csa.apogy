#!/bin/bash

oldPrefix="org.eclipse.symphony"
newPrefix="ca.gc.asc_csa.apogy"


# Replacing text in files
printf "Replacing text ... "
for i in $(find . -type f -print | grep -v \\.git | grep -v jpg | grep -v admin)
do
    sed "s/$oldPrefix/$newPrefix/g" -i $i
    sed "s/Symphony__/Apogy/g" -i $i
    sed "s/SYMPHONY_/APOGY_/g" -i $i
    sed "s/symphony/apogy/g" -i $i
    sed "s/Symphony/Apogy/g" -i $i
done
echo "done"

# Renaming folders
printf "Renaming folders ... "
for i in $(find . -type d -name $oldPrefix\* | grep -v admin )
do
    newName=$(echo $i | sed s/$oldPrefix/$newPrefix/g)
    git mv $i $newName
done

echo "done"

# Renaming files
printf "Renaming files ... "
for i in $(find . -type f -name $oldPrefix\* ! -name \*.BAK | grep -v admin)
do
    dir=$(dirname $i)
    fileName=$(basename $i)
    
    newName=$dir/$(echo $fileName | sed s/$oldPrefix/$newPrefix/g)
    git mv $dir/$fileName $newName
    git add $newName
done

for i in $(find . -type f -name \*Symphony__\* ! -name \*.BAK | grep -v admin)
do
    dir=$(dirname $i)
    fileName=$(basename $i)

    newName=$dir/$(echo $fileName | sed s/Symphony__/Apogy/g)
    git mv $dir/$fileName $newName
    git add $newName
done
for i in $(find . -type f -name \*Symphony\* ! -name \*.BAK | grep -v admin)
do
    dir=$(dirname $i)
    fileName=$(basename $i)

    newName=$dir/$(echo $fileName | sed s/Symphony/Apogy/g)
    git mv $dir/$fileName $newName
    git add $newName
done
for i in $(find . -type f -name \*symphony\* ! -name \*.BAK | grep -v admin)
do
    dir=$(dirname $i)
    fileName=$(basename $i)

    newName=$dir/$(echo $fileName | sed s/symphony/apogy/g)
    git mv $dir/$fileName $newName
    git add $newName
done
echo "done"

oldPath=(${oldPrefix//./\/})
newPath=(${newPrefix//./\/})

# Renaming org/eclipse/symphony to ca/gc/asc_csa/apogy
printf "Renaming org/eclipse/symphony to ca/gc/asc_csa/apogy ... "
for i in $(find . -type d -name src -o -name src-generated | grep -v admin)
do
    mkdir -p $i/$newPath
    git mv $i/$oldPath/* $i/$newPath
    rmdir -p $i/$oldPath 2> /dev/null
done

echo "done"

printf "Fine tuning ... "

done=0

while [ "$done" -eq 0 ]
do
    done=1
    for i in $(find . -type d -name \*symphony\* | grep -v admin )
    do
        done=0
        newName=$(echo $i | sed s/symphony/apogy/)
        git mv $i $newName
    done
done
echo "done"
