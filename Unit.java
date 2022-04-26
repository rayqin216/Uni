public class Unit
{
    private String unitCode;
    private String unitDescription;
    private int creditPoints;

    public Unit()
    {
        unitCode = "unknown";
        unitDescription = "unknown";
        creditPoints = 0;
    }

    public Unit(String newunitCode, String newunitDescription, int newcreditPoint)
    {
        unitCode = newunitCode;
        unitDescription = newunitDescription;
        creditPoints = newcreditPoint;
    }

    public void display()
    {
        System.out.println("" + unitCode + "" + unitDescription + "" + creditPoints);
    }

    public int getCreditPoints()
    {
        return creditPoints;
    }

    public String getUnitCode()
    {
        return unitCode;
    }

    public String getUnitDescription()
    {
        return unitDescription;
    }

    public void setCreditPoints(int necreditPoints)
    {
        creditPoints = necreditPoints;
    }

    public void setUnitCode(String neunitCode)
    {
        unitCode = neunitCode;
    }

    public void setUnitDescription(String neunitDescription)
    {
        unitDescription = neunitDescription;
    }
    
    public String toString()
    {
        return "unitcode:" + unitCode + "\tunitdescription:" + unitDescription + "\tcreditPoints:" +creditPoints;
    }
    
}
