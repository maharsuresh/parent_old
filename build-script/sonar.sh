#!/bin/bash

# Clone sonar-analysis project to the root
#cd ../
if [ ! -f sonar-analysis ]; then
    echo "Cloning sonar-analysis repo from github."
    git clone https://github.com/maharsuresh/sonar-analysis.git
fi

echo "Running sonar analysis"
cd sonar-analysis
alias exit=return
sh sonar-analysis.sh "$@"

# Remove the cloned repo
rm -rf sonar-analysis
echo "End of Sonar analysis."

