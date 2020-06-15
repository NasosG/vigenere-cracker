
package vigenere;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class OutputPlaintext 
{
    public static void plaintext(String plaintext, String key) throws FileNotFoundException, IOException 
    {
        //write plaintext to the file
        String fileName = "plaintext.txt", fileNameKey="key.txt";

        FileOutputStream fos = new FileOutputStream(fileName);
        
        try (OutputStreamWriter osw =  new OutputStreamWriter(fos, 
                StandardCharsets.UTF_8)) {

            osw.write(plaintext);
            
        }
        
        //write key to the file
        try (OutputStreamWriter osw2 =  new OutputStreamWriter(new FileOutputStream(fileNameKey), 
                StandardCharsets.UTF_8)) {

            osw2.write(key);
            
        }
    }
}