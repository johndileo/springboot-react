/*
 * This file is generated by jOOQ.
*/
package nz.co.airnz.svof.opsdb.model.tables.pojos;


import java.io.Serializable;

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
public class Cabin implements Serializable {

    private static final long serialVersionUID = -1417432492;

    private Integer legNo;
    private Integer updateKey;
    private String  seatClass;
    private Integer seatsPerClass;

    public Cabin() {}

    public Cabin(Cabin value) {
        this.legNo = value.legNo;
        this.updateKey = value.updateKey;
        this.seatClass = value.seatClass;
        this.seatsPerClass = value.seatsPerClass;
    }

    public Cabin(
        Integer legNo,
        Integer updateKey,
        String  seatClass,
        Integer seatsPerClass
    ) {
        this.legNo = legNo;
        this.updateKey = updateKey;
        this.seatClass = seatClass;
        this.seatsPerClass = seatsPerClass;
    }

    public Integer getLegNo() {
        return this.legNo;
    }

    public Cabin setLegNo(Integer legNo) {
        this.legNo = legNo;
        return this;
    }

    public Integer getUpdateKey() {
        return this.updateKey;
    }

    public Cabin setUpdateKey(Integer updateKey) {
        this.updateKey = updateKey;
        return this;
    }

    public String getSeatClass() {
        return this.seatClass;
    }

    public Cabin setSeatClass(String seatClass) {
        this.seatClass = seatClass;
        return this;
    }

    public Integer getSeatsPerClass() {
        return this.seatsPerClass;
    }

    public Cabin setSeatsPerClass(Integer seatsPerClass) {
        this.seatsPerClass = seatsPerClass;
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
        final Cabin other = (Cabin) obj;
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
        if (seatClass == null) {
            if (other.seatClass != null)
                return false;
        }
        else if (!seatClass.equals(other.seatClass))
            return false;
        if (seatsPerClass == null) {
            if (other.seatsPerClass != null)
                return false;
        }
        else if (!seatsPerClass.equals(other.seatsPerClass))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.legNo == null) ? 0 : this.legNo.hashCode());
        result = prime * result + ((this.updateKey == null) ? 0 : this.updateKey.hashCode());
        result = prime * result + ((this.seatClass == null) ? 0 : this.seatClass.hashCode());
        result = prime * result + ((this.seatsPerClass == null) ? 0 : this.seatsPerClass.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cabin (");

        sb.append(legNo);
        sb.append(", ").append(updateKey);
        sb.append(", ").append(seatClass);
        sb.append(", ").append(seatsPerClass);

        sb.append(")");
        return sb.toString();
    }
}
