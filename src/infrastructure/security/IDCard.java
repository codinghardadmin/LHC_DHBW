package infrastructure.security;

import infrastructure.IEncryption;

import java.util.ArrayList;
import java.util.Date;

public abstract class IDCard {

    private String id;
    private Date validFrom;
    private Date validUntil;
    private int[][] irisStructure = new int[10][10];
    private ArrayList<Permission> permissionList;
    private boolean isLocked;
    protected IEncryption encryption;
}
