class assinment{
 public static void main(String args[]){
 int a=10;
int b=a++;
int c=(--b)+(--a);
c++;
++a;
b--;
System.out.println("a : "+(a--));
System.out.println("b+c : "+(b+c));
System.out.println("b : "+(--b));
System.out.println("b+c : "+(b+c));
}
}
