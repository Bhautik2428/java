import java.io.IOException;
public class Shut
{
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try{
            r.exec("shutdown /s");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}