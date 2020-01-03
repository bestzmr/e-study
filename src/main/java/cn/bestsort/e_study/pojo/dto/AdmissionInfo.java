package cn.bestsort.e_study.pojo.dto;

public class AdmissionInfo {
    private Long id;

    private Float score;

    private String policy;

    private String policyDescription;

    private Integer schoolYear;

    private Byte isCollege;

    private Long schoolId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getPolicy() {
        return policy;
    }

    public void setPolicy(String policy) {
        this.policy = policy == null ? null : policy.trim();
    }

    public String getPolicyDescription() {
        return policyDescription;
    }

    public void setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription == null ? null : policyDescription.trim();
    }

    public Integer getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(Integer schoolYear) {
        this.schoolYear = schoolYear;
    }

    public Byte getIsCollege() {
        return isCollege;
    }

    public void setIsCollege(Byte isCollege) {
        this.isCollege = isCollege;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", score=").append(score);
        sb.append(", policy=").append(policy);
        sb.append(", policyDescription=").append(policyDescription);
        sb.append(", schoolYear=").append(schoolYear);
        sb.append(", isCollege=").append(isCollege);
        sb.append(", schoolId=").append(schoolId);
        sb.append("]");
        return sb.toString();
    }
}