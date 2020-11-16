package com.intellectualcrafters.src;

public class Ranks {
    public static final String SPIELER = "Spieler";			public static final String PERM_SPIELER = "mx.spieler";
    public static final String PREMIUM = "Premium";			public static final String PERM_PREMIUM = "mx.premium";
    public static final String PRIME = "Prime";				public static final String PERM_PRIME = "mx.prime";
    public static final String ELITE = "Elite";				public static final String PERM_ELITE = "mx.elite";
    public static final String EXTREME = "Extreme";			public static final String PERM_EXTREME = "mx.extreme";
    public static final String EPIC = "EPIC";				public static final String PERM_EPIC = "mx.epic";
    public static final String YT = "YT";					public static final String PERM_YT = "mx.yt";
    public static final String YTPLUS = "YTPLUS";			public static final String PERM_YTPLUS = "mx.ytplus";
    public static final String MIXOSUCHTI = "MixoSuchti";	public static final String PERM_MIXOSUCHTI = "mx.mixosuchti";
    public static final String HELFER = "Helfer";			public static final String PERM_HELFER = "mx.helfer";
    public static final String BUILDER = "Builder";			public static final String PERM_BUILDER = "mx.builder";
    public static final String SUP = "SUP";					public static final String PERM_SUP = "mx.sup";
    public static final String JRMOD = "jrMOD";				public static final String PERM_JRMOD = "mx.jrmod";
    public static final String MOD = "MOD";					public static final String PERM_MOD = "mx.mod";
    public static final String DEV = "DEV";					public static final String PERM_DEV = "mx.dev";
    public static final String LEITUNG = "Leitung";			public static final String PERM_LEITUNG = "mx.leitung";
    public static final String ADMIN = "Admin";				public static final String PERM_ADMIN = "mx.admin";
    public static final String CTO = "CTO";					public static final String PERM_CTO = "mx.cto";
    public static final String INHABER = "GeilerDudeEy";	public static final String PERM_INHABER = "mx.geilerdudeey";

    public static String getPermFromGroup(String group) {
        String g = group.toLowerCase();
        String perm = PERM_SPIELER;

        if(PERM_SPIELER.contains(g)) {
            return perm;
        } else if(PERM_PREMIUM.contains(g)) {
            perm = PERM_PREMIUM;
        } else if(PERM_PRIME.contains(g)) {
            perm = PERM_PRIME;
        } else if(PERM_ELITE.contains(g)) {
            perm = PERM_ELITE;
        } else if(PERM_EXTREME.contains(g)) {
            perm = PERM_EXTREME;
        } else if(PERM_EPIC.contains(g)) {
            perm = PERM_EPIC;
        } else if(PERM_YT.contains(g)) {
            perm = PERM_YT;
        } else if(PERM_YTPLUS.contains(g)) {
            perm = PERM_YTPLUS;
        } else if(PERM_HELFER.contains(g)) {
            perm = PERM_HELFER;
        } else if(PERM_BUILDER.contains(g)) {
            perm = PERM_BUILDER;
        } else if(PERM_SUP.contains(g)) {
            perm = PERM_SUP;
        } else if(PERM_MOD.contains(g)) {
            perm = PERM_MOD;
        } else if(PERM_DEV.contains(g)) {
            perm = PERM_DEV;
        } else if(PERM_LEITUNG.contains(g)) {
            perm = PERM_LEITUNG;
        } else if(PERM_ADMIN.contains(g)) {
            perm = PERM_ADMIN;
        } else if(PERM_CTO.contains(g)) {
            perm = PERM_CTO;
        } else if(PERM_INHABER.contains(g)) {
            perm = PERM_INHABER;
        }

        return perm;
    }
}