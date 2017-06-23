import java.util.ArrayList;
import java.util.Collections;

public class ArrayExample {
	public static void main(String[] args) 
    {    
        String[] array = new String[] {"ANDROID", "JSP", "JAVA", "STRUTS", "HADOOP", "JSF"};
         
        ArrayList<String> list = new ArrayList<String>();
         
        Collections.addAll(list, array);
         
        System.out.println(list);
    }    


}
