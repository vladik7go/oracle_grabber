package com.example.oracle_grabber6.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Immutable
@Table(name = "TR_DEVICE", schema = "PUSHPRIORITY", catalog = "")
public class TrDevice {
    private long id;
    private Timestamp createdDate;
    private Long currentPeriodCount;
    private Timestamp currentPeriodStart;
    private Integer daysOfWeek;
    private String endTime;
    private boolean inactive;
    private Timestamp lastSentDate;
    private Timestamp lastSoundSentDate;
    private Integer notificationLimit;
    private Long notificationPeriod;
    private String startTime;
    private String timezone;
    private String token;
    private int type;
    private Timestamp updatedDate;
    private boolean invalid;
    private long badgeCount;
    private String externalId;

    @Id
    @Column(name = "ID")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CREATED_DATE")
    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "CURRENT_PERIOD_COUNT")
    public Long getCurrentPeriodCount() {
        return currentPeriodCount;
    }

    public void setCurrentPeriodCount(Long currentPeriodCount) {
        this.currentPeriodCount = currentPeriodCount;
    }

    @Basic
    @Column(name = "CURRENT_PERIOD_START")
    public Timestamp getCurrentPeriodStart() {
        return currentPeriodStart;
    }

    public void setCurrentPeriodStart(Timestamp currentPeriodStart) {
        this.currentPeriodStart = currentPeriodStart;
    }

    @Basic
    @Column(name = "DAYS_OF_WEEK")
    public Integer getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(Integer daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Basic
    @Column(name = "END_TIME")
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "INACTIVE")
    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    @Basic
    @Column(name = "LAST_SENT_DATE")
    public Timestamp getLastSentDate() {
        return lastSentDate;
    }

    public void setLastSentDate(Timestamp lastSentDate) {
        this.lastSentDate = lastSentDate;
    }

    @Basic
    @Column(name = "LAST_SOUND_SENT_DATE")
    public Timestamp getLastSoundSentDate() {
        return lastSoundSentDate;
    }

    public void setLastSoundSentDate(Timestamp lastSoundSentDate) {
        this.lastSoundSentDate = lastSoundSentDate;
    }

    @Basic
    @Column(name = "NOTIFICATION_LIMIT")
    public Integer getNotificationLimit() {
        return notificationLimit;
    }

    public void setNotificationLimit(Integer notificationLimit) {
        this.notificationLimit = notificationLimit;
    }

    @Basic
    @Column(name = "NOTIFICATION_PERIOD")
    public Long getNotificationPeriod() {
        return notificationPeriod;
    }

    public void setNotificationPeriod(Long notificationPeriod) {
        this.notificationPeriod = notificationPeriod;
    }

    @Basic
    @Column(name = "START_TIME")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "TIMEZONE")
    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Basic
    @Column(name = "TOKEN")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Basic
    @Column(name = "TYPE")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Basic
    @Column(name = "UPDATED_DATE")
    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Basic
    @Column(name = "INVALID")
    public boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    @Basic
    @Column(name = "BADGE_COUNT")
    public long getBadgeCount() {
        return badgeCount;
    }

    public void setBadgeCount(long badgeCount) {
        this.badgeCount = badgeCount;
    }

    @Basic
    @Column(name = "EXTERNAL_ID")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TrDevice trDevice = (TrDevice) o;

        if (id != trDevice.id) return false;
        if (inactive != trDevice.inactive) return false;
        if (type != trDevice.type) return false;
        if (invalid != trDevice.invalid) return false;
        if (badgeCount != trDevice.badgeCount) return false;
        if (createdDate != null ? !createdDate.equals(trDevice.createdDate) : trDevice.createdDate != null)
            return false;
        if (currentPeriodCount != null ? !currentPeriodCount.equals(trDevice.currentPeriodCount) : trDevice.currentPeriodCount != null)
            return false;
        if (currentPeriodStart != null ? !currentPeriodStart.equals(trDevice.currentPeriodStart) : trDevice.currentPeriodStart != null)
            return false;
        if (daysOfWeek != null ? !daysOfWeek.equals(trDevice.daysOfWeek) : trDevice.daysOfWeek != null) return false;
        if (endTime != null ? !endTime.equals(trDevice.endTime) : trDevice.endTime != null) return false;
        if (lastSentDate != null ? !lastSentDate.equals(trDevice.lastSentDate) : trDevice.lastSentDate != null)
            return false;
        if (lastSoundSentDate != null ? !lastSoundSentDate.equals(trDevice.lastSoundSentDate) : trDevice.lastSoundSentDate != null)
            return false;
        if (notificationLimit != null ? !notificationLimit.equals(trDevice.notificationLimit) : trDevice.notificationLimit != null)
            return false;
        if (notificationPeriod != null ? !notificationPeriod.equals(trDevice.notificationPeriod) : trDevice.notificationPeriod != null)
            return false;
        if (startTime != null ? !startTime.equals(trDevice.startTime) : trDevice.startTime != null) return false;
        if (timezone != null ? !timezone.equals(trDevice.timezone) : trDevice.timezone != null) return false;
        if (token != null ? !token.equals(trDevice.token) : trDevice.token != null) return false;
        if (updatedDate != null ? !updatedDate.equals(trDevice.updatedDate) : trDevice.updatedDate != null)
            return false;
        if (externalId != null ? !externalId.equals(trDevice.externalId) : trDevice.externalId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createdDate != null ? createdDate.hashCode() : 0);
        result = 31 * result + (currentPeriodCount != null ? currentPeriodCount.hashCode() : 0);
        result = 31 * result + (currentPeriodStart != null ? currentPeriodStart.hashCode() : 0);
        result = 31 * result + (daysOfWeek != null ? daysOfWeek.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        result = 31 * result + (inactive ? 1 : 0);
        result = 31 * result + (lastSentDate != null ? lastSentDate.hashCode() : 0);
        result = 31 * result + (lastSoundSentDate != null ? lastSoundSentDate.hashCode() : 0);
        result = 31 * result + (notificationLimit != null ? notificationLimit.hashCode() : 0);
        result = 31 * result + (notificationPeriod != null ? notificationPeriod.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (timezone != null ? timezone.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (updatedDate != null ? updatedDate.hashCode() : 0);
        result = 31 * result + (invalid ? 1 : 0);
        result = 31 * result + (int) (badgeCount ^ (badgeCount >>> 32));
        result = 31 * result + (externalId != null ? externalId.hashCode() : 0);
        return result;
    }
}
