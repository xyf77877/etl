package cn.xyf.etl.common.response;

import lombok.Data;

@Data
public class ResponseBody<T> {
    private boolean success = true;
    private int code = 0;
    private String msg;
    private T data;

    public static <T> ResponseBody<T> success(ResultCode code, T data) {
        ResponseBody<T> responseBody = new ResponseBody<>();
        responseBody.code = code.getCode();
        responseBody.success = true;
        responseBody.msg = code.getMsg();
        responseBody.data = data;
        return responseBody;
    }
    public static <T> ResponseBody<T> error(ResultCode code) {
        ResponseBody<T> responseBody = new ResponseBody<>();
        responseBody.code = code.getCode();
        responseBody.success = false;
        responseBody.msg = code.getMsg();
        responseBody.data = null;
        return responseBody;
    }
}
