package com.cn.goldenjobs.bean;

import com.iyiyo.mvp.domain.Entity;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

import java.io.Serializable;

/**
 * Created by thanatos on 16/2/23.
 */
@Root(name = "oschina")
public class RespUser extends Entity{

    @Element(name = "result", required = false)
    private Result result;

    @Element(name = "user", required = false)
    private User user;

    @Root(name = "result")
    public static class Result{

        @Element(name = "errorCode", required = false)
        private int errorCode;

        @Element(name = "errorMessage", required = false)
        private String errorMessage;

        public int getErrorCode() {
            return errorCode;
        }

        public void setErrorCode(int errorCode) {
            this.errorCode = errorCode;
        }

        public String getErrorMessage() {
            return errorMessage;
        }

        public void setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
        }
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
