package ru.hh.school.resource.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class FavouriteVacanciesResponseData {
    private String id;
    private String name;
    @JsonProperty(value = "date_create")
    private Date dateCreate; // дата добавления в избранное
    private AreaData area;
    private SalaryData salary;
    @JsonProperty(value = "created_at")
    private Date createdAt;
    private Long employer;
    private Long popularity; // та же логика, что и в компаниях
    @JsonProperty(value = "views_count")
    private Long viewsCount;
    private String comment;

    public FavouriteVacanciesResponseData() {
    }

    public FavouriteVacanciesResponseData(String id, String name, Date dateCreate, AreaData area, SalaryData salary, Date createdAt, Long employer, Long popularity, Long viewsCount, String comment) {
        this.id = id;
        this.name = name;
        this.dateCreate = dateCreate;
        this.area = area;
        this.salary = salary;
        this.createdAt = createdAt;
        this.employer = employer;
        this.popularity = popularity;
        this.viewsCount = viewsCount;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public AreaData getArea() {
        return area;
    }

    public void setArea(AreaData area) {
        this.area = area;
    }

    public SalaryData getSalary() {
        return salary;
    }

    public void setSalary(SalaryData salary) {
        this.salary = salary;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Long getEmployer() {
        return employer;
    }

    public void setEmployer(Long employer) {
        this.employer = employer;
    }

    public Long getPopularity() {
        return popularity;
    }

    public void setPopularity(Long popularity) {
        this.popularity = popularity;
    }

    public Long getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(Long viewsCount) {
        this.viewsCount = viewsCount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
