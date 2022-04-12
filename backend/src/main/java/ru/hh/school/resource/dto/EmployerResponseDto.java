package ru.hh.school.resource.dto;

public class EmployerResponseDto {
    private Long id; // идентификатор компании
    private String name; // название комопании
    private String description; // описание компании
    private AreaData area; // регион компании

    public EmployerResponseDto() {
    }

    public EmployerResponseDto(Long id, String name, String description, AreaData area) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.area = area;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public AreaData getArea() {
        return area;
    }

    public void setArea(AreaData area) {
        this.area = area;
    }
}
