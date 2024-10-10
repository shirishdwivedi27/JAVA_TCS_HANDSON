import java.util.*;

public class NewSolution{
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     Player[] pp=new Player[4];
     for(int i=0;i<4;i++)
     {
        int a=sc.nextInt();sc.nextLine();
        String b=sc.nextLine();
        String c=sc.nextLine();
        int d=sc.nextInt();sc.nextLine();
     pp[i]=new Player(a,b,c,d);
     }
  
    
String temp=sc.nextLine();
String s=sc.nextLine();
int sum=findPointsForGivenSkill(pp,temp);
if(sum!=0)
{
   System.out.println(sum);
}
else
{
  System.out.println("NONE");
}






      int ans=getPlayerBasedOnLevel(pp,temp,s);
      if(ans!=0)
      { System.out.println(ans);   }
      else
      { System.out.println("NO");    }
  }


         public static int findPointsForGivenSkill(Player[] pp,String temp)
          {
              int sum=0;
             for(int i=0;i<pp.length;i++)
              {
                  if(pp[i].getskill().equalsIgnoreCase(temp))
                  { sum=sum+pp[i].getpoints(); 
                  }
               }
            if(sum!=0)
              { return sum; }
            else
             { return 0;}
           }

         
  public static int getPlayerBasedOnLevel(Player[] pp,String temp1,String temp2)
  {
for(int i=0;i<pp.length;i++){
       if(pp[i].getskill().equalsIgnoreCase(temp1)  && pp[i].getlevel().equalsIgnoreCase(temp2)  && pp[i].getpoints()>=20)
        {
             return pp[i].getpid();
          }
       }
        return 0;    
   }



            
}

class Player{

 int playerId;
 String skill;
 String level;
 int points;
 
 public Player(int playerId,String skill,String level,int points)
 {
    this.playerId=playerId;
    this.skill=skill;
    this.level=level;
    this.points=points;
 }

  public int getpid()
  {
    return playerId;
  }
  
  public String  getskill()
  {
    return skill;
  }
  
   public String getlevel()
  {
    return level;
  }
   
  public int getpoints()
  {
    return points;
  }


 }