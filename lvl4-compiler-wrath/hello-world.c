#include <stdio.h>

#define SIZE_DEF 4
static const __uint8_t SIZE_CONST = 4;

typedef struct arraydef {
    __uint8_t bytearray[SIZE_DEF];
}arraydef_t;

typedef struct arrayconst {
    __uint8_t bytearray[SIZE_CONST];
}arrayconst_t;

int main() {
   arrayconst_t t;
   arraydef_t deft;
   printf("Hello, World!\n");
   return 0;
}