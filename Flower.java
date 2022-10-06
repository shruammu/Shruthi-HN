class Flower{

String name;
String colour;
int noOfPetals;

void noOfPetals(){
System.out.println(colour+" "+name+" "+"contains"+" "+noOfPetals+" " +"number of petals......");
}
 
void sheddingfragrance(){
 
 System.out.println(colour+" "+name+" is Shedding fragrance....");

}
 
void blooming(){

System.out.println(colour+"  "+name+" is blooming....");

}

public static void main(String args[]){
 
 Flower rose =new Flower();
 rose.name="Rose";
 rose.colour="Red";
 rose.noOfPetals=8;

 rose.noOfPetals();
 rose.blooming();
 rose.sheddingfragrance();

 Flower jasmine=new Flower();
 jasmine.name="Jasmine";
 jasmine.colour="White";
 jasmine.noOfPetals=7;

 jasmine.noOfPetals();
 jasmine.blooming();
 jasmine.sheddingfragrance();
 

 Flower hibiscus=new Flower();
 hibiscus.name="Hibiscus";
 hibiscus.colour="Yellow";
 hibiscus.noOfPetals=5;

 hibiscus.noOfPetals();
 hibiscus.blooming();
 hibiscus.sheddingfragrance();
}
 }
