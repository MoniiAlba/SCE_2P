/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.presentation;

import boundary.MessageFacade;
import entities.Message;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author RGAMBOAH
 */
@Named(value = "MessageView")
@RequestScoped
public class MessageView {

    @EJB
    private MessageFacade messageFacade;
    // Creates a new field
    private Message message;
    
    private long cualQuieres = 1;

    public long getCualQuieres() {
        return cualQuieres;
    }

    public void setCualQuieres(long cualQuieres) {
        this.cualQuieres = cualQuieres;
    }

    /**
     * Creates a new instance of MessageView
     */
    public MessageView() 
    {
        this.message = new Message();
    }
    
    // Calls getMessage to retrieve the message
    public Message getmessage()
    {
        return message;
    }
    
    // Returns the total number of messages
    public int getNumberOfMessages()
    {
        return messageFacade.findAll().size();
    }
    // para que pueda buscar un mensaje
    public Message getMessageNumber(Long id)
    {
        return messageFacade.find(id);
    }
    
    public Message getTraeElMensaje()
    {
        return messageFacade.find(cualQuieres);
    }
    
    
    // Saves the message and returns the string "theend"
    public String postMessage()
    {
        this.messageFacade.create(message);
        return "theend";
    }
    
}
