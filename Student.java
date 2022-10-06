class Student {

 String name;
 String branch;
 String collegeName;
 int rollNo;
 String DofB;

void Study(){
  
System.out.println("The student name is"+" "+name+" "+branch+" "+"branch"+" "+rollNo+" "+"rollNo,"+DofB+" "+"DofB,"+" "+"studying in"+" "+collegeName);

}

public static void main(String args[]){

Student shruthi= new Student();
shruthi.name="Shruthi";
shruthi.branch="CSE";
shruthi.rollNo=77;
shruthi.DofB="2001/02/27";
shruthi.collegeName="CIT GUBBI";

shruthi.Study();

Student ammu= new Student();
ammu.name="Ammu";
ammu.branch="CSE";
ammu.rollNo=88;
ammu.DofB="27/05/2001";
ammu.collegeName="CIT GUBBI";

ammu.Study();

Student  shashi =new Student();
shashi.name="Shashi";
shashi.branch="CSE";
shashi.rollNo=99;
shashi.DofB="25/05/2001";
shashi.collegeName="CIT GUBBI";

shashi.Study();

}
}
 
