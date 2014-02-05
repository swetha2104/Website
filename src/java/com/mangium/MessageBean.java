package com.mangium;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.RequestScoped;

@javax.faces.bean.ManagedBean
@RequestScoped
public class MessageBean {

    private List<Message> messages;

    private MessageDataModel mediummessagemodel;

    private Message selectedmessage;

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    public MessageDataModel getMediummessagemodel() {
        return mediummessagemodel;
    }

    public void setMediummessagemodel(MessageDataModel mediummessagemodel) {
        this.mediummessagemodel = mediummessagemodel;
    }

    public Message getSelectedmessage() {
        return selectedmessage;
    }

    public void setSelectedmessage(Message selectedmessage) {
        this.selectedmessage = selectedmessage;
    }

    public Message[] getSelectedmessages() {
        return selectedmessages;
    }

    public void setSelectedmessages(Message[] selectedmessages) {
        this.selectedmessages = selectedmessages;
    }

    private Message[] selectedmessages;

    public MessageBean() {

     
        Message m3 = new Message();
        Message m4 = new Message();
        Message m5 = new Message();
        Message m6 = new Message();
        Message m7 = new Message();
        Message m8 = new Message();
        Message m9 = new Message();
        Message m10 = new Message();
        Message m11 = new Message();
        Message m12 = new Message();
        Message m13 = new Message();
        Message m14 = new Message();

        m3.setName("Manjunath");
        m4.setName("Tanisha");
        m5.setName("Vivek");
        m6.setName("Priyanka");
        m7.setName("Bhumi");
        m8.setName("Natasha");
        m9.setName("Simran");
        m10.setName("Gauri");
        m11.setName("Madhuri");
        m12.setName("Bhumi");
        m13.setName("Siri");
        m14.setName("Payal");

        m3.setSubject("need admission info in MBA");
        m4.setSubject("good college");
        m5.setSubject("facility is bad");
        m6.setSubject("placements can be improved");

        m7.setSubject("when college reopens ");
        m8.setSubject("feecost for MBA is good");
        m9.setSubject("infrastructure is bad");
        m10.setSubject("library's capactiy should be more");

        m11.setSubject("what is cost of BBM admission ");
        m12.setSubject("college campus is good");
        m13.setSubject("parking facility is bad");
        m14.setSubject("canteen's facility should be improved");

        m3.setType("Enquiry");
        m4.setType("Review");
        m5.setType("Complaint");
        m6.setType("Feedback");

        m7.setType("Enquiry");
        m8.setType("Review");
        m9.setType("Complaint");
        m10.setType("Feedback");

        m11.setType("Enquiry");
        m12.setType("Review");
        m13.setType("Complaint");
        m14.setType("Feedback");

        m3.setDescription("need info about MBA admission ");
        m4.setDescription("college is good ");
        m5.setDescription("facility is not that good");
        m6.setDescription("placements should be improved");
        m7.setDescription("when does college reopens ");
        m8.setDescription("feecost for MBA is good");
        m9.setDescription("infrastructure is bad");
        m10.setDescription("library's capactiy should be more");

        m11.setDescription("what is cost of BBM admission ");
        m12.setDescription("college campus is good");
        m13.setDescription("parking facility is bad");
        m14.setDescription("canteen's facility is poor");

        m3.setDate("Mon,Jan 30,2013");
        m4.setDate("Tue,Feb 29,2013");
        m5.setDate("Wed,Mar 28,2013 ");
        m6.setDate("Thur,Apr 27,2013");
        m7.setDate("Fri,May 26,2013");
        m8.setDate("Mon,May 30,2013");
        m9.setDate("Tue,Dec 29,2013");
        m10.setDate("Wed,Dec 28,2013 ");
        m11.setDate("Thur,Dec 27,2013");
        m12.setDate("Fri,Dec 26,2013");
        m13.setDate("Sat,Dec 27,2013");
        m14.setDate("Fri,Dec 26,2013");

        messages = new ArrayList<Message>();
        
        messages.add(m3);
        messages.add(m4);
        messages.add(m5);
        messages.add(m6);
        messages.add(m7);
        messages.add(m8);
        messages.add(m9);
        messages.add(m10);
        messages.add(m11);
        messages.add(m12);
        messages.add(m13);
        messages.add(m14);

        mediummessagemodel = new MessageDataModel(messages);
    }

}
