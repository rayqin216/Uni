import java.util.*;

public class Validation
{
    public boolean isBlank(String value)
    {
        boolean blank = false;
        if(value.trim().length() == 0)
            blank = true;
        return blank;
    }

    public boolean isWithinRange(String value, int min, int max)
    {
        boolean inrange = false;
        if((value.trim().length() >= min) && (value.trim().length() <= max))
        {
            inrange = true;
        }
        return inrange;
    }
}

