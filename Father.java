class Father
{
    public static void main(String[] args)
    {
      int chestSize = 1;
      int legSize = 0;
      Father ftr = new Father();
ftr.info().hair().eyes().mouth().chest(chestSize).legs(legSize+1).build();
 Son son = new Son();
  son.info().hair().eyes().mouth().chest(chestSize/2).legs(legSize/2).build();
    }
  }
public class Father
{
String hair="",eyes ="",mouth="",chest= "",legs="";
public Father info(){System.out.print("Father");
return this;}
public Father hair(){
for(int i = 0; i<=6;++i){
hair+=i==0?"\n\n.":i==6?")":"=";} 
hair+="\n";
return this;}
public Father eyes(){
for(int i = 0; i<=6;++i)
{
eyes+= i==0||i==6?"|":i==1||i==4?"(":i==2||i==5")";
}

eyes+="\n";
return this;}
public Father mouth(){
for(int i = 0; i<=14;++i){
mouth+= i==0||i==6?"|":i==2||i==4?".":i==3?"_":i==7?"\n":i==8||i==14?"'":i>8&&i<14?"-":" ";} 
mouth+="\n";
return this;}
public Father chest(int ch){
for(int j=0; j<ch;++j){
for(int i = 0; i<=6;++i){
chest+= i==0||i==1||i==5||i==6?"|":" ";} 
chest+="\n";}
for(int i = 0; i<=6;++i){
chest+= i==0||i==1||i==5||i==6?"|":"_";} 
chest+="\n";
return this;}
public Father legs(int lg){
for(int j=0; j<lg;++j){
for(int i = 0; i<=6;++i){
legs+= i==1||i==3||i==5?"|":" ";} 
legs+="\n";}
for(int i = 0; i<=6;++i){
legs+= i==1||i==3||i==5?"|":i==2||i==4?"_":" ";} 
legs+="\n";
return this;
}
public void build(){
System.out.println(hair+eyes+mouth+chest+legs+"\n");   
}
}
public class Son extends Father{
public Son hair(){
for(int i = 0; i<=6;++i){
hair+=i==0?"\n\n.":i==6?")":"-";} 
hair+="\n";
    return this;
}
public Son info(){System.out.print("Son extends father");
return this;}
}
