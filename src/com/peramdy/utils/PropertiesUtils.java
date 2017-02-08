package com.peramdy.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Peramdy on 2017/2/8.
 */
public class PropertiesUtils {

  public static Object getValue(String key,String fileName){
      Object value=null;
      InputStream inputStream=null;
      Properties properties=new Properties();
//      InputStream inputStream=PropertiesUtils.class.getClassLoader().getResourceAsStream(fileName);

      try {
          inputStream=new FileInputStream(new File(fileName));
          if (inputStream==null)return null;
          properties.load(inputStream);
          value=properties.get(key);
      } catch (Exception e) {
          e.printStackTrace();
      }finally {
          try {
              if(inputStream!=null)
                  inputStream.close();
          } catch (IOException e) {
              e.printStackTrace();
          }
      }
      return value;
  }

}
