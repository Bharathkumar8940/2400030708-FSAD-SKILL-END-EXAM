package com.klef.fsad.exam;

import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.Date;

public class ClientDemo 
{
    public static void main(String[] args) 
    {
        // INSERT OPERATION
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Library lib = new Library(
                "Java Programming",
                "Core Java Book",
                "Available"
        );

        session.save(lib);
        tx.commit();
        session.close();

        System.out.println("Record Inserted Successfully");

        // DELETE OPERATION
        Session session2 = HibernateUtil.getSessionFactory().openSession();
        Transaction tx2 = session2.beginTransaction();

        int deleteId = lib.getId(); // deleting same inserted record

        Library l = session2.get(Library.class, deleteId);

        if (l != null) {
            session2.delete(l);
            System.out.println("Record Deleted Successfully");
        } else {
            System.out.println("Record Not Found");
        }

        tx2.commit();
        session2.close();
    }
}