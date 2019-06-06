package com.wn.util;

import com.wn.vo.Resultvo;

public class ResultUtil {
  public static Resultvo success(Object data){
      Resultvo  resultvo =new Resultvo();
      resultvo.setCode(0);
      resultvo.setData(data);
      resultvo.setMessage("success");
      return  resultvo;
  }
  public static Resultvo success(){
      return success(null);
  }

  public static Resultvo error(){
      Resultvo  resultvo =new Resultvo();
      resultvo.setCode(1);
      resultvo.setMessage("error");
      return  resultvo;
  }
}
