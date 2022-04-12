package ru.hh.school.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.hh.school.domain.Vacancy;

import javax.persistence.NoResultException;

@Repository
public class VacancyRepository extends AbstractRepository<Vacancy> {
    @Autowired
    public VacancyRepository(SessionFactory sessionFactory) {
        super(sessionFactory);
    }

    public Vacancy getById(Long vacancyId) {
        try {
            Session session = getSessionFactory().getCurrentSession();
            return session.createQuery("SELECT u From Vacancy u WHERE u.id = :id", Vacancy.class)
                    .setParameter("id", vacancyId)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
}