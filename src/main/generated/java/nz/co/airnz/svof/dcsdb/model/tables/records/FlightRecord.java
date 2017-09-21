/*
 * This file is generated by jOOQ.
*/
package nz.co.airnz.svof.dcsdb.model.tables.records;


import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import nz.co.airnz.svof.dcsdb.model.tables.Flight;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


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
public class FlightRecord extends UpdatableRecordImpl<FlightRecord> implements Record13<String, String, String, Date, Integer, String, String, String, String, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1491986690;

    /**
     * Setter for <code>dcs.flight.flight_id_composite</code>. This composite key is made up of the attributes of the full business key and is used as the primary key for the flight instance within the DCS ODS. This is because the DCS system does not have its own unique internal key. The composite is used to minimize the performance impact of using multiple individual attributes to form the primary key. The attributes used are AirlineCode (3 characters), FlightNumber (4 characters), FlightOrigin_date (10 characters as yyyy-mm-dd) and DCSFlightVersionNumber (4 characters).  This last attribute is sent through as an integer but must be cast as leading zeroes when inserted into this concatenate key
     */
    public FlightRecord setFlightIdComposite(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.flight_id_composite</code>. This composite key is made up of the attributes of the full business key and is used as the primary key for the flight instance within the DCS ODS. This is because the DCS system does not have its own unique internal key. The composite is used to minimize the performance impact of using multiple individual attributes to form the primary key. The attributes used are AirlineCode (3 characters), FlightNumber (4 characters), FlightOrigin_date (10 characters as yyyy-mm-dd) and DCSFlightVersionNumber (4 characters).  This last attribute is sent through as an integer but must be cast as leading zeroes when inserted into this concatenate key
     */
    public String getFlightIdComposite() {
        return (String) get(0);
    }

    /**
     * Setter for <code>dcs.flight.airline_code</code>. 2 or 3 character codes assigned by the International Air Transport Association (IATA) to the world's airlines.
     */
    public FlightRecord setAirlineCode(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.airline_code</code>. 2 or 3 character codes assigned by the International Air Transport Association (IATA) to the world's airlines.
     */
    public String getAirlineCode() {
        return (String) get(1);
    }

    /**
     * Setter for <code>dcs.flight.flight_number</code>. A flight number, when combined with the name of the airline (or its Airline Code)  and the date, identifies a particular flight.
     */
    public FlightRecord setFlightNumber(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.flight_number</code>. A flight number, when combined with the name of the airline (or its Airline Code)  and the date, identifies a particular flight.
     */
    public String getFlightNumber() {
        return (String) get(2);
    }

    /**
     * Setter for <code>dcs.flight.flight_origin_date</code>. A flight's local date of departure from an airport. Sample value and format "2017-07-25"
     */
    public FlightRecord setFlightOriginDate(Date value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.flight_origin_date</code>. A flight's local date of departure from an airport. Sample value and format "2017-07-25"
     */
    public Date getFlightOriginDate() {
        return (Date) get(3);
    }

    /**
     * Setter for <code>dcs.flight.dcs_flight_version_num</code>. Unique number to identify a publish message from DCS to SVOF.
     */
    public FlightRecord setDcsFlightVersionNum(Integer value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.dcs_flight_version_num</code>. Unique number to identify a publish message from DCS to SVOF.
     */
    public Integer getDcsFlightVersionNum() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>dcs.flight.airport_from</code>. Flight departs from this airport.
     */
    public FlightRecord setAirportFrom(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.airport_from</code>. Flight departs from this airport.
     */
    public String getAirportFrom() {
        return (String) get(5);
    }

    /**
     * Setter for <code>dcs.flight.airport_to</code>. Flight arrives into this airport.
     */
    public FlightRecord setAirportTo(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.airport_to</code>. Flight arrives into this airport.
     */
    public String getAirportTo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>dcs.flight.international_domestic</code>. Indicates whether the Flight is International or Domestic
     */
    public FlightRecord setInternationalDomestic(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.international_domestic</code>. Indicates whether the Flight is International or Domestic
     */
    public String getInternationalDomestic() {
        return (String) get(7);
    }

    /**
     * Setter for <code>dcs.flight.business_event_type</code>.
     */
    public FlightRecord setBusinessEventType(String value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.business_event_type</code>.
     */
    public String getBusinessEventType() {
        return (String) get(8);
    }

    /**
     * Setter for <code>dcs.flight.business_event_category</code>.
     */
    public FlightRecord setBusinessEventCategory(String value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.business_event_category</code>.
     */
    public String getBusinessEventCategory() {
        return (String) get(9);
    }

    /**
     * Setter for <code>dcs.flight.business_event_leg_state</code>.
     */
    public FlightRecord setBusinessEventLegState(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.business_event_leg_state</code>.
     */
    public String getBusinessEventLegState() {
        return (String) get(10);
    }

    /**
     * Setter for <code>dcs.flight.business_event_message_time</code>.
     */
    public FlightRecord setBusinessEventMessageTime(Timestamp value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.business_event_message_time</code>.
     */
    public Timestamp getBusinessEventMessageTime() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>dcs.flight.business_event_time</code>.
     */
    public FlightRecord setBusinessEventTime(Timestamp value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>dcs.flight.business_event_time</code>.
     */
    public Timestamp getBusinessEventTime() {
        return (Timestamp) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, Date, Integer, String, String, String, String, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<String, String, String, Date, Integer, String, String, String, String, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Flight.FLIGHT.FLIGHT_ID_COMPOSITE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Flight.FLIGHT.AIRLINE_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Flight.FLIGHT.FLIGHT_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field4() {
        return Flight.FLIGHT.FLIGHT_ORIGIN_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Flight.FLIGHT.DCS_FLIGHT_VERSION_NUM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Flight.FLIGHT.AIRPORT_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Flight.FLIGHT.AIRPORT_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Flight.FLIGHT.INTERNATIONAL_DOMESTIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Flight.FLIGHT.BUSINESS_EVENT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Flight.FLIGHT.BUSINESS_EVENT_CATEGORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Flight.FLIGHT.BUSINESS_EVENT_LEG_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Flight.FLIGHT.BUSINESS_EVENT_MESSAGE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return Flight.FLIGHT.BUSINESS_EVENT_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getFlightIdComposite();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAirlineCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFlightNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value4() {
        return getFlightOriginDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getDcsFlightVersionNum();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getAirportFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAirportTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getInternationalDomestic();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getBusinessEventType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getBusinessEventCategory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getBusinessEventLegState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getBusinessEventMessageTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getBusinessEventTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value1(String value) {
        setFlightIdComposite(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value2(String value) {
        setAirlineCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value3(String value) {
        setFlightNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value4(Date value) {
        setFlightOriginDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value5(Integer value) {
        setDcsFlightVersionNum(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value6(String value) {
        setAirportFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value7(String value) {
        setAirportTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value8(String value) {
        setInternationalDomestic(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value9(String value) {
        setBusinessEventType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value10(String value) {
        setBusinessEventCategory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value11(String value) {
        setBusinessEventLegState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value12(Timestamp value) {
        setBusinessEventMessageTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord value13(Timestamp value) {
        setBusinessEventTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FlightRecord values(String value1, String value2, String value3, Date value4, Integer value5, String value6, String value7, String value8, String value9, String value10, String value11, Timestamp value12, Timestamp value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FlightRecord
     */
    public FlightRecord() {
        super(Flight.FLIGHT);
    }

    /**
     * Create a detached, initialised FlightRecord
     */
    public FlightRecord(String flightIdComposite, String airlineCode, String flightNumber, Date flightOriginDate, Integer dcsFlightVersionNum, String airportFrom, String airportTo, String internationalDomestic, String businessEventType, String businessEventCategory, String businessEventLegState, Timestamp businessEventMessageTime, Timestamp businessEventTime) {
        super(Flight.FLIGHT);

        set(0, flightIdComposite);
        set(1, airlineCode);
        set(2, flightNumber);
        set(3, flightOriginDate);
        set(4, dcsFlightVersionNum);
        set(5, airportFrom);
        set(6, airportTo);
        set(7, internationalDomestic);
        set(8, businessEventType);
        set(9, businessEventCategory);
        set(10, businessEventLegState);
        set(11, businessEventMessageTime);
        set(12, businessEventTime);
    }
}