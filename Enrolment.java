import java.util.*;

public class Enrolment
{
    private String date;
    private Student student;
    private Unit unit[];

    public Enrolment()
    {
        date = "unknown";
        student = new Student();
        unit = new Unit[5];    
    }

    public Enrolment(String newdate, Student newstudent, Unit newunit[])
    {
        date = newdate;
        student = newstudent;
        unit = newunit;
    }

    public void creatStudent(String name, String address, String email, String phoneNo)
    {
        student = new Student(name, address, email, phoneNo);
    }

    public void createUnit(int index, String unitCode, String unitDescription, int creditPoints)
    {
        unit[index] = new Unit(unitCode, unitDescription, creditPoints);
    }

    public String display()
    {
        String value = "" + date + "\n" + student.toString();
        for(int x = 0; x < unit.length; x++)
        {
            if(unit != null)
                value += unit[x].toString(); 
        }
        return value;
           
    }

    public String getDate()
    {
        return date;
    }

    public Student getStudent()
    {
        return student;
    }

    public Unit getSpecificUnit(int index)
    {
        if(index < unit.length);
        return unit[index];
    }

    public Unit[] getUnit()
    {
        return unit;
    }

    public int getUnitSize()
    {
        return unit.length;
    }

    public void setDate(String nedate)
    {
        date = nedate;                  
    }

    public void setStudent(Student nestudent)
    {
        student = nestudent;
    }

    public void setSpecificUnit(int index, Unit newunit)
    {
        unit[index] = newunit;
    }

    public void setUnit(Unit[] neunit)
    {
        unit = neunit;
    }

    public void setUnitArraySize(int number)
    {
        unit = new Unit[number];
    }

    public String toString()
    {
        String value = date + student.toString();
        for (int x = 0; x < unit.length; x++)
        {
            if (unit[x] != null)
                value += unit[x].toString();
        }
        return value;
    }
 
                   

}
