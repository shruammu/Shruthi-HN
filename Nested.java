class Nested{

public static void main (String args[]){

int n=5;
for(int i=0;i<n;i++){

 for(int j=0;j<n;j++){
     System.out.print(j+" ");
}
System.out.println();
}
}
}
// i=0;i<n;true inside the i loop
  //j=0 0<5;true ... print 0 (space)
//increment j by 1 so j=1;
//j=1;1<5;true...print 1(space) in same row
//increment j=2;2<5true...print 2(space)in same row
//incrementby 1 so j=3;3<5true...print 3(space)in same row
//incrementby 1 so j=4;4<5true...print 4(space)in same row
//incrementby 1 so j=5;5<5 false...moving to the i loop increment

// now i =1;1<5;true inside the i loop
//cursor in next line

//j=0 0<5;true ... print 0 (space)
//increment j by 1 so j=1;
//j=1;1<5;true...print 1(space) in same row
//increment j=2;2<5true...print 2(space)in same row
//incrementby 1 so j=3;3<5true...print 3(space)in same row
//incrementby 1 so j=4;4<5true...print 4(space)in same row
//incrementby 1 so j=5;5<5 false...moving to the i loop increment
// now i =2;2<5;true inside the i loop
//cursor  in next line


//j=0 0<5;true ... print 0 (space)
//increment j by 1 so j=1;
//j=1;1<5;true...print 1(space) in same row
//increment j=2;2<5true...print 2(space)in same row
//incrementby 1 so j=3;3<5true...print 3(space)in same row
//incrementby 1 so j=4;4<5true...print 4(space)in same row
//incrementby 1 so j=5;5<5 false...moving to the i loop increment
// now i =3;3<5;true inside the i loop
//cursor in next line


//j=0 0<5;true ... print 0 (space)
//increment j by 1 so j=1;
//j=1;1<5;true...print 1(space) in same row
//increment j=2;2<5true...print 2(space)in same row
//incrementby 1 so j=3;3<5true...print 3(space)in same row
//incrementby 1 so j=4;4<5true...print 4(space)in same row
//incrementby 1 so j=5;5<5 false...moving to the i loop increment
// now i =4;4<5;true inside the i loop
//cursor in next line

//j=0 0<5;true ... print 0 (space)
//increment j by 1 so j=1;
//j=1;1<5;true...print 1(space) in same row
//increment j=2;2<5true...print 2(space)in same row
//incrementby 1 so j=3;3<5true...print 3(space)in same row
//incrementby 1 so j=4;4<5true...print 4(space)in same row
//incrementby 1 so j=5;5<5 false...moving to the i loop increment
// now i =5;5<5; false come out of the loop
//cursor in next line


