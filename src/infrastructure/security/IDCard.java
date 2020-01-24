package infrastructure.security;

import infrastructure.security.Permission;

import java.util.ArrayList;
import java.util.Date;

public class IDCard {

    private String id;
    private Date validFrom;
    private Date validUntil;
    private int[][] irisStructure = new int[10][10];
    private ArrayList<Permission> permissionList;
    private boolean isLocked;
}
