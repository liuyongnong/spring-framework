package org.springframework.liuyn.bean;

public class Branch {
    private String branchNo;
    private String branchName;
    private String branchUrl;

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getBranchUrl() {
        return branchUrl;
    }

    public void setBranchUrl(String branchUrl) {
        this.branchUrl = branchUrl;

    }

    @Override
    public String toString() {
        return "Branch{" +
                "branchNo='" + branchNo + '\'' +
                ", branchName='" + branchName + '\'' +
                ", branchUrl='" + branchUrl + '\'' +
                '}';
    }
}
