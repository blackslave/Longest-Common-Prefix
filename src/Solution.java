/**
 * ęowń0æäCpē|`“ćIæCĄpųrqQo¤ÆńCįQsÄ“·xkZÄqQC¼Swń|`®¬B
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

