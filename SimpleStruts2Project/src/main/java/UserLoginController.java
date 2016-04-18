/**
 * Created by Dileepa on 4/18/2016.
 */
public class UserLoginController
{

    private String username;
    private String password;

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
        if ( ( username!= null && username.equals( "admin" ) ) && ( password!= null && password.equals( "admin" ) ) )
        {
            return "SUCCESS";
        }
        else
        {
            return "FAIL";
        }
    }
}
