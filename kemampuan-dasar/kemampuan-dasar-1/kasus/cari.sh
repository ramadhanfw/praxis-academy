if [ `find -name "*.txt" -type f` ]
  then
echo "ada file txt pada direktori"  `whereis` `find  -name "*.txt" -type f`

else

echo "tidak ada"
fi
