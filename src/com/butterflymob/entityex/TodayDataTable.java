package com.butterflymob.entityex;

/**
 * Created by ilove on 05/01/2017.
 */
public class TodayDataTable {
    private long shareCount;
    private long backCount;
    private float backRate;
    private long willShareCount;
    private long grantUsr;
    //分享率
    private float ShareRate;

    public TodayDataTable() {
    }

    public TodayDataTable(long shareCount, long backCount, float backRate, long willShareCount, long grantUsr, float ShareRate) {
        this.shareCount = shareCount;
        this.backCount = backCount;
        this.backRate = backRate;
        this.willShareCount = willShareCount;
        this.grantUsr = grantUsr;
        this.ShareRate = ShareRate;
    }

    public long getShareCount() {
        return shareCount;
    }

    public void setShareCount(long shareCount) {
        this.shareCount = shareCount;
    }

    public long getBackCount() {
        return backCount;
    }

    public void setBackCount(long backCount) {
        this.backCount = backCount;
    }

    public float getBackRate() {
        return backRate;
    }

    public void setBackRate(float backRate) {
        this.backRate = backRate;
    }

    public long getWillShareCount() {
        return willShareCount;
    }

    public void setWillShareCount(long willShareCount) {
        this.willShareCount = willShareCount;
    }

    public long getGrantUsr() {
        return grantUsr;
    }

    public void setGrantUsr(long grantUsr) {
        this.grantUsr = grantUsr;
    }

    public float getShareRate() {
        return ShareRate;
    }

    public void setShareRate(float shareRate) {
        ShareRate = shareRate;
    }
}
