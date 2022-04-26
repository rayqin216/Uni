import java.util.*;
import java.io.*;

public class University
{
    private ArrayList<Enrolment> enrolment;
    public  final String inputfile = "student.txt";
    public  final String outputfile = "output.txt";

    public University()
    {
        enrolment = new ArrayList<Enrolment>();
    }

    public University(ArrayList<Enrolment> enrolment)
    {
        this.enrolment = enrolment;
    }

    public void display()
    {
        for(int x = 0; x < enrolment.size(); x++)
        {
            System.out.println(enrolment.get(x));
        }
    }
    public void addEnrolment(Enrolment enrolment)
    {
        ArrayList<Enrolment> enrol = new ArrayList<Enrolment>();
         enrol.add(enrolment);
    }

    public ArrayList<Enrolment> getEnrolment()
    {
        return enrolment;
    }

    public int getEnrolmentSize()
    {
        return enrolment.size();
    }

    public Enrolment getSpecificEnrollment(int index)
    {
        if( index <= enrolment.size())
            return enrolment.get(index);
        else
            return null; 
    }

    public void inputStudentDetail(Enrolment enrolment)
    {
        Input input = new Input();
        Validation valid = new Validation();
        boolean process = false;

        String name = "";
        do{
            name = input.acceptStringInput("enter name");
            if(valid.isBlank(name))
                System.out.println("can't be blank");
            else 
                process = true; 
        }while(process == false);
        process = false;
      
        
        String address = "";
        do{ 
            address = input.acceptStringInput("enter address");
            if(valid.isBlank("address"))
                System.out.println("can't be blank");
            else
                process = true;

        }while(process == false);
        process = false;
      
       
       String email = "";
       do{ 
            email = input.acceptStringInput("enter email");
            if(valid.isBlank("email"))
                System.out.println("can't be blank");
            else
                process = true;
       }while(process == false);
       process = false;

      

        String phoneNo = "";
        do{
            phoneNo = input.acceptStringInput("enter phoneNo");
            if(valid.isBlank(phoneNo))
                System.out.println("can't be blank");
            else
                process = true; 
        }while(process == false);
        process = false;
        
        
        enrolment.creatStudent(name, address, email, phoneNo);
    }

    public void inputUnitDetailsOnce(int index, Enrolment enrolment)
    {
        Input input = new Input();
        Validation valid = new Validation();
        Scanner console = new Scanner(System.in);
        boolean process = false;
        String unitCode = "";
        do
        {
           unitCode = input.acceptStringInput("unitcode");
           if(valid.isWithinRange(unitCode, 7, 7))
           {
               process = true;
               
           }
           else
           {
               process = false;
               System.out.println("must be 7 charcters");
           }
        }while(process = false);
        String unitDescription = "";
        do
        {
            unitDescription = input.acceptStringInput("unitDescription");
            if(valid.isBlank(unitDescription))
            {
                process = false;
                System.out.println("can't be blank");
            }
            else
            {
                process = true;
            }
        }while(process);
        int creditPoints = 0;
        do
        {
            try
            {
               int creditpoints = input.acceptIntegerInput("creditpoints");
                if(creditPoints > 0)
                {
                    process = false;
                    System.out.println("must not be blank");
                }
                else
                {
                    process = true;
                } 
            }
            catch(Exception e)
            {
                System.out.println("must be numerical");
            }
            
        }while(process = false);
    }

    public void inputUnitDetails(Enrolment enrolment)
    {
        Input input = new Input();
        int nounit = input.acceptIntegerInput("number of unit to enrol ");
        enrolment.setUnitArraySize(nounit);
        Validation valid = new Validation();
        boolean process = false;
        for(int x = 0; x < nounit; x++)
        {
            String unitCode = "";
            do
            { 
                unitCode = input.acceptStringInput("unitcode?");
                if(valid.isWithinRange(unitCode, 7, 7) == true) //doesn't work;
                    process = true; 
                else
                {
                    System.out.println("unitcode must have 7 character");
                    process = false;  
                }  
            }while(process == false);
            process = false;       
    
            String unitDescription = "";
            do
            {
                unitDescription = input.acceptStringInput("unitDescription?");
                    if(valid.isWithinRange(unitDescription, 1, 25))
                        process = true;
                    else
                    {
                        System.out.println(" unitDescription must be have at least 1 character");
                        process = false;
                    }
            }while(process == false);
            process = false;        
       
            int creditPoints = 0;
            do
            {
                try
                {
                    creditPoints = input.acceptIntegerInput("creditPoints?");
                    if(creditPoints >= 0)
                        process = true;
                    else
                        process = false;
                
                }
                catch(Exception e)
                {
                    System.out.println("must be a numerical value");
                }
               
            }while(process == false);
            enrolment.createUnit(x, unitCode, unitDescription, creditPoints);
            
        }             
    }

    public static void main(String []args)
    {              
        University obj1 = new University();
        obj1.StartProgram();
       
    }

    public void removeEnrolment(int index)
    {
        if( index <= enrolment.size())
            enrolment.remove(index);
    }

    public void readFile()
    {
        FileIO io = new FileIO(inputfile);
        String[] input = io.readFile().split("\n");
        System.out.println("Syntax1");
        for(int i = 0; i < input.length;i++)
        {
            String[] userinput = input[i].split(",");
            Enrolment obj1 = new Enrolment();
            obj1.setDate(userinput[0]);
            obj1.creatStudent(userinput[1], userinput[2], userinput[3], userinput[4]);
            String[] unitinput = userinput[5].split(";");
            obj1.setUnitArraySize(unitinput.length);
            for(int x = 0; x < unitinput.length;x++)
            {
               String[] units = unitinput[x].split("-");
               try
               {
                   obj1.createUnit(x, units[0], units[1], Integer.parseInt(units[2]));
               }
               catch(Exception e)
               {
                   System.out.println("unable to create unit");
               }
            }
              
            
            this.enrolment.add(obj1);
            obj1.display(); //doesn't work;
        }



    }

   public void StartProgram()
   {
       
       readFile();
       
       Input input = new Input();
       int noostudent = input.acceptIntegerInput("number of student want to enrol");
       for( int x = 0; x < noostudent; x++)
       {
           Enrolment obj2 = new Enrolment();
           inputStudentDetail(obj2);
           inputUnitDetails(obj2);
           enrolment.add(obj2);
           
       }
       writeFile();
   }
   

    public void setEnrolment(ArrayList<Enrolment> enrolment)
    {
        this.enrolment = enrolment;
    }

    public void setSpecificEnrolment(int index, Enrolment nenrolment)
    {
        if( index <= enrolment.size())
        enrolment.set(index, nenrolment);
    }

    public void writeFile()
    {
        String temp = "";
        StringBuffer buffer = new StringBuffer();
        for(int x = 0; x < enrolment.size(); x++)
        {
            buffer.append(enrolment.get(x).display());
        }
        FileIO oi = new FileIO(outputfile);
        oi.writeFile(buffer.toString());   
    }


}
