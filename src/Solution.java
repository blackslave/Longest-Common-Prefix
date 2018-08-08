/**
 * ��o�w��0�������䛔�C���p珚��|�`����I�����C���p�����r�q�Q�o��������C��Q�s���ě������x�k�Z�Ď��q�Q�C�����S���w��|�`�����B
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

