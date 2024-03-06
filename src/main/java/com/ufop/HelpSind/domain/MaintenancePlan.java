package com.ufop.HelpSind.domain;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;


@SuppressWarnings("serial")
@Entity
@Table(name = "maintenance_plan")
public class MaintenancePlan implements Serializable, Comparable<MaintenancePlan> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmaintenancePlan")
    private Long idMaintenancePlan;

    @NotEmpty
    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "days")
    private Integer days;

    public Condominium getCondominium() {
        return condominium;
    }

    public void setCondominium(Condominium condominium) {
        this.condominium = condominium;
    }

    @Column(name = "initial_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date initialDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idcondominium")
    private Condominium condominium;

    public Long getIdMaintenancePlan() {
        return idMaintenancePlan;
    }

    public void setIdMaintenancePlan(Long idMaintenancePlan) {
        this.idMaintenancePlan = idMaintenancePlan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Date getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(Date initialDate) {
        this.initialDate = initialDate;
    }

    public LocalDate getFinalDate() {
        return finalDate;
    }

    public void setFinalDate(LocalDate finalDate) {
        this.finalDate = finalDate;
    }

    @Column(name = "final_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate finalDate;


    @Override
    public int compareTo(MaintenancePlan o) {
        return 0;
    }
}