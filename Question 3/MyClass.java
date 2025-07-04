/*
import java.util.*;

public class IPA10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[4];
        for (int i = 0; i < emp.length; i++) 
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();sc.nextLine();
            boolean e = sc.nextBoolean();sc.nextLine();

            emp[i] = new Employee(a,b,c,d,e);
        }
        String br = sc.nextLine();
        int ans1 = CountOfEmployee(emp,br);
        if(ans1!=0)
        {
            System.out.println(ans1);
        }
        else{
            System.out.println("No such Employees");
        }
        Employee[] ans2 = EmployeeWithSecondHighestRating(emp);
        if(ans2!=null)
        {
            for (int i = 0; i < ans2.length; i++) {
                if(ans2[i].getRating()>ans2[i+1].getRating())
                {
                    System.out.println(ans2[i+1].getId());
                    System.out.println(ans2[i+1].getName());
                    break;
                }
            }
        }
        else
        {
            System.out.println("All Employees using company transport");
        }
    }
    public static int CountOfEmployee(Employee[]e, String b)
    {
        int count = 0;
        for (int i = 0; i < e.length; i++) {
            if(e[i].getBranch().equalsIgnoreCase(b) && e[i].getTransport()==true)
            {
                count++;
            }
        }
        if(count>0)
        {
            return count;
        }
        else{
            return 0;
        }
    }
    public static Employee[] EmployeeWithSecondHighestRating(Employee[] e)
    {
        Employee[] sec = new Employee[0];
        Employee del;
        for (int i = 0; i < e.length; i++) {
            if(e[i].getTransport()==false)
            {
                sec = Arrays.copyOf(sec, sec.length+1);
                sec[sec.length-1] = e[i];
            }
        }
        for (int i = 0; i < sec.length; i++) {
            for (int j = i; j < sec.length; j++) {
                if(sec[i].getRating()<sec[j].getRating())
                {
                    del = sec[i];
                    sec[i]=sec[j];
                    sec[j]=del;
                }   
            }
        }
        if(sec.length>0)
        {
            return sec;
        }
        else
        {
            return null;
        }
    }
}
class Employee
{
    private int Id;
    private String name;
    private String branch;
    private double rating;
    private boolean transport;

    public Employee(int Id, String name, String branch, double rating, boolean transport)
    {
        this.Id = Id;
        this.name = name;
        this.branch = branch;
        this.rating = rating;
        this.transport = transport;
    }

    public int getId()
    {
        return Id;
    }
    public void setId(int Id)
    {
        this.Id = Id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getBranch()
    {
        return branch;
    }
    public void setBranch(String branch)
    {
        this.branch = branch;
    }
    public double getRating()
    {
        return rating;
    }
    public void setRating(double rating)
    {
        this.rating = rating;
    }
    public boolean getTransport()
    {
        return transport;
    }
    public void setTransport(boolean transport)
    {
        this.transport= transport;
    }
}



*/
import java.util.*;

public class MyClass{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         Employee[] emp=new Employee[4];
         for(int i=0;i<4;i++)
         {
             int eid=sc.nextInt();sc.nextLine();
             String n=sc.nextLine();
             String b=sc.nextLine();
             double r=sc.nextDouble();sc.nextLine();
             boolean c_t=sc.nextBoolean();sc.nextLine();
             emp[i]=new Employee(eid,n,b,r,c_t);
         }

       String temp=sc.nextLine();

  int ans1=findCountOfEmployeesUsingCompTransport(emp,temp);
 if(ans1!=0)
 {
    System.out.println(ans1);
 }
 else
 {
    System.out.println("NO branch");
 }


Employee[] ans2=findEmployeeWithSecondHighestRating(emp);
if(ans2!=null)
        {
       for (int i = 0; i < ans2.length; i++) {
          if(ans2[i].getrating()>ans2[i+1].getrating())
          {
             System.out.println(ans2[i+1].getEmployeeId());
             System.out.println(ans2[i+1].getname());
             break;
             }
         }
        }
        else
        {
            System.out.println("All Employees using company transport");
        }

    }
    

public static  int findCountOfEmployeesUsingCompTransport(Employee[] emp,String temp)
{
   int c=0;
   for(int i=0;i<emp.length;i++)
    {
       if(emp[i].getbranch().equalsIgnoreCase(temp)   &&  emp[i].getcomp_t()==true)
      {
         c+=1;
      }  
    }
   return c;

}


public static Employee[] findEmployeeWithSecondHighestRating(Employee[] temp)
{
  Employee[] temp2=new Employee[0];
  for(int i=0;i<temp.length;i++)
  {
    if(temp[i].getcomp_t()==false)
    {
       temp2=Arrays.copyOf(temp2,temp2.length+1);
       temp2[temp2.length-1]=temp[i];
    }
  }
   Employee del;
    for(int i=0;i<temp2.length;i++){
     for(int j=1;j<temp2.length;j++){
             if(temp2[i].getrating()<temp2[j].getrating())
             {
             del = temp2[i];
             temp2[i]=temp2[j];
             temp2[j]=del;
             }
         }
    }

   if(temp2.length>0)
        {
            return temp2;
        }
        else
        {
            return null;
        }

}

}



class Employee{


   private int employeeid;
   private String name;
  private String branch;
  private double rating;
private boolean company_Transport;

  public Employee(int employeeid,String name,String branch,double rating,boolean company_Transport)
  {
    this.employeeid=employeeid;
    this.name=name;
    this.branch=branch;
    this.rating=rating;
    this.company_Transport=company_Transport;
   }


   public int getEmployeeId()
   {
       return employeeid;
   }
  
   public String getname()
   {
      return name;
   }
   
   public String getbranch()
   {
      return branch;
   }

   public double getrating()
   {
     return rating;
   }

   public boolean getcomp_t()
   {
     return company_Transport;
   }





}
