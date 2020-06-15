
package vigenere;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class InputCiphertext 
{
    public static String getText() 
    {
        String fileName = "ciphertext.txt";
        String content = null;
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName)))
        {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilder.append(sCurrentLine).append("\n");
            }
            content = contentBuilder.toString();
        }
        catch (IOException e)
        {
            System.err.println(e);
        }
        
        return content;
    }
    
}
