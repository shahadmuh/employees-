public class ProjectManager extends Employee{
private int numOfprojects;

public ProjectManager(String n,String s,int i){
super(n,s);
numOfprojects=i;}

public double earnings(){
return numOfprojects*10000;}

public void reduceProject(){
if (numOfprojects<0)
numOfprojects--;}

public String toString(){
return "Name: "+Name+"\tSSN: "+SSN+"ltNumber of project: "+numOfprojects;}}