package adam.sample.project;

/**
 * Created by yartas on 10/5/19.
 */
public class HelloWorldJenkins
{
    public HelloWorldJenkins(){}

    public void printHello()
    {
        System.out.println("This is a hello world! build by Jenkins from Adam's GitHUb/webdev");
    }

    public static void main(String args [])
    {
        HelloWorldJenkins jk = new HelloWorldJenkins();
        jk.printHello();
    }
}
