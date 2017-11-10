public class Test{
public static void main (String[] args){

Employee[] employees=new Employee[3];

ProjectManager s=new ProjectManager("Shahad","west",2);
ProjectManager q=new ProjectManager("Hessa","north",10);
ProjectManager a=new ProjectManager("nora","south",43);

employees[0]=s;
employees[1]=q;
employees[2]=a;

for (int i=0;i<employees.length;i++)
System.out.println(employees[i]);

for (int i=0;i<employees.length;i++)
((ProjectManager) employees[i]).reduceProject();

for (int i=0;i<employees.length;i++)
System.out.println(employees[i].toString());
}}

