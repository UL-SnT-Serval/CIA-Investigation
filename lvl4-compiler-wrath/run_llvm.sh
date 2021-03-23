#!bin/sh
sh clean.sh
export CC=/usr/bin/clang
cmake .
make
./hello