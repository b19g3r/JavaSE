package homework.exercise02;

/**
 * @PackageName: homework.exercise02
 * @ClassName: RegExUtils
 * @Description: API-Exercise 02
 * @Author: Shane
 * @Date: 2018/4/822:39
 **/

public class RegExUtils {

    // 验证身份证号码的正则表达式
    private static final String IDENTIFY_CARD_REGEX = "^\\d{15}|\\d{18}$";
    // 验证右边的正则表达式
    private static final String ZIP_CODE_REGEX = "^[1-9][0-9]{5}$";
    // 验证手机号的正则表达式
    private static final String PHONE_NUMBER_REGEX = "^13[0-9]{9}|(15[89][0-9]{8})$";

    /**
     *@Description: 检查字符串是否和正则表达式匹配
     *@Parm: [str, regex]
     *@Return: boolean
     *@Throws:
     *@Author: Shane
     *@Date: 2018/4/822:51
     **/

    private boolean check(String str, String regex){
        return str.matches(regex);
    }
    // 分别检测三种字串是否合法
    public boolean IDCheck(String ID){
        return check(ID, IDENTIFY_CARD_REGEX);
    }
    public boolean zipCodeCheck(String zipCode){
        return check(zipCode, ZIP_CODE_REGEX);
    }

    public boolean phoneNumberCheck(String phoneNumber){
        return check(phoneNumber, PHONE_NUMBER_REGEX);
    }
}
