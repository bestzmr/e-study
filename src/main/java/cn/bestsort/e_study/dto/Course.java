package cn.bestsort.e_study.dto;

public class Course {
    private Long id;

    private String name;

    private String description;

    private String teacher;

    private Integer schoolHour;

    private Integer totalPeople;

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
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher == null ? null : teacher.trim();
    }

    public Integer getSchoolHour() {
        return schoolHour;
    }

    public void setSchoolHour(Integer schoolHour) {
        this.schoolHour = schoolHour;
    }

    public Integer getTotalPeople() {
        return totalPeople;
    }

    public void setTotalPeople(Integer totalPeople) {
        this.totalPeople = totalPeople;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", teacher=").append(teacher);
        sb.append(", schoolHour=").append(schoolHour);
        sb.append(", totalPeople=").append(totalPeople);
        sb.append("]");
        return sb.toString();
    }
}