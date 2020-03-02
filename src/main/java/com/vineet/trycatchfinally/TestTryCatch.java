package com.vineet.trycatchfinally;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class TestTryCatch {


    public static void main(String[] args) {
       int i= TestTryCatch.calc();
        System.out.println(i);
    }

    public static int calc(){
         try{
             System.out.println("print in try");
             throw new Exception("thrown from try");
             //System.exit(0);
         }catch(Exception e){
             System.out.println("print in catch");
            return 2;


        }finally {
             System.out.println("in finally");
             return 3;
         }

    }
}
