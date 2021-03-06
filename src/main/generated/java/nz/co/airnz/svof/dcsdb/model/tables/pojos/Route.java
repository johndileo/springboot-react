/*
 * This file is generated by jOOQ.
*/
package nz.co.airnz.svof.dcsdb.model.tables.pojos;


import java.io.Serializable;
import java.sql.Date;

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
public class Route implements Serializable {

    private static final long serialVersionUID = 89751592;

    private String  flightIdComposite;
    private String  airlineCode;
    private String  flightNumber;
    private Date    flightOriginDate;
    private Integer dcsFlightVersionNum;
    private Integer routeSeqNo;
    private String  airportIata;

    public Route() {}

    public Route(Route value) {
        this.flightIdComposite = value.flightIdComposite;
        this.airlineCode = value.airlineCode;
        this.flightNumber = value.flightNumber;
        this.flightOriginDate = value.flightOriginDate;
        this.dcsFlightVersionNum = value.dcsFlightVersionNum;
        this.routeSeqNo = value.routeSeqNo;
        this.airportIata = value.airportIata;
    }

    public Route(
        String  flightIdComposite,
        String  airlineCode,
        String  flightNumber,
        Date    flightOriginDate,
        Integer dcsFlightVersionNum,
        Integer routeSeqNo,
        String  airportIata
    ) {
        this.flightIdComposite = flightIdComposite;
        this.airlineCode = airlineCode;
        this.flightNumber = flightNumber;
        this.flightOriginDate = flightOriginDate;
        this.dcsFlightVersionNum = dcsFlightVersionNum;
        this.routeSeqNo = routeSeqNo;
        this.airportIata = airportIata;
    }

    public String getFlightIdComposite() {
        return this.flightIdComposite;
    }

    public Route setFlightIdComposite(String flightIdComposite) {
        this.flightIdComposite = flightIdComposite;
        return this;
    }

    public String getAirlineCode() {
        return this.airlineCode;
    }

    public Route setAirlineCode(String airlineCode) {
        this.airlineCode = airlineCode;
        return this;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public Route setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

    public Date getFlightOriginDate() {
        return this.flightOriginDate;
    }

    public Route setFlightOriginDate(Date flightOriginDate) {
        this.flightOriginDate = flightOriginDate;
        return this;
    }

    public Integer getDcsFlightVersionNum() {
        return this.dcsFlightVersionNum;
    }

    public Route setDcsFlightVersionNum(Integer dcsFlightVersionNum) {
        this.dcsFlightVersionNum = dcsFlightVersionNum;
        return this;
    }

    public Integer getRouteSeqNo() {
        return this.routeSeqNo;
    }

    public Route setRouteSeqNo(Integer routeSeqNo) {
        this.routeSeqNo = routeSeqNo;
        return this;
    }

    public String getAirportIata() {
        return this.airportIata;
    }

    public Route setAirportIata(String airportIata) {
        this.airportIata = airportIata;
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
        final Route other = (Route) obj;
        if (flightIdComposite == null) {
            if (other.flightIdComposite != null)
                return false;
        }
        else if (!flightIdComposite.equals(other.flightIdComposite))
            return false;
        if (airlineCode == null) {
            if (other.airlineCode != null)
                return false;
        }
        else if (!airlineCode.equals(other.airlineCode))
            return false;
        if (flightNumber == null) {
            if (other.flightNumber != null)
                return false;
        }
        else if (!flightNumber.equals(other.flightNumber))
            return false;
        if (flightOriginDate == null) {
            if (other.flightOriginDate != null)
                return false;
        }
        else if (!flightOriginDate.equals(other.flightOriginDate))
            return false;
        if (dcsFlightVersionNum == null) {
            if (other.dcsFlightVersionNum != null)
                return false;
        }
        else if (!dcsFlightVersionNum.equals(other.dcsFlightVersionNum))
            return false;
        if (routeSeqNo == null) {
            if (other.routeSeqNo != null)
                return false;
        }
        else if (!routeSeqNo.equals(other.routeSeqNo))
            return false;
        if (airportIata == null) {
            if (other.airportIata != null)
                return false;
        }
        else if (!airportIata.equals(other.airportIata))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.flightIdComposite == null) ? 0 : this.flightIdComposite.hashCode());
        result = prime * result + ((this.airlineCode == null) ? 0 : this.airlineCode.hashCode());
        result = prime * result + ((this.flightNumber == null) ? 0 : this.flightNumber.hashCode());
        result = prime * result + ((this.flightOriginDate == null) ? 0 : this.flightOriginDate.hashCode());
        result = prime * result + ((this.dcsFlightVersionNum == null) ? 0 : this.dcsFlightVersionNum.hashCode());
        result = prime * result + ((this.routeSeqNo == null) ? 0 : this.routeSeqNo.hashCode());
        result = prime * result + ((this.airportIata == null) ? 0 : this.airportIata.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Route (");

        sb.append(flightIdComposite);
        sb.append(", ").append(airlineCode);
        sb.append(", ").append(flightNumber);
        sb.append(", ").append(flightOriginDate);
        sb.append(", ").append(dcsFlightVersionNum);
        sb.append(", ").append(routeSeqNo);
        sb.append(", ").append(airportIata);

        sb.append(")");
        return sb.toString();
    }
}
