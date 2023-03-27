/**
 * @author (your name) 
 * @version (date)
 */

import java.util.Scanner;
import java.io.*;

public class Report
{
    private ScatterPlot graph;
    private Person person1;
    private Person person2;

    public Report(Person p1, Person p2)
    {
        // initialize instance variables
        person1 = p1; 
        person2 = p2;
        // create the graph
        graph = new ScatterPlot (p1.getMoviePreferences().getAnswers(), p2.getMoviePreferences().getAnswers());
    }

    /**
     * Creates the report and saves it to 'filename'. 
     */
    public void createReport(String fileName)
    {
        // TO-DO: Write the report.  Save in a file named 'filename'.
        // 
        // Use the writeToFile method!  
        // See the LAB DESCRIPTION for the layout/requirements of the report
        
        // HINT: Here is how to call "writeToFile" so the scatterplot displays correctly
        String 
        s =  "-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-";
        s+="\n-+-                  Movie Compatibility                  -+-";
        s+="\n-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-";
        s+="\n";
        s+="\n Dear Harry,";
        s+="\n";
        s+="\n * According to the game results, our movie compatibility is";
        s+="\nstrong and positive.";
        s+="\n";
        s+="\nThe correlation coefficient (r) between our tastes in movies is";
        s+="\n"+graph.getCorrelationCoefficient();
        s+="\n";
        s+="\nThe strength of the association in movie compatibility is";
        s+="\ndetermined by the absolute value of the correlation coefficient.";
        s+="\nFor a strong association:            0.8 < |r| < 1.0";
        s+="\nFor a moderately strong association: 0.5 < |r| < 0.8";
        s+="\nFor a weak association:             0.0 < |r| < 0.5";
        s+="\n";
        s+="\n* Here is a scatter plot of our results: ";
        s+="\n";
        for (int r=graph.getScatterPlot().length-1; r>=0; r--)
        {
            for (int c = 0; c<graph.getScatterPlot()[r].length; c++)
            {
                s += graph.getScatterPlot()[r][c];
            }
            s += "\n";
            
        }
        s+="\nThank you for playing the game. See you at the movies!";
        s+="\nSincerely,";
        s+="\nLiam Payne";
        writeToFile(fileName, s, true);
    }
    /**
     * writeToFile method
     * 
     * Write the string 's' and saves it to 'filename'. 
     * If append is 'true', it will append to the file 'fileName'.
     * If append is 'false', it will write over the file 'fileName'.
     */
    private void writeToFile(String fileName, String s, boolean append)
    {
        // TO-DO
        //
        // Don't forget to close the stream after you are done!
        try {
            FileWriter fw = new FileWriter(fileName, append);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw, true);    

            out.println(s);

            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
