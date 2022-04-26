public class Student
{
    private String name;
    private String address;
    private String phoneNo;
    private String email;

    public Student()
    {
        name = "unknown";
        address = "unknown"; 
        email = "unknown";     
        phoneNo = "unknown";
          
    }

    public Student(String newname, String newaddress, String newphoneNo, String newemail)
    {
        name = newname;
        address = newaddress;
        email = newemail;
        phoneNo = newphoneNo;
    }

    public void display()
    {
        System.out.println("" + address + "" + email + "" + name + "" + phoneNo);
    }

    public String getAddress()
    {
        return address;
    }

    public String getEmail()
    {
        return email;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoneNo()
    {
        return phoneNo;
    }

    public void setAddress(String neaddress)
    {
        address = neaddress;
    }

    public void setEmail(String neemail)
    {
        email = neemail;
    }

    public void setName(String nename)
    {
        name = nename;
    }

    public void setPhoneNo(String nephoneNo)
    {
        phoneNo = nephoneNo;
    }

    public String toString()
    {
        return "address:" + address + "\temail" + email + "\tname" + name + "\tphone" + phoneNo;
    }
      
}
