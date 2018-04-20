package homework.exercise02;

/**
 * @PackageName: homework.exercise02
 * @ClassName: RegExUtilTest
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/822:57
 **/

public class RegExUtilTest {
    public static void main(String[] args) {
        String[] phone = { "13287069084",
                            "13287069088",
                            "19847209843" };
        String[] zipCode = { "255000", "266102" ,"21321232" };
        String[] ID = {"370923199603151915","12312313131313" };
        RegExUtils reg = new RegExUtils();
        for (int i = 0; i < phone.length; i++) {
            System.out.println(reg.phoneNumberCheck(phone[i]));
        }

        for (int i = 0; i < ID.length; i++) {
            System.out.println(reg.IDCheck(ID[i]));
        }

        for (int i = 0; i < zipCode.length; i++) {
            System.out.println(reg.zipCodeCheck(zipCode[i]));
        }
    }
}
