package com.demoone.DTO;

public class Version {
    private Integer id;

    private String mainVersion;

    private String betaVersion;

    private String path;

    private String comm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainVersion() {
        return mainVersion;
    }

    public void setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion == null ? null : mainVersion.trim();
    }

    public String getBetaVersion() {
        return betaVersion;
    }

    public void setBetaVersion(String betaVersion) {
        this.betaVersion = betaVersion == null ? null : betaVersion.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm == null ? null : comm.trim();
    }
}