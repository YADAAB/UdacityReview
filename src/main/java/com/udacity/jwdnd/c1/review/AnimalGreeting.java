package com.udacity.jwdnd.c1.review;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class AnimalGreeting {
    private List<MessageForm> list;
    public void addGreetings(String animal, String adj)
    {
        list.add(new MessageForm(animal, adj));
    }

    public List<MessageForm> getGreetings()
    {
        return list;
    }

    @PostConstruct
    public void postConstruct() {
        this.list = new ArrayList();

    }
}
