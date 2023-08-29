import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws Exception {
        ProcessBuilder pb = new ProcessBuilder("python","src/web.py","매개변수");
        pb.redirectErrorStream(true);
        Process p = pb.start();

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(),"euc-kr"));

        try{
            String line = "";
            while((line=br.readLine()) != null){
                System.out.println(line);
            }
        } finally{
            try{
                if(br != null){
                    br.close();
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }



    }
}}