// Make an exact copy of local and remote adding following code

git fetch origin
git reset --hard origin/master
git clean -f -d
