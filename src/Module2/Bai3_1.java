/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Module2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;





/**
 * psvm +tab
 pa+crtl+space : ep kieu 
asdasff
 * @author Hung 
 */
public class Bai3_1 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException{
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader("src/Module2/Bai3_1.json"));
        JSONObject jsonObject = (JSONObject)obj;
        System.out.println(jsonObject);
    }
}
