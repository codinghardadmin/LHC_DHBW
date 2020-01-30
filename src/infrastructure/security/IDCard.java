package infrastructure.security;

import java.util.ArrayList;
import java.util.Date;

public abstract class IDCard {

    private String id;
    private Date validFrom;
    private Date validUntil;
    private int[][] irisStructure = new int[10][10];
    private ArrayList<Permission> permissionList;
    private boolean isLocked = false;

    public IDCard(String id, Date validFrom, Date validUntil, int[][] irisStructure, ArrayList<Permission> permissionList, boolean isLocked, IEncryption encryption) {
        this.id = id;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.irisStructure = irisStructure;
        this.permissionList = permissionList;
        this.isLocked = isLocked;
        this.encryption = encryption;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }

    public void setValidUntil(Date validUntil) {
        this.validUntil = validUntil;
    }

    public void setIrisStructure(int[][] irisStructure) {
        this.irisStructure = irisStructure;
    }

    public void setPermissionList(ArrayList<Permission> permissionList) {
        this.permissionList = permissionList;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public void setEncryption(IEncryption encryption) {
        this.encryption = encryption;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public Date getValidUntil() {
        return validUntil;
    }

    public int[][] getIrisStructure() {
        return irisStructure;
    }

    public ArrayList<Permission> getPermissionList() {
        return permissionList;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public IEncryption getEncryption() {
        return encryption;
    }

    protected IEncryption encryption;
}
