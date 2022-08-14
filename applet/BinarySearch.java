import java.applet.*;
import java.awt.*;
public class BinarySearch extends Applet{
int[] arr=new int[]{50,100,150,200,250,300,350,450,500,550,600,650,700,750,780,810,850,880,900};
int x=0,y=0,mid,left=0,right=(arr.length)-1,key=780;
  


public void paint(Graphics g){
int x=0,y=0;
for(int i=0;i<arr.length;i++){
  g.setColor(Color.yellow);
  g.drawRect(x,y,20,arr[i]);
  g.fillRect(x,y,20,arr[i]);
  x=x+40;
  }

mid=(left+right)/2;
for(int i=0;i<(arr.length)/2;i++)
{
x=-40;
for(int k=0;k<=mid;k++)
x=x+40;
g.setColor(Color.red);
g.drawRect(x,y,20,arr[mid]);
g.fillRect(x,y,20,arr[mid]);
try{Thread.sleep(1000);}catch(Exception e){System.exit(0);}
 g.setColor(Color.yellow);
 g.drawRect(x,y,20,arr[mid]);
 g.fillRect(x,y,20,arr[mid]);

if(key==arr[mid])
break;
else if(key<arr[mid])
{
right=mid;
mid=(left+right)/2;
}
else
{
left=mid;
mid=(left+right)/2;
}
}
x=0;
for(int k=0;k<mid;k++)
x=x+40;
g.setColor(Color.blue);
g.drawRect(x,y,20,arr[mid]);
g.fillRect(x,y,20,arr[mid]);

}
}





