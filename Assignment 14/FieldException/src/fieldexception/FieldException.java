
package fieldexception;
import java.lang.reflect.Field;  
public class FieldException {
public int num;  
    
    public static void main(String[] args)throws NoSuchFieldException  {
      
        Class<FieldException> obj = FieldException.class;  
        Field fields = obj.getField("num");  
        System.out.println(fields);  
        Class<?> tp = fields.getType();    
        System.out.println(tp);
    }  
}
