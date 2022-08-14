import java.applet.*;
import java.awt.*;
public class LinearSearch extends Applet{
int[] arr=new int[]{234,978,456,763,987,345,975,657,883,443,323};
int x=0,y=0,s=0,r=0;
  


public void paint(Graphics g){
int x=0,y=0;

try{Thread.sleep(100);}catch(Exception e){System.exit(0);}

for(int i=0;i<arr.length;i++){
  g.setColor(Color.yellow);
  g.drawRect(x,y,20,arr[i]);
  g.fillRect(x,y,20,arr[i]);
  x=x+40;


}

x=0;y=0;

for(int j=0;j<arr.length;j++){

try{Thread.sleep(500);}catch(Exception e){System.exit(0);}
g.setColor(Color.red);
g.drawRect(x,y,20,arr[j]);

g.fillRect(x,y,20,arr[j]);
x=x+40;
s=0;r=0;
 
for(int k=0;k<j;k++)
{
 
g.setColor(Color.yellow);
g.drawRect(s,r,20,arr[k]);


g.fillRect(s,r,20,arr[k]);
s=s+40;

}

if(arr[j]==657){
break;
}
}
try{Thread.sleep(100);}catch(Exception e){System.exit(0);}

}
}
