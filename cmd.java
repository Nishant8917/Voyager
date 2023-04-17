import java.io.*;

public class cmd {
    public static void cmd1() throws Exception {
        ProcessBuilder builder = new ProcessBuilder(
            "cmd.exe", "/c", "cd \"D:\\sanchit\\download\\personality\\Personality-prediction-system-master\" && code.py");
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
        String line;
        while (true) {
            line = r.readLine();
            if (line == null) { break; }
            System.out.println(line);
        }
    }
    

    


    public static void main(String[] args){
        try{
            cmd1();
        }
        catch(Exception ex){
            System.out.println("ERROR");
        }
    }
}