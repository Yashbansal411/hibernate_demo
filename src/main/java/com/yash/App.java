package com.yash;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
//import org.hibernate.service;
import java.awt.*;

public class App {
    public static void main(String[] args){
        alien telusko = new alien();
        telusko.setAid(107);
        telusko.setName("abcd");
        telusko.setColor("blueee");
        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(alien.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();

        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.save(telusko);
        tx.commit();
    }
}
