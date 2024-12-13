import java.util.*;
public class Tic_Tac_Toe
{
    public static boolean check(char arr[][],int idx1,int idx2,char ch,int board)
    {
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[idx1][i]==ch)
                c++;
            else
                break;
            if(c==arr.length)
                return true;
        }
         c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][idx2]==ch)
                c++;
            else
                break;
            if(c==arr.length)
                return true;
        }
         c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][i]==ch)
                c++;
            else
                break;
            if(c==arr.length)
                return true;
        }        
         c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][(board-1)-i]==ch)
                c++;
            else
                break;
            if(c==arr.length)
                return true;
        }
     return false;   
    }
public static void display(char arr[][])
{
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr[i].length;j++)
    {
        System.out.print(arr[i][j]+" ");
    }
        System.out.println();
}
}

    public static void main(String args[])
    {
Scanner input=new Scanner(System.in);
// System.out.println(" Enter the row ");
// int idx1=input.nextInt();
boolean b4=true;
while(b4)
   { 
System.out.println(" Enter the board length ");
int board=input.nextInt();
if(board>2)
   { 
input.nextLine();
System.out.println(" Enter the player-1 Name ");
String player_1=input.nextLine();
System.out.println(" Enter the player-2 Name ");
String player_2=input.nextLine();
char[][] arr=new char[board][board];
for(char[] i:arr)
{
    Arrays.fill(i,'*');
}
//arr.fill('.');
int count=0;
int i;
for( i=0;i<board*board;i++)
{
    display(arr);
 
    boolean b1=true;
    while(b1)
 {       
System.out.println(" Enter the row value 0-"+(board-1));
int idx1=input.nextInt();
 if(idx1>=0 && idx1<board)
 { 
    boolean b2=true;
    while(b2 && (idx1>=0 && idx1<board))
 {       
System.out.println(" Enter the column value 0-"+(board-1));
int idx2=input.nextInt();
if(idx2>=0 && idx2<board) 
{
if(arr[idx1][idx2]=='*')   //  \u0000
{

/*    boolean b3=true;
    while(b3)
 {       
System.out.println(" Enter the Character X || O  ");
char ch=input.next().charAt(0);
 if(ch=='x' || ch=='o') 
     {
*/
    char ch;
        if(i%2==0)      
        {    
            arr[idx1][idx2]='X';
            ch='X';
        }
        else
        {    
            arr[idx1][idx2]='O';
            ch='O';
        }
        if(i>=((board-1)+(board-1)))
        {
            if(check(arr,idx1,idx2,ch,board))
            {
                String ans=(i%2==0)? "player-1 "+player_1:"player-2 "+player_2;
                System.out.println(ans+" win");
            i=board*board;
            }
        }

            b4=false;
            b2=false;
            b1=false;

/*            
     }
     else
        System.out.println(" Enter correct Character X | O ");
System.out.println();
}// while-3
*/

}
else
{
    System.out.println(" This is already fixed the value give another indexes ");
    b2=false;
System.out.println();
}
}
else
    System.out.println(" Enter correct index value 0- "+(board-1));
System.out.println();
   }  //while -2   
}
else
    System.out.println(" Enter correct index value 0- "+(board-1));
System.out.println();
   }  //while -1   

} // for loop

if(i==board*board)
    System.out.println(" Match is draw ");

    }
    else
        System.out.println(" Enter board value 2 above give ");
}   // b4 loop

}
}