/*
 * This file is generated by jOOQ.
*/
package nz.co.airnz.svof.opsdb.model.tables.pojos;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.5"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Flight implements Serializable {

    private static final long serialVersionUID = 137012714;

    private Integer   legNo;
    private Integer   updateKey;
    private String    fnCarrier;
    private String    fnNumber;
    private String    fnSuffix;
    private Date      dayOfOrigin;
    private Date      localDayOfOrigin;
    private Date      localInitialDayOfOrigin;
    private String    messagePubSubGuid;
    private Date      initialDayOfOrigin;
    private String    schedDepPortIataCode;
    private String    schedDepPortIcaoCode;
    private String    schedDepPortIataCountry;
    private String    flightModified;
    private String    flightOperStatus;
    private Integer   flightLegs;
    private Integer   flightChangedLegs;
    private String    intDomInd;
    private String    airlineIcaoCode;
    private String    flightLastUpdateUserid;
    private Timestamp flightLastUpdateTimestamp;
    private String    businessEventType;
    private String    businessEventCategory;
    private String    businessEventKey;
    private String    businessEventLegState;
    private Timestamp businessEventMessageTime;
    private Timestamp businessEventTime;

    public Flight() {}

    public Flight(Flight value) {
        this.legNo = value.legNo;
        this.updateKey = value.updateKey;
        this.fnCarrier = value.fnCarrier;
        this.fnNumber = value.fnNumber;
        this.fnSuffix = value.fnSuffix;
        this.dayOfOrigin = value.dayOfOrigin;
        this.localDayOfOrigin = value.localDayOfOrigin;
        this.localInitialDayOfOrigin = value.localInitialDayOfOrigin;
        this.messagePubSubGuid = value.messagePubSubGuid;
        this.initialDayOfOrigin = value.initialDayOfOrigin;
        this.schedDepPortIataCode = value.schedDepPortIataCode;
        this.schedDepPortIcaoCode = value.schedDepPortIcaoCode;
        this.schedDepPortIataCountry = value.schedDepPortIataCountry;
        this.flightModified = value.flightModified;
        this.flightOperStatus = value.flightOperStatus;
        this.flightLegs = value.flightLegs;
        this.flightChangedLegs = value.flightChangedLegs;
        this.intDomInd = value.intDomInd;
        this.airlineIcaoCode = value.airlineIcaoCode;
        this.flightLastUpdateUserid = value.flightLastUpdateUserid;
        this.flightLastUpdateTimestamp = value.flightLastUpdateTimestamp;
        this.businessEventType = value.businessEventType;
        this.businessEventCategory = value.businessEventCategory;
        this.businessEventKey = value.businessEventKey;
        this.businessEventLegState = value.businessEventLegState;
        this.businessEventMessageTime = value.businessEventMessageTime;
        this.businessEventTime = value.businessEventTime;
    }

    public Flight(
        Integer   legNo,
        Integer   updateKey,
        String    fnCarrier,
        String    fnNumber,
        String    fnSuffix,
        Date      dayOfOrigin,
        Date      localDayOfOrigin,
        Date      localInitialDayOfOrigin,
        String    messagePubSubGuid,
        Date      initialDayOfOrigin,
        String    schedDepPortIataCode,
        String    schedDepPortIcaoCode,
        String    schedDepPortIataCountry,
        String    flightModified,
        String    flightOperStatus,
        Integer   flightLegs,
        Integer   flightChangedLegs,
        String    intDomInd,
        String    airlineIcaoCode,
        String    flightLastUpdateUserid,
        Timestamp flightLastUpdateTimestamp,
        String    businessEventType,
        String    businessEventCategory,
        String    businessEventKey,
        String    businessEventLegState,
        Timestamp businessEventMessageTime,
        Timestamp businessEventTime
    ) {
        this.legNo = legNo;
        this.updateKey = updateKey;
        this.fnCarrier = fnCarrier;
        this.fnNumber = fnNumber;
        this.fnSuffix = fnSuffix;
        this.dayOfOrigin = dayOfOrigin;
        this.localDayOfOrigin = localDayOfOrigin;
        this.localInitialDayOfOrigin = localInitialDayOfOrigin;
        this.messagePubSubGuid = messagePubSubGuid;
        this.initialDayOfOrigin = initialDayOfOrigin;
        this.schedDepPortIataCode = schedDepPortIataCode;
        this.schedDepPortIcaoCode = schedDepPortIcaoCode;
        this.schedDepPortIataCountry = schedDepPortIataCountry;
        this.flightModified = flightModified;
        this.flightOperStatus = flightOperStatus;
        this.flightLegs = flightLegs;
        this.flightChangedLegs = flightChangedLegs;
        this.intDomInd = intDomInd;
        this.airlineIcaoCode = airlineIcaoCode;
        this.flightLastUpdateUserid = flightLastUpdateUserid;
        this.flightLastUpdateTimestamp = flightLastUpdateTimestamp;
        this.businessEventType = businessEventType;
        this.businessEventCategory = businessEventCategory;
        this.businessEventKey = businessEventKey;
        this.businessEventLegState = businessEventLegState;
        this.businessEventMessageTime = businessEventMessageTime;
        this.businessEventTime = businessEventTime;
    }

    public Integer getLegNo() {
        return this.legNo;
    }

    public Flight setLegNo(Integer legNo) {
        this.legNo = legNo;
        return this;
    }

    public Integer getUpdateKey() {
        return this.updateKey;
    }

    public Flight setUpdateKey(Integer updateKey) {
        this.updateKey = updateKey;
        return this;
    }

    public String getFnCarrier() {
        return this.fnCarrier;
    }

    public Flight setFnCarrier(String fnCarrier) {
        this.fnCarrier = fnCarrier;
        return this;
    }

    public String getFnNumber() {
        return this.fnNumber;
    }

    public Flight setFnNumber(String fnNumber) {
        this.fnNumber = fnNumber;
        return this;
    }

    public String getFnSuffix() {
        return this.fnSuffix;
    }

    public Flight setFnSuffix(String fnSuffix) {
        this.fnSuffix = fnSuffix;
        return this;
    }

    public Date getDayOfOrigin() {
        return this.dayOfOrigin;
    }

    public Flight setDayOfOrigin(Date dayOfOrigin) {
        this.dayOfOrigin = dayOfOrigin;
        return this;
    }

    public Date getLocalDayOfOrigin() {
        return this.localDayOfOrigin;
    }

    public Flight setLocalDayOfOrigin(Date localDayOfOrigin) {
        this.localDayOfOrigin = localDayOfOrigin;
        return this;
    }

    public Date getLocalInitialDayOfOrigin() {
        return this.localInitialDayOfOrigin;
    }

    public Flight setLocalInitialDayOfOrigin(Date localInitialDayOfOrigin) {
        this.localInitialDayOfOrigin = localInitialDayOfOrigin;
        return this;
    }

    public String getMessagePubSubGuid() {
        return this.messagePubSubGuid;
    }

    public Flight setMessagePubSubGuid(String messagePubSubGuid) {
        this.messagePubSubGuid = messagePubSubGuid;
        return this;
    }

    public Date getInitialDayOfOrigin() {
        return this.initialDayOfOrigin;
    }

    public Flight setInitialDayOfOrigin(Date initialDayOfOrigin) {
        this.initialDayOfOrigin = initialDayOfOrigin;
        return this;
    }

    public String getSchedDepPortIataCode() {
        return this.schedDepPortIataCode;
    }

    public Flight setSchedDepPortIataCode(String schedDepPortIataCode) {
        this.schedDepPortIataCode = schedDepPortIataCode;
        return this;
    }

    public String getSchedDepPortIcaoCode() {
        return this.schedDepPortIcaoCode;
    }

    public Flight setSchedDepPortIcaoCode(String schedDepPortIcaoCode) {
        this.schedDepPortIcaoCode = schedDepPortIcaoCode;
        return this;
    }

    public String getSchedDepPortIataCountry() {
        return this.schedDepPortIataCountry;
    }

    public Flight setSchedDepPortIataCountry(String schedDepPortIataCountry) {
        this.schedDepPortIataCountry = schedDepPortIataCountry;
        return this;
    }

    public String getFlightModified() {
        return this.flightModified;
    }

    public Flight setFlightModified(String flightModified) {
        this.flightModified = flightModified;
        return this;
    }

    public String getFlightOperStatus() {
        return this.flightOperStatus;
    }

    public Flight setFlightOperStatus(String flightOperStatus) {
        this.flightOperStatus = flightOperStatus;
        return this;
    }

    public Integer getFlightLegs() {
        return this.flightLegs;
    }

    public Flight setFlightLegs(Integer flightLegs) {
        this.flightLegs = flightLegs;
        return this;
    }

    public Integer getFlightChangedLegs() {
        return this.flightChangedLegs;
    }

    public Flight setFlightChangedLegs(Integer flightChangedLegs) {
        this.flightChangedLegs = flightChangedLegs;
        return this;
    }

    public String getIntDomInd() {
        return this.intDomInd;
    }

    public Flight setIntDomInd(String intDomInd) {
        this.intDomInd = intDomInd;
        return this;
    }

    public String getAirlineIcaoCode() {
        return this.airlineIcaoCode;
    }

    public Flight setAirlineIcaoCode(String airlineIcaoCode) {
        this.airlineIcaoCode = airlineIcaoCode;
        return this;
    }

    public String getFlightLastUpdateUserid() {
        return this.flightLastUpdateUserid;
    }

    public Flight setFlightLastUpdateUserid(String flightLastUpdateUserid) {
        this.flightLastUpdateUserid = flightLastUpdateUserid;
        return this;
    }

    public Timestamp getFlightLastUpdateTimestamp() {
        return this.flightLastUpdateTimestamp;
    }

    public Flight setFlightLastUpdateTimestamp(Timestamp flightLastUpdateTimestamp) {
        this.flightLastUpdateTimestamp = flightLastUpdateTimestamp;
        return this;
    }

    public String getBusinessEventType() {
        return this.businessEventType;
    }

    public Flight setBusinessEventType(String businessEventType) {
        this.businessEventType = businessEventType;
        return this;
    }

    public String getBusinessEventCategory() {
        return this.businessEventCategory;
    }

    public Flight setBusinessEventCategory(String businessEventCategory) {
        this.businessEventCategory = businessEventCategory;
        return this;
    }

    public String getBusinessEventKey() {
        return this.businessEventKey;
    }

    public Flight setBusinessEventKey(String businessEventKey) {
        this.businessEventKey = businessEventKey;
        return this;
    }

    public String getBusinessEventLegState() {
        return this.businessEventLegState;
    }

    public Flight setBusinessEventLegState(String businessEventLegState) {
        this.businessEventLegState = businessEventLegState;
        return this;
    }

    public Timestamp getBusinessEventMessageTime() {
        return this.businessEventMessageTime;
    }

    public Flight setBusinessEventMessageTime(Timestamp businessEventMessageTime) {
        this.businessEventMessageTime = businessEventMessageTime;
        return this;
    }

    public Timestamp getBusinessEventTime() {
        return this.businessEventTime;
    }

    public Flight setBusinessEventTime(Timestamp businessEventTime) {
        this.businessEventTime = businessEventTime;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Flight other = (Flight) obj;
        if (legNo == null) {
            if (other.legNo != null)
                return false;
        }
        else if (!legNo.equals(other.legNo))
            return false;
        if (updateKey == null) {
            if (other.updateKey != null)
                return false;
        }
        else if (!updateKey.equals(other.updateKey))
            return false;
        if (fnCarrier == null) {
            if (other.fnCarrier != null)
                return false;
        }
        else if (!fnCarrier.equals(other.fnCarrier))
            return false;
        if (fnNumber == null) {
            if (other.fnNumber != null)
                return false;
        }
        else if (!fnNumber.equals(other.fnNumber))
            return false;
        if (fnSuffix == null) {
            if (other.fnSuffix != null)
                return false;
        }
        else if (!fnSuffix.equals(other.fnSuffix))
            return false;
        if (dayOfOrigin == null) {
            if (other.dayOfOrigin != null)
                return false;
        }
        else if (!dayOfOrigin.equals(other.dayOfOrigin))
            return false;
        if (localDayOfOrigin == null) {
            if (other.localDayOfOrigin != null)
                return false;
        }
        else if (!localDayOfOrigin.equals(other.localDayOfOrigin))
            return false;
        if (localInitialDayOfOrigin == null) {
            if (other.localInitialDayOfOrigin != null)
                return false;
        }
        else if (!localInitialDayOfOrigin.equals(other.localInitialDayOfOrigin))
            return false;
        if (messagePubSubGuid == null) {
            if (other.messagePubSubGuid != null)
                return false;
        }
        else if (!messagePubSubGuid.equals(other.messagePubSubGuid))
            return false;
        if (initialDayOfOrigin == null) {
            if (other.initialDayOfOrigin != null)
                return false;
        }
        else if (!initialDayOfOrigin.equals(other.initialDayOfOrigin))
            return false;
        if (schedDepPortIataCode == null) {
            if (other.schedDepPortIataCode != null)
                return false;
        }
        else if (!schedDepPortIataCode.equals(other.schedDepPortIataCode))
            return false;
        if (schedDepPortIcaoCode == null) {
            if (other.schedDepPortIcaoCode != null)
                return false;
        }
        else if (!schedDepPortIcaoCode.equals(other.schedDepPortIcaoCode))
            return false;
        if (schedDepPortIataCountry == null) {
            if (other.schedDepPortIataCountry != null)
                return false;
        }
        else if (!schedDepPortIataCountry.equals(other.schedDepPortIataCountry))
            return false;
        if (flightModified == null) {
            if (other.flightModified != null)
                return false;
        }
        else if (!flightModified.equals(other.flightModified))
            return false;
        if (flightOperStatus == null) {
            if (other.flightOperStatus != null)
                return false;
        }
        else if (!flightOperStatus.equals(other.flightOperStatus))
            return false;
        if (flightLegs == null) {
            if (other.flightLegs != null)
                return false;
        }
        else if (!flightLegs.equals(other.flightLegs))
            return false;
        if (flightChangedLegs == null) {
            if (other.flightChangedLegs != null)
                return false;
        }
        else if (!flightChangedLegs.equals(other.flightChangedLegs))
            return false;
        if (intDomInd == null) {
            if (other.intDomInd != null)
                return false;
        }
        else if (!intDomInd.equals(other.intDomInd))
            return false;
        if (airlineIcaoCode == null) {
            if (other.airlineIcaoCode != null)
                return false;
        }
        else if (!airlineIcaoCode.equals(other.airlineIcaoCode))
            return false;
        if (flightLastUpdateUserid == null) {
            if (other.flightLastUpdateUserid != null)
                return false;
        }
        else if (!flightLastUpdateUserid.equals(other.flightLastUpdateUserid))
            return false;
        if (flightLastUpdateTimestamp == null) {
            if (other.flightLastUpdateTimestamp != null)
                return false;
        }
        else if (!flightLastUpdateTimestamp.equals(other.flightLastUpdateTimestamp))
            return false;
        if (businessEventType == null) {
            if (other.businessEventType != null)
                return false;
        }
        else if (!businessEventType.equals(other.businessEventType))
            return false;
        if (businessEventCategory == null) {
            if (other.businessEventCategory != null)
                return false;
        }
        else if (!businessEventCategory.equals(other.businessEventCategory))
            return false;
        if (businessEventKey == null) {
            if (other.businessEventKey != null)
                return false;
        }
        else if (!businessEventKey.equals(other.businessEventKey))
            return false;
        if (businessEventLegState == null) {
            if (other.businessEventLegState != null)
                return false;
        }
        else if (!businessEventLegState.equals(other.businessEventLegState))
            return false;
        if (businessEventMessageTime == null) {
            if (other.businessEventMessageTime != null)
                return false;
        }
        else if (!businessEventMessageTime.equals(other.businessEventMessageTime))
            return false;
        if (businessEventTime == null) {
            if (other.businessEventTime != null)
                return false;
        }
        else if (!businessEventTime.equals(other.businessEventTime))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.legNo == null) ? 0 : this.legNo.hashCode());
        result = prime * result + ((this.updateKey == null) ? 0 : this.updateKey.hashCode());
        result = prime * result + ((this.fnCarrier == null) ? 0 : this.fnCarrier.hashCode());
        result = prime * result + ((this.fnNumber == null) ? 0 : this.fnNumber.hashCode());
        result = prime * result + ((this.fnSuffix == null) ? 0 : this.fnSuffix.hashCode());
        result = prime * result + ((this.dayOfOrigin == null) ? 0 : this.dayOfOrigin.hashCode());
        result = prime * result + ((this.localDayOfOrigin == null) ? 0 : this.localDayOfOrigin.hashCode());
        result = prime * result + ((this.localInitialDayOfOrigin == null) ? 0 : this.localInitialDayOfOrigin.hashCode());
        result = prime * result + ((this.messagePubSubGuid == null) ? 0 : this.messagePubSubGuid.hashCode());
        result = prime * result + ((this.initialDayOfOrigin == null) ? 0 : this.initialDayOfOrigin.hashCode());
        result = prime * result + ((this.schedDepPortIataCode == null) ? 0 : this.schedDepPortIataCode.hashCode());
        result = prime * result + ((this.schedDepPortIcaoCode == null) ? 0 : this.schedDepPortIcaoCode.hashCode());
        result = prime * result + ((this.schedDepPortIataCountry == null) ? 0 : this.schedDepPortIataCountry.hashCode());
        result = prime * result + ((this.flightModified == null) ? 0 : this.flightModified.hashCode());
        result = prime * result + ((this.flightOperStatus == null) ? 0 : this.flightOperStatus.hashCode());
        result = prime * result + ((this.flightLegs == null) ? 0 : this.flightLegs.hashCode());
        result = prime * result + ((this.flightChangedLegs == null) ? 0 : this.flightChangedLegs.hashCode());
        result = prime * result + ((this.intDomInd == null) ? 0 : this.intDomInd.hashCode());
        result = prime * result + ((this.airlineIcaoCode == null) ? 0 : this.airlineIcaoCode.hashCode());
        result = prime * result + ((this.flightLastUpdateUserid == null) ? 0 : this.flightLastUpdateUserid.hashCode());
        result = prime * result + ((this.flightLastUpdateTimestamp == null) ? 0 : this.flightLastUpdateTimestamp.hashCode());
        result = prime * result + ((this.businessEventType == null) ? 0 : this.businessEventType.hashCode());
        result = prime * result + ((this.businessEventCategory == null) ? 0 : this.businessEventCategory.hashCode());
        result = prime * result + ((this.businessEventKey == null) ? 0 : this.businessEventKey.hashCode());
        result = prime * result + ((this.businessEventLegState == null) ? 0 : this.businessEventLegState.hashCode());
        result = prime * result + ((this.businessEventMessageTime == null) ? 0 : this.businessEventMessageTime.hashCode());
        result = prime * result + ((this.businessEventTime == null) ? 0 : this.businessEventTime.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Flight (");

        sb.append(legNo);
        sb.append(", ").append(updateKey);
        sb.append(", ").append(fnCarrier);
        sb.append(", ").append(fnNumber);
        sb.append(", ").append(fnSuffix);
        sb.append(", ").append(dayOfOrigin);
        sb.append(", ").append(localDayOfOrigin);
        sb.append(", ").append(localInitialDayOfOrigin);
        sb.append(", ").append(messagePubSubGuid);
        sb.append(", ").append(initialDayOfOrigin);
        sb.append(", ").append(schedDepPortIataCode);
        sb.append(", ").append(schedDepPortIcaoCode);
        sb.append(", ").append(schedDepPortIataCountry);
        sb.append(", ").append(flightModified);
        sb.append(", ").append(flightOperStatus);
        sb.append(", ").append(flightLegs);
        sb.append(", ").append(flightChangedLegs);
        sb.append(", ").append(intDomInd);
        sb.append(", ").append(airlineIcaoCode);
        sb.append(", ").append(flightLastUpdateUserid);
        sb.append(", ").append(flightLastUpdateTimestamp);
        sb.append(", ").append(businessEventType);
        sb.append(", ").append(businessEventCategory);
        sb.append(", ").append(businessEventKey);
        sb.append(", ").append(businessEventLegState);
        sb.append(", ").append(businessEventMessageTime);
        sb.append(", ").append(businessEventTime);

        sb.append(")");
        return sb.toString();
    }
}