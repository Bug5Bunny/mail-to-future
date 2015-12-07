package org.mailtofuture.entity;

public class Mail {
    
    private String uuid;
    private String subject;
    private String text;
    private String receiver;
    private String sender;
    
    public String getUuid() {
        return uuid;
    }
    
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    
    public String getReceiver() {
        return receiver;
    }
    
    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }
    
    public String getSender() {
        return sender;
    }
    
    public void setSender(String sender) {
        this.sender = sender;
    }
    
    @Override
    public String toString() {
        return "Mail [subject=" + subject + ", text=" + text + ", receiver="
                + receiver + ", sender=" + sender + "]";
    }
}
