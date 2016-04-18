/**
 * Created by Dileepa on 4/18/2016.
 */
public class DetailsController
{
    private String username;
    private String password;
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName( String name )
    {
        this.name = name;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername( String username )
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword( String password )
    {
        this.password = password;
    }

    public String execute()
    {
        return "SUCCESS";

    }


}
