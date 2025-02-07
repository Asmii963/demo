package org.outdu.democonfigclient;


import lombok.*;
import org.outdu.democonfigclient.AlertStatusEnum;
import org.outdu.democonfigclient.SeverityEnum;
import org.outdu.democonfigclient.ThreatCategoryEnum;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "alertEntity")
public class AlertEntity {

    @Id
    private String alertId;
    private Boolean alert;
    private Integer alertSerial;
    @Indexed
    private Integer deviceId;
    private String deviceLocationDescription;
    private AlertStatusEnum alertStatusEnum;
    private String zone;
    private String sensor;
    private Integer sensorSerialNum;
    private String sensorDescription;
    private String instrument;
    private String instrumentPurpose;
    private String alertType;
    @Indexed
    private Date deviceDate;
    @Indexed
    private Date deviceTime;
    //91 days
    @Indexed(expireAfter="7862400s") /// See this rectify it
    private Date serverTime;
    private Map<String, Object> sensorReading;
    private String deviceState;
    private String thresholdBreached;
    private ThreatCategoryEnum threatCategoryEnum;
    private Integer alertRating;
    private Boolean actionRequired;
    private Integer slaThresholdInMin;
    private Date dismissalTime;

    private List<AlertActionEntity> alertActions;
    private SeverityEnum severityEnum;
    private String refAlertId;

    public Date getServerTime() {
        return serverTime;
    }

    public void setServerTime(Date serverTime) {
        this.serverTime = serverTime;
    }

    public String getAlertId() {
        return alertId;
    }

    public void setAlertId(String alertId) {
        this.alertId = alertId;
    }

    public Integer getAlertSerial() {
        return alertSerial;
    }

    public void setAlertSerial(Integer alertSerial) {
        this.alertSerial = alertSerial;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceLocationDescription() {
        return deviceLocationDescription;
    }

    public void setDeviceLocationDescription(String deviceLocationDescription) {
        this.deviceLocationDescription = deviceLocationDescription;
    }

    public AlertStatusEnum getAlertStatusEnum() {
        return alertStatusEnum;
    }

    public void setAlertStatusEnum(AlertStatusEnum alertStatusEnum) {
        this.alertStatusEnum = alertStatusEnum;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }


    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public Integer getSensorSerialNum() {
        return sensorSerialNum;
    }

    public void setSensorSerialNum(Integer sensorSerialNum) {
        this.sensorSerialNum = sensorSerialNum;
    }

    public String getSensorDescription() {
        return sensorDescription;
    }

    public void setSensorDescription(String sensorDescription) {
        this.sensorDescription = sensorDescription;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getInstrumentPurpose() {
        return instrumentPurpose;
    }

    public void setInstrumentPurpose(String instrumentPurpose) {
        this.instrumentPurpose = instrumentPurpose;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public Date getDeviceDate() {
        return deviceDate;
    }

    public void setDeviceDate(Date deviceDate) {
        this.deviceDate = deviceDate;
    }

    public Date getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(Date deviceTime) {
        this.deviceTime = deviceTime;
    }

    public String getDeviceState() {
        return deviceState;
    }

    public void setDeviceState(String deviceState) {
        this.deviceState = deviceState;
    }

    public String getThresholdBreached() {
        return thresholdBreached;
    }

    public void setThresholdBreached(String thresholdBreached) {
        this.thresholdBreached = thresholdBreached;
    }

    public ThreatCategoryEnum getThreatCategoryEnum() {
        return threatCategoryEnum;
    }

    public void setThreatCategoryEnum(ThreatCategoryEnum threatCategoryEnum) {
        this.threatCategoryEnum = threatCategoryEnum;
    }

    public Integer getAlertRating() {
        return alertRating;
    }

    public void setAlertRating(Integer alertRating) {
        this.alertRating = alertRating;
    }

    public Boolean getActionRequired() {
        return actionRequired;
    }

    public void setActionRequired(Boolean actionRequired) {
        this.actionRequired = actionRequired;
    }

    public Integer getSlaThresholdInMin() {
        return slaThresholdInMin;
    }

    public void setSlaThresholdInMin(Integer slaThresholdInMin) {
        this.slaThresholdInMin = slaThresholdInMin;
    }

    public Date getDismissalTime() {
        return dismissalTime;
    }

    public void setDismissalTime(Date dismissalTime) {
        this.dismissalTime = dismissalTime;
    }

    public List<AlertActionEntity> getAlertActions() {
        return alertActions;
    }

    public void setAlertActions(List<AlertActionEntity> alertActions) {
        this.alertActions = alertActions;
    }

    public SeverityEnum getSeverityEnum() {
        return severityEnum;
    }

    public void setSeverityEnum(SeverityEnum severityEnum) {
        this.severityEnum = severityEnum;
    }

    public String getRefAlertId() {
        return refAlertId;
    }

    public void setRefAlertId(String refAlertId) {
        this.refAlertId = refAlertId;
    }

    public Map<String, Object> getSensorReading() {
        return sensorReading;
    }

    public void setSensorReading(Map<String, Object> sensorReading) {
        this.sensorReading = sensorReading;
    }


    public Boolean getAlert() {
        return alert;
    }

    public void setAlert(Boolean alert) {
        this.alert = alert;
    }
}

