#include <stdio.h>

static const __uint8_t DIMENSION = 3;

typedef struct point {
    __uint8_t xyz[DIMENSION];
}point_t;

typedef struct line {
    point_t a;
    point_t b;
}line_t;

int main() {
   point_t a = {.xyz={0,0,0}};
   point_t b = {.xyz={1,1,1}};
   line_t l = {.a=a,.b=b};
   printf("Line l coordinates: \n");
   printf("A [ ");
   for (int i = 0;i<DIMENSION;i++){
       printf(" %d",l.a.xyz[i]);
   }
   printf("], B [");
      for (int i = 0;i<DIMENSION;i++){
       printf(" %d",l.b.xyz[i]);
   }
   printf("]");
   return 0;
}