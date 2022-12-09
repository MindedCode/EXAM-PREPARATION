#include<stdlib.h>
#include<stdio.h>
 int f()
 {
     int x=0;
    //  static int y= 0;
     x++;
    //  y++;
     printf("%d--\n",x);
     
     
     
 }
 
 int main()
 {
     f();
     f();
     return 0;
 }
output :


1--1
  1--2
