package com.project.miaosha.error;

/**
 * @author Fang Hongxin Email:3170104126@zju.edu.cn
 * @date 2022-07-03 8:45
 * @Description
 */
public interface CommonError {
    public int getErrCode();
    public String getErrMsg();
    public CommonError setErrMsg(String errMsg);
}
