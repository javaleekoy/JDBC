package servlet.com.peramdy.utils;

/**
 * Created by Peramdy on 2017/4/12.
 */
public class CommonUtils {

    /**
     * @description 版本比较
     * @param newVersion 新版本
     * @param currentVersion 当前版本
     * @return
     * @throws Exception
     */
    public static int compareVersion(String newVersion, String currentVersion) throws Exception {
        if (newVersion == null || currentVersion == null)
            throw new Exception("params is empty!");
        String regex = "\\s+";
        newVersion = newVersion.replaceAll(regex, "");
        currentVersion = currentVersion.replaceAll(regex, "");
        String[] newVersionArray = newVersion.split("\\.");
        String[] currentVersionArray = currentVersion.split("\\.");
        int idx = 0;
        int diff = 0;
        int minLength = Math.min(newVersionArray.length, currentVersionArray.length);
        while (idx < minLength
                && ((diff = newVersionArray[idx].length() - currentVersionArray[idx].length()) == 0)
                && ((diff = newVersionArray[idx].compareTo(currentVersionArray[idx])) == 0)
                ) {
            idx++;
        }
        diff = (diff != 0) ? diff : newVersionArray.length - currentVersionArray.length;
        return diff;
    }

}
