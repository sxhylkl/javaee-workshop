package de.gedoplan.workshop.persistence;

import de.gedoplan.workshop.domain.SpecialDay;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Transactional
public class SpecialDayRepository
{
  // @PersistenceContext(unitName = "default")
  @Inject
  // @Default
  EntityManager entityManager;

  public void persist(SpecialDay specialDay)
  {
    this.entityManager.persist(specialDay);
  }

  public void merge(SpecialDay specialDay)
  {
    this.entityManager.merge(specialDay);
  }

  public SpecialDay findById(String id)
  {
    return this.entityManager.find(SpecialDay.class, id);
  }

  public List<SpecialDay> findAll()
  {
    TypedQuery<SpecialDay> query = this.entityManager.createQuery("select sd from SpecialDay as sd", SpecialDay.class);
    return query.getResultList();
  }
}
