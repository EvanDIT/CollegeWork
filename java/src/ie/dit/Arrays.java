package ie.dit;

import  processing.core.PApplet;

public class Arrays extends PApplet
{
    float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
    String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Nov","Oct","Dec"};
    
   
    float[] fa = new float[2]; //assigning the array and doing the values later.
    
    public void settings()
    {
        size (500,500);
    }

    public void setup()
    {
       // fa[0] = 10;
        //fa[1] = 4;

       // System.out.println(fa[0]);
       // System.out.println(fa[2]); //run time error if we are beyonds the bounds of the array. will still compile.

        for (int i = 0; i < rainFall.length; i++)
        {
            System.out.println(months[i] + "\t" + rainFall[i]);
        }

        //for (float f:rainFall)
        //{
           // System.out.println(f);
        //}

        //for loop to add all the values together.
        float total = 0;
        for(int i = 0; i < rainFall.length; i ++)
        {
            total += rainFall[i];
        }
        System.out.println("Total RainFall = " + total + " Centimetres");
        //end of for loop to all all values together. 

        float average =  total / (float) rainFall.length;
        System.out.println("Average Rainfall is " + average + " Centimetres");

        //Max and Min vals
        float max = rainFall[0];
        int maxIndex = -1;
        for (int i = 1 ; i < rainFall.length; i++)
        {
            if (rainFall [i] > max)
            {
                max = rainFall[i];
                maxIndex = i;
            }
        }
        System.out.println(months[maxIndex] + " Had the greatest rainfall");
        //End of max rainfall
        
        colorMode(HSB);
        textAlign(LEFT,CENTER);
        
        float h = height / (float) rainFall.length;
        for (int i= 0; i < rainFall.length; i++)
        {
            fill(random(0, 255), 255);
            rect(0, i * h, rainFall[i] * 2, h);
            stroke(0);
            fill(0);
            float textY = i * h + (h * 0.5f);
            text (months[i],5,textY);}

        }
        
	public void draw()
	{
        
    }
}
