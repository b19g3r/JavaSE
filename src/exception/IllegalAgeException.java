package exception;

/**
 * @PackageName: exception
 * @ClassName: IllegalAgeException
 * @Description: 年龄不合法的自定义异常. 自定异常一般用来检测业务逻辑错误
 * @Author: Shane
 * @Date: 2018/4/10 10:56
 **/
/** 
 *@Description: 年龄不合法的自定义异常. 自定异常一般用来检测业务逻辑错误
 *@Author: Shane
 *@Date: 2018/4/10 11:07
 **/
public class IllegalAgeException extends Exception {
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }

    public IllegalAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public IllegalAgeException(Throwable cause) {
        super(cause);
    }

    public IllegalAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
