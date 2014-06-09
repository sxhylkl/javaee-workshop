package de.gedoplan.workshop.presentation;

import de.gedoplan.workshop.domain.SpecialDay;
import de.gedoplan.workshop.domain.Talk;
import de.gedoplan.workshop.domain.TalkType;
import de.gedoplan.workshop.persistence.SpecialDayRepository;
import de.gedoplan.workshop.persistence.TalkRepository;
import de.gedoplan.workshop.qualifier.Current;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;
import javax.faces.flow.FlowScoped;
import javax.inject.Inject;

@Model
@FlowScoped("talkEdit")
public class TalkEditPresenter
{
  @Inject
  @Current
  Talk talk;

  public Talk getTalk()
  {
    return this.talk;
  }

  @Inject
  TalkRepository       talkRepository;

  @Inject
  SpecialDayRepository specialDayRepository;

  public String save()
  {
    this.talkRepository.merge(this.talk);
    return "exit";
  }

  public TalkType[] getTalkTypes()
  {
    return TalkType.values();
  }

  private List<SpecialDay> specialDays;

  @PostConstruct
  void fillSpecialDays()
  {
    this.specialDays = this.specialDayRepository.findAll();
  }

  public List<SpecialDay> getSpecialDays()
  {
    return this.specialDays;
  }

}
