package com.train.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import com.train.dao.JPAUtility;
import com.train.entities.Event;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class App2 {
	private static EntityManager em =JPAUtility.getEntityManager();
	
		public static void main(String[] args) {
			Event e1 = new Event();
			LocalDate date1 = LocalDate.of(2022, 1, 1);
			LocalTime time1 = LocalTime.of(8, 30);
			e1.setDateOfEvent(date1);
			e1.setDurationOfEvent(Duration.between(LocalTime.of(8,30),LocalTime.of(18,0)));
			e1.setStartTimeOfEvent(LocalDateTime.of(date1, time1));
			e1.setEventName("Party");
			
			System.out.println(e1);
			
			EntityTransaction tr = em.getTransaction();
			tr.begin();
			em.persist(e1);
			tr.commit();
			
			JPAUtility.close();
		}
}
