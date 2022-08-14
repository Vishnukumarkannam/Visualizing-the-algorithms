import java.awt.*;
import  java.applet.*;

public class InsertionsortApplet extends Applet
{
int[] arr=new int[]{90,40,100,76,43,99,66,87,23,88,98,58,4,6,56,67,86,75,98,9,45,987,45,546,546,34,345,620};
int i,j,temp,key,x=0,y=0;


public void paint(Graphics g)
{

for(i=0;i<arr.length;i++)
{
try{Thread.sleep(10);}catch(Exception e){System.exit(0);}
g.drawRect(x,y,arr[i],10);
g.fillRect(x,y,arr[i],10);
y=y+20;
}
for(int j=1;j<arr.length;j++)
{
x=0;y=0;
g.setColor(Color.black);
g.fillRect(0,0,2000,1024);

for(int k=0;k<arr.length;k++)
{
g.setColor(Color.white);
g.drawRect(x,y,arr[k],10);
g.fillRect(x,y,arr[k],10);
y=y+20;
}
key=arr[j];
i=j-1;
while(i>=0 && arr[i]>key)
{
arr[i+1]=arr[i];
i=i-1;
}
arr[i+1]=key;

try{Thread.sleep(1000);}catch(Exception e){}
}
for(int j=1;j<arr.length;j++)
{
x=0;y=0;
g.setColor(Color.black);
g.fillRect(0,0,2000,1024);

for(int k=0;k<arr.length;k++)
{
g.setColor(Color.white);
g.drawRect(x,y,arr[k],10);
g.fillRect(x,y,arr[k],10);
y=y+20;
}
}


}
}

