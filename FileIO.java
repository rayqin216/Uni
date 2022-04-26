import java.util.*;
import java.io.*;
import java.lang.*;

public class FileIO
{
    private String filename;

    public FileIO()
    {
        filename = "unknown";
    }

    public FileIO(String filename)
    {
        this.filename = filename;
    }

    public String getFileName()
    {
        return filename; 
    }

    public String readFile()
    {
        
        String content = "";
        if(filename.trim().length() > 0)
        {
            try
            {
                
                FileReader a = new FileReader(filename);
                Scanner input = new Scanner(a);
                while(input.hasNextLine())
                {
                    content += input.nextLine() + "\n";
                }
                a.close();
            }
            catch(Exception e)
            {
                System.out.println("unable to read file");
            }
        }
        else
        {
            System.out.println("enter correct file name");
        }
        return content;
    }

    public void setFileName(String filename)
    {
        this.filename = filename;
    }

    public void writeFile(String content)
    {
        try
        {
            if(filename.trim().length() > 0)
            {
                PrintWriter obj1 = new PrintWriter(filename);
                obj1.println(content);
                obj1.close();
            }
            else
            {
                System.out.println("unable to write file");
            }
        }
        catch(Exception e)
        {
            System.out.println("unable to write file");
        }    
    }



}
