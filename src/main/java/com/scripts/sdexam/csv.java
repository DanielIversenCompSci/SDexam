package com.scripts.sdexam;
import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.Statement;

public class csv {
    public static void main(String[] args) {
        String csvFilePath = "routes.csv";

        try(Connection connection = dbConnect.getConnection()){
            Statement stmt = connection.createStatement();
            BufferedReader in=new BufferedReader(new FileReader(csvFilePath));
            System.out.println("**DB UPDATED**");
            while(true){
                String s=in.readLine();
                if(s==null)break;
                stmt.executeUpdate("insert into voyage values ("+s+");");
                System.out.println("insert into voyage values ("+s+");");
            }

        }catch(Exception e){System.out.println(e);}
    }
}
