/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Module2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;



/**
 * psvm +tab
 pa+crtl+space : ep kieu 
asdasff
 * @author Hung 
 */
public class TestBai3 {
    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
//        JSONParser parser = new JSONParser();
//        Object obj = parser.parse(new FileReader("src/Module2/TestJsonBai3.json"));
//        JSONObject jsonObject = (JSONObject)obj;
//        System.out.println(jsonObject);
//        
//        //Lay tung gia tri
//        String name = (String)jsonObject.get("name");
//        System.out.println(name);
//        
//        //Lay trung gia tri trong mang
//        JSONArray courses = (JSONArray)jsonObject.get("courses");
//        Iterator<String> iterator = courses.iterator();
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }



//          JSONObject obj = new JSONObject();
//          obj.put("school", "Tran Quoc Toan");
//          try(FileWriter file = new FileWriter("src/Module2/TestJsonBai3.json")){
//              file.write(obj.toJSONString());
//              file.flush();
//          }catch(IOException e){
//              e.printStackTrace();
//          }


            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/Module2/TestJsonBai3.json"));
            JSONObject jsonObject = (JSONObject)obj;
            JSONArray list = new JSONArray();
            list.add("Co so 1");
            list.add("Co so 2");
            list.add("Co so 3");
            jsonObject.put("branches", list);
            FileWriter file = new FileWriter("src/Module2/TestJsonBai3.json");
            file.write(jsonObject.toJSONString());
            file.flush();
            file.close();
    }
}
