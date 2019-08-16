echo "Enter directory name"
read ndir
if [ -d "$ndir" ]
then
echo "Dirextory exist"
else
`mkdir $ndir`
echo "Directory created"
fi
