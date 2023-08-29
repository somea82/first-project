import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ProcessGpt {
    public String PublisherGPT(String article) throws Exception {


        ProcessBuilder pb = new ProcessBuilder("python","gpt_test.py",article);
        pb.redirectErrorStream(true);
        Process p = pb.start();
        StringBuilder resultBuilder = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(),"euc-kr"));

        try{
            String line;
            while((line=br.readLine()) != null){

                resultBuilder.append(line);
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

        return resultBuilder.toString();

    }

}