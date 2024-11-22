class Employee1
{
int Salary;
String Name;
public int getsalary()
{
    return Salary;
}
public void setSalary(int S)
{
    Salary = S;
}
public String getName()
{
    return Name;
} 
public void setName(String n)
{
    Name = n;

}
}
public class cwh39 {
public static void main(String[] args)
{
Employee1 data = new Employee1();
data.setName("codeWithHarsh");
System.out.println(data.getName());
data.setSalary(2000000);
System.out.println(data.getsalary());

}    
}


class cellphone
{
    public void ringing()
    {
        System.out.println("Ringing....");
    }
    public void vibrating()
    {
        System.out.println("Vibrating...");
    }

    public static void main(String[] args)
    {
cellphone realme = new cellphone();
realme.ringing();
realme.vibrating();

    }
}