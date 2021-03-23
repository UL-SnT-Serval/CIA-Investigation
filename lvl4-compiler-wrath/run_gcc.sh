#!bin/sh
sh clean.sh
export CC=/usr/bin/gcc
cmake .
make
./hello