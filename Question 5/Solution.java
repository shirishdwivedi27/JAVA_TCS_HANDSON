import java.util.*;

public class Solution{
public static void main(String[] args)
{
   Scanner sc=new Scanner(System.in);


   Newspaper[] np=new Newspaper[4];
   for(int i=0;i<np.length;i++)
   {
       int r=sc.nextInt();sc.nextLine();
       String n=sc.nextLine();
       int pYear=sc.nextInt();
       int p=sc.nextInt();

       np[i]=new Newspaper(r,n,pYear,p);
  }

  int pbyear=sc.nextInt();sc.nextLine();
 int totalprice=findTotalPriceByPublicationYear(np,pbyear);
 if(totalprice!=0)
 {
     System.out.println(totalprice);
  }
  else
  {
     System.out.println("No Newspaper found");
   }
   

String temp=sc.nextLine();


   Newspaper obj=searchNewspaperByName(np,temp);
   if(obj!=null)
        {
            System.out.println("regNo-"+obj.getreg_no());
            System.out.println("name-"+obj.getname());
            System.out.println("Publication Year"+obj.getpublicationYear());
            System.out.println("Price"+obj.getprice()); 
        }
        else{
            System.out.println("No Newspaper found with the given name");
        }
   

}

public static int findTotalPriceByPublicationYear(Newspaper[] np,int pbyear)
{
    int sum=0;
   for(int i=0;i<np.length;i++)
   {
       if(np[i].getpublicationYear()==pbyear)
       {
         sum=sum+np[i].getprice();
       }
   }

   if(sum>0)
   {
      return sum;
   }
   return 0;
}

public static Newspaper searchNewspaperByName(Newspaper[] np,String temp)
{
   for(int i=0;i<4;i++)
   {
       if(np[i].getname().equalsIgnoreCase(temp))
       {
           return np[i];
       }
   }
   return null;
   
}





}






class Newspaper{


   int reg_no;
   String name;
   int publicationYear;
   int price;
   
   public Newspaper(int reg_no, String name, int publicationYear, int price) 
   { 
       this.reg_no=reg_no;
       this.name=name;
       this.publicationYear=publicationYear;
       this.price=price;
   }
   

   public int getreg_no()
   {
      return reg_no;
   }
   

   public void setreg_no(int reg_no)
   {
       this.reg_no=reg_no;
   }
   
   public String getname()
   {
       return name;
   }

   public void setname(String name)
   {
       this.name=name;
    }
   
   public int getpublicationYear()
   {
       return publicationYear;
   }
   
   public void setpublicationYear(int publicationYear)
   {
       this.publicationYear=publicationYear;
    }

   
   public int getprice()
   {
     return price;
   }
   
   public void setprice(int price)
   {
       this.price=price;
   }

}