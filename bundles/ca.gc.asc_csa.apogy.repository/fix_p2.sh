#!/bin/bash
# -----------------------------------------------------------------------
# @description 
#    This script is used to fix P2 update sites built by tycho.
#    https://bugs.eclipse.org/bugs/show_bug.cgi?id=453708
# @author 
#    pallard, rlarcheveque
# @history
#    2016-09-14: First version
# -----------------------------------------------------------------------

# Check if the command line is consistent.
if [ $# != 1 ]; then
  echo "Usage: fix_p2.sh <target_repo_dir>"
  echo "  -target_repo_dir: Repository directory (e.g. .../bundles/ca.gc.asc_csa.apogy.repository/target)"
  exit 1
fi

# Get the arguments.
repo_dir=$1
APOGY_REPO=ca.gc.asc_csa.apogy.repository
DIR=$PWD

echo "Checking P2 repository consistency started..."
if [ ! -e $repo_dir ] || [ ! -d $repo_dir ]; then
  echo "The directory $repo_dir does not exist."
  exit 1
fi

if [ ! -e $repo_dir/repository ] || [ ! -d $repo_dir/repository ]; then
  echo "The directory $repo_dir/repository does not exist."
  exit 1
fi


if [ ! -e $repo_dir/${APOGY_REPO}-0.5.0-SNAPSHOT.zip ]; then
  echo "The file $repo_dir/${APOGY_REPO}-0.5.0-SNAPSHOT.zip does not exist."
  exit 1
fi

if [ ! -e $repo_dir/repository/content.jar ]; then
  echo "The file $repo_dir/repository/content.jar does not exist."
  exit 1
fi

if [ ! -e $repo_dir/repository/artifacts.jar ]; then
  echo "The file $repo_dir/repository/artifacts.jar does not exist."
  exit 1
fi
echo "Checking P2 repository consistency done..."

# Added repos(content.xml). No new lines permitted here !
UPDATED_CONTENT_XML='\n <references><repository uri="http://download.eclipse.org/releases/mars" type="0" options="1" /> \n <repository uri="http://download.eclipse.org/sirius/updates/releases/3.1.1/mars" type="0" options="1"/> \n <repository uri="http://download.eclipse.org/tools/orbit/downloads/drops/R20151221205849/repository" type="0" options="1" /> \n <repository uri="http://download.eclipse.org/eclipse/updates/4.5" type="0" options="1" /></references>'

# Added repos(artifacts.xml). No new lines permitted here !
UPDATED_ARTIFACTS_XML='\n <references><repository uri="http://download.eclipse.org/releases/mars" type="1" options="1" /> \n <repository uri="http://download.eclipse.org/sirius/updates/releases/3.1.1/mars" type="1" options="1"/> \n <repository uri="http://download.eclipse.org/tools/orbit/downloads/drops/R20151221205849/repository" type="1" options="1" /> \n <repository uri="http://download.eclipse.org/eclipse/updates/4.5" type="1" options="1" /></references>'

# Unzip JAR files.
unzip $repo_dir/repository/content.jar -d $repo_dir/repository
unzip $repo_dir/repository/artifacts.jar -d $repo_dir/repository
rm -f $repo_dir/repository/content.jar
rm -f $repo_dir/repository/artifacts.jar

#
# Fix content.xml
#
echo "Fixing content.xml started..."
# First finds and marks the place where repos will be added.
sed -i -e 's/\(.*<repository name=\)\(.*>\)\(.*\)/\1\2REPLACEMENT\3 /g' $repo_dir/repository/content.xml
pattern='REPLACEMENT'

# Second, insert the added repos at the mark
sed -i -e "s@${pattern}@${UPDATED_CONTENT_XML}@g" $repo_dir/repository/content.xml
echo "Fixing content.xml completed..."

#
# Fix artifacts.xml
#
echo "Fixing artifacts.xml started..."

# First finds and marks the place where repos will be added.
sed -i -e 's/\(.*<repository name=\)\(.*>\)\(.*\)/\1\2REPLACEMENT\3 /g' $repo_dir/repository/artifacts.xml
pattern='REPLACEMENT'

# Second, insert the added repos at the mark
sed -i -e "s@${pattern}@${UPDATED_ARTIFACTS_XML}@g" $repo_dir/repository/artifacts.xml
echo "Fixing artifacts.xml completed..."

#
# Create new JARS
#
cd $repo_dir/repository
echo "Update $repo_dir/repository/content.jar and $repo_dir/repository/artifacts.jar started..."
zip -r content.jar content.xml
zip -r artifacts.jar artifacts.xml
echo "Update $repo_dir/repository/content.jar and $repo_dir/repository/artifacts.jar completed..."
cd $DIR

#
# Fix ca.gc.asc_csa.apogy.repository-0.5.0-SNAPSHOT.zip
#
echo "Update ${APOGY_REPO}-0.5.0-SNAPSHOT.zip started"
unzip ${APOGY_REPO}-0.5.0-SNAPSHOT.zip -d ${APOGY_REPO}
cp -f $repo_dir/repository/content.jar ${APOGY_REPO}/.
cp -f $repo_dir/repository/artifacts.jar ${APOGY_REPO}/.
rm -f ${APOGY_REPO}-0.5.0-SNAPSHOT.zip
zip ${APOGY_REPO}-0.5.0-SNAPSHOT.zip ${APOGY_REPO}
echo "Update ${APOGY_REPO}-0.5.0-SNAPSHOT.zip completed"

# Delete .xml
rm $repo_dir/repository/content.xml $repo_dir/repository/artifacts.xml

echo "P2 fixes applied..."
