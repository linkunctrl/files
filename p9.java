

import java.io.FileWriter;
import java.io.IOException;

public class p9 {
    public static void main(String[] args) {
        try{       
             FileWriter writer = new FileWriter("damn.txt");
             writer.write("DAMN!\nTWERK TWERK TWERK.");
             writer.append("(damn..)");
             writer.close(); 
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
    
}
// press f5 to refresh 
