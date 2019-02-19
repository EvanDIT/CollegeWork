package ie.dit;

<<<<<<< HEAD
import  processing.core.PApplet;
=======
import processing.core.PApplet;
>>>>>>> 47d8d86aa6f6036695344738d1d03079962dd992

public class Arrays extends PApplet
{
    float[] rainFall = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
<<<<<<< HEAD
    String[] months = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Nov","Oct","Dec"};
    
   
    float[] fa = new float[2]; //assigning the array and doing the values later.
    
    public void settings()
    {
        size (500,500);
=======
    String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul"
            , "Aug", "Sep", "Oct", "Nov", "Dec"};

    float[] fa = new float[2];        
    int[] colors = new int[rainFall.length];

    public void settings()
    {
        size(500, 500);
>>>>>>> 47d8d86aa6f6036695344738d1d03079962dd992
    }

    public void setup()
    {
<<<<<<< HEAD
       // fa[0] = 10;
        //fa[1] = 4;

       // System.out.println(fa[0]);
       // System.out.println(fa[2]); //run time error if we are beyonds the bounds of the array. will still compile.

        for (int i = 0; i < rainFall.length; i++)
=======
        // Putting values into array elements
        fa[0] = 10;
        fa[1] = 4;

        // Getting a value from an array element
        System.out.println(fa[0]);
        

        // Iterating over an array
        for(int i = 0 ; i < rainFall.length; i ++)
>>>>>>> 47d8d86aa6f6036695344738d1d03079962dd992
        {
            System.out.println(months[i] + "\t" + rainFall[i]);
        }

<<<<<<< HEAD
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
=======
        // Using the for each loop
        for(float f:rainFall)
        {
            System.out.println(f);
        }

        // Calculate the total
        float total = 0;
        for(float f:rainFall)
        {
            total += f;
        }
        System.out.println("Total: " + total);

        // The same, but with a for loop
        total = 0;
        for(int i = 0 ; i < rainFall.length ; i ++)
        {
            total += rainFall[i];
        }


        float average = total / (float) rainFall.length;
        System.out.println(average);

        // Find the max element
        float max = Float.MIN_VALUE;
        int maxIndex = -1;
        for(int i = 0 ; i < rainFall.length ; i ++)
        {
            if (rainFall[i] > max)
>>>>>>> 47d8d86aa6f6036695344738d1d03079962dd992
            {
                max = rainFall[i];
                maxIndex = i;
            }
        }
<<<<<<< HEAD
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
=======

        System.out.println(months[maxIndex] 
                + " had the highest rainfall of " 
                + rainFall[maxIndex]);

        // Find the min element                
        float min = Float.MAX_VALUE; // The biggest value a float can be
        int minIndex = -1;
        for(int i = 0 ; i < rainFall.length ; i ++)
        {
            if (rainFall[i] < min)
            {
                min = rainFall[i];
                minIndex = i;
            }
        }
        System.out.println(months[minIndex] 
                + " had the lowest rainfall of " 
                + rainFall[minIndex]);

        // Assign the color array
        for(int i = 0 ; i < rainFall.length ; i ++)        
        {
            colors[i] =(int) random(0, 255);
        }
    } 

    void drawBarChart()
    {
        colorMode(HSB);
        textAlign(LEFT, CENTER);
        
        float h = height / (float) rainFall.length;        
        for(int i = 0 ; i < rainFall.length ; i ++) 
        {
            noStroke();
            fill(colors[i], 255, 255);
            rect(0, map(i, 0, rainFall.length, 0, height), rainFall[i] * 2, h);
            fill(255);
            float textY = map(i, 0, rainFall.length, h * 0.5f, height + (h * 0.5f));//i * h + (h * 0.5f);
            text(months[i], 5, textY);
        }       
    }

    public void draw()
    {
        background(0);

        drawBarChart();

        float gap = height / (float) rainFall.length;
        int m = (int) Math.floor(mouseY / gap);
        fill(255);
        text(rainFall[m], 300, height / 2);
    }
}
>>>>>>> 47d8d86aa6f6036695344738d1d03079962dd992
