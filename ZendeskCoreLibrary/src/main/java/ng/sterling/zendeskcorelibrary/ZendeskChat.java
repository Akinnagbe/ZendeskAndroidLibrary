package ng.sterling.zendeskcorelibrary;


import android.app.Application;

import zendesk.chat.Chat;

public class ZendeskChat {

    public static  void init(Application context,String chatAccountKey){
        Chat.INSTANCE.init(context, chatAccountKey);
    }
}
