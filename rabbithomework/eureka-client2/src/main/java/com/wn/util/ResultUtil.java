package com.wn.util;

import com.wn.enums.ResultCodeEnums;
import com.wn.vo.ResultVO;

public class ResultUtil {

    public static ResultVO success(Object data){
        ResultVO result=  new ResultVO();
        result.setCode(ResultCodeEnums.OK.getCode());
        result.setData(data);
        result.setMessage("success");
        return result;
    }
    public static ResultVO success(){
        return  success(null);
    }
    public static ResultVO error() {
        ResultVO resultVO = new ResultVO();
        resultVO.setMessage("error");
        resultVO.setCode(0);
        return resultVO;
    }
}
