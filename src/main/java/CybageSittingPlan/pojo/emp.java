package CybageSittingPlan.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class emp {


        @SerializedName("employ")
        @Expose
        private List<empPojo> employ = null;

        public List<empPojo> getEmploy() {
            return employ;
        }

        public void setEmploy(List<empPojo> employ) {
            this.employ = employ;
        }
}
