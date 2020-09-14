package CybageSittingPlan.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class empPojo {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("deskNo")
    @Expose
    private Integer deskNo;
    @SerializedName("birthdaybrings")
    @Expose
    private String birthdaybrings;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDeskNo() {
        return deskNo;
    }

    public void setDeskNo(Integer deskNo) {
        this.deskNo = deskNo;
    }

    public String getBirthdaybrings() {
        return birthdaybrings;
    }

    public void setBirthdaybrings(String birthdaybrings) {
        this.birthdaybrings = birthdaybrings;
    }

}
