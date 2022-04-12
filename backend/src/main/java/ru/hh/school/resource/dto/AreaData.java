package ru.hh.school.resource.dto;

public class AreaData {
    private Long id;
    private String name;

    public AreaData() {
    }

    public AreaData(Long id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public String toString() {
        return "AreaData{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
