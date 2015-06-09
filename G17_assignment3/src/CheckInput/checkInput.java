package CheckInput;

import java.util.ArrayList;

import javax.swing.JTextField;

public class checkInput {
private String filename;
public static ArrayList<String> names ;
public static Boolean CheckTheFileName(String str)
{
	int i;
	for(i=0;i<names.size();i++)
	if(names.get(i).equals(str))
	return true;
		return false;
}

public static int CheckDescribe(String text) {
	// TODO Auto-generated method stub
    int wordCount = 0;
	if( text==null)
	return 0;
    for (int i = 0; i < text.length()-1; i++) 
    {
        if ((text.charAt(i) == ' ' ||text.charAt(i) == '.'||text.charAt(i) == ','||text.charAt(i) == ',') 
        		&&(text.charAt(i+1) != ' '&& text.charAt(i+1) != '.'&& text.charAt(i+1) != ','&& text.charAt(i+1) != ','))
        {
            wordCount++;
        } 
    }
    return wordCount;
	
}

}

