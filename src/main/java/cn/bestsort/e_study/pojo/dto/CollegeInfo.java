package cn.bestsort.e_study.pojo.dto;

public class CollegeInfo {
    private Long id;

    private String url;

    private String name;

    private String area;

    private String description;

    private Byte isDoubleFirst;

    private Byte isKey;

    private Byte isUndergraduate;

    private Byte isArt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getIsDoubleFirst() {
        return isDoubleFirst;
    }

    public void setIsDoubleFirst(Byte isDoubleFirst) {
        this.isDoubleFirst = isDoubleFirst;
    }

    public Byte getIsKey() {
        return isKey;
    }

    public void setIsKey(Byte isKey) {
        this.isKey = isKey;
    }

    public Byte getIsUndergraduate() {
        return isUndergraduate;
    }

    public void setIsUndergraduate(Byte isUndergraduate) {
        this.isUndergraduate = isUndergraduate;
    }

    public Byte getIsArt() {
        return isArt;
    }

    public void setIsArt(Byte isArt) {
        this.isArt = isArt;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", url=").append(url);
        sb.append(", name=").append(name);
        sb.append(", area=").append(area);
        sb.append(", description=").append(description);
        sb.append(", isDoubleFirst=").append(isDoubleFirst);
        sb.append(", isKey=").append(isKey);
        sb.append(", isUndergraduate=").append(isUndergraduate);
        sb.append(", isArt=").append(isArt);
        sb.append("]");
        return sb.toString();
    }
}