/**
 * æow—ñ0‘—¿‹”ä›”C—˜—pçšŸ‘|•`‘´Œã“I‘—¿C•À—pš‹ørqQo‹¤“¯šñCáQ•s“Ä›’‘´’·“xk’ZÄŸqQC’¼“‘S•”w—ñ‘|•`Š®¬B
 * @author black
 *
 */
public class Solution 
{
	public String longestCommonPrefix(String[] strs) {
		if(strs == null || strs.length == 0)    return "";
        String result = strs[0];
        int i = 1;
        while(i < strs.length)
        {
        	while(strs[i].indexOf(result) != 0)
        	{
        		result = result.substring(0,result.length()-1);
        	}
            i++;
        }
        return result; 
    }
}

