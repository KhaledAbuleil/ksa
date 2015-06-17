package CheckInput;

import javax.swing.JTextField;

public class checkInput {
private String filename;
public static String CheckIfNull(String str)
{

	if(str=="")
	return "erorr";
	else
	return "Ok";
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
