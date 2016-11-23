package com.brainysoon.zkeps.utils;

/**
 * Created by brainy on 16-11-22.
 */
public class CodeUtils {

    private static CodeUtils mInstance = new CodeUtils();

    private CodeUtils() {
    }

    public static CodeUtils getInstance() {

        return mInstance;
    }

    /**
     * @param code 状态吗
     * @return 解析状态吗的结果
     */
    public boolean parserCodeToBoolean(int code) {

        return code > 0;
    }

    /**
     * @param code
     * @return //语义化过后的字符串
     */
    public String parserCodeToString(int code) {

        if (code == 1) {

            return "登录成功！";
        } else if (code == -1) {

            return "登录失败，不存在该用户！";
        } else if (code == -2) {

            return "登录失败，用户密码错误！";
        } else {

            return "无法解析!";
        }
    }
}
