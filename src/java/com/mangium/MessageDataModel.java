

package com.mangium;
import java.util.List;  
import javax.faces.model.ListDataModel;  
 
import org.primefaces.model.SelectableDataModel;
public class MessageDataModel  extends ListDataModel<Message> implements SelectableDataModel<Message> {
     public MessageDataModel()
    {
    
    }
    
    public MessageDataModel(List<Message> data) {  
        super(data);  
    }  
    
           public Message getRowData(String rowKey) {  
        //In a real app, a more efficient way like a query by rowKey should be implemented to deal with huge data  
          
        List<Message> messages = (List<Message>) getWrappedData();  
          
        for(Message msg:messages ) {  
            if(msg.getName().equals(rowKey))  
                return msg;  
        }  
          
        return null;  
    }  

    @Override
    public Object getRowKey(Message t) {
              return t.getName(); 
    }
}
