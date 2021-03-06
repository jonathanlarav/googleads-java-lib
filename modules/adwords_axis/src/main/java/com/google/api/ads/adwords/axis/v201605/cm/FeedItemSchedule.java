/**
 * FeedItemSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;


/**
 * Represents a FeedItem schedule, which specifies a time interval
 * on a given day
 *             when the feed item may serve. The FeedItemSchedule times
 * are in the account's time zone.
 */
public class FeedItemSchedule  implements java.io.Serializable {
    /* Day of the week the schedule applies to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201605.cm.DayOfWeek dayOfWeek;

    /* Starting hour in 24 hour time.
     *                 <span class="constraint InRange">This field must be
     * between 0 and 23, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Integer startHour;

    /* Interval starts these minutes after the starting hour.
     *                 The value can be 0, 15, 30, and 45.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201605.cm.MinuteOfHour startMinute;

    /* Ending hour in 24 hour time; <code>24</code> signifies
     *                 end of the day and subsequently endMinute must be
     * 0.
     *                 <span class="constraint InRange">This field must be
     * between 0 and 24, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private java.lang.Integer endHour;

    /* Interval ends these minutes after the ending hour.
     *                 The value can be 0, 15, 30, and 45.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span> */
    private com.google.api.ads.adwords.axis.v201605.cm.MinuteOfHour endMinute;

    public FeedItemSchedule() {
    }

    public FeedItemSchedule(
           com.google.api.ads.adwords.axis.v201605.cm.DayOfWeek dayOfWeek,
           java.lang.Integer startHour,
           com.google.api.ads.adwords.axis.v201605.cm.MinuteOfHour startMinute,
           java.lang.Integer endHour,
           com.google.api.ads.adwords.axis.v201605.cm.MinuteOfHour endMinute) {
           this.dayOfWeek = dayOfWeek;
           this.startHour = startHour;
           this.startMinute = startMinute;
           this.endHour = endHour;
           this.endMinute = endMinute;
    }


    /**
     * Gets the dayOfWeek value for this FeedItemSchedule.
     * 
     * @return dayOfWeek   * Day of the week the schedule applies to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201605.cm.DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this FeedItemSchedule.
     * 
     * @param dayOfWeek   * Day of the week the schedule applies to.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setDayOfWeek(com.google.api.ads.adwords.axis.v201605.cm.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the startHour value for this FeedItemSchedule.
     * 
     * @return startHour   * Starting hour in 24 hour time.
     *                 <span class="constraint InRange">This field must be
     * between 0 and 23, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Integer getStartHour() {
        return startHour;
    }


    /**
     * Sets the startHour value for this FeedItemSchedule.
     * 
     * @param startHour   * Starting hour in 24 hour time.
     *                 <span class="constraint InRange">This field must be
     * between 0 and 23, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setStartHour(java.lang.Integer startHour) {
        this.startHour = startHour;
    }


    /**
     * Gets the startMinute value for this FeedItemSchedule.
     * 
     * @return startMinute   * Interval starts these minutes after the starting hour.
     *                 The value can be 0, 15, 30, and 45.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201605.cm.MinuteOfHour getStartMinute() {
        return startMinute;
    }


    /**
     * Sets the startMinute value for this FeedItemSchedule.
     * 
     * @param startMinute   * Interval starts these minutes after the starting hour.
     *                 The value can be 0, 15, 30, and 45.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setStartMinute(com.google.api.ads.adwords.axis.v201605.cm.MinuteOfHour startMinute) {
        this.startMinute = startMinute;
    }


    /**
     * Gets the endHour value for this FeedItemSchedule.
     * 
     * @return endHour   * Ending hour in 24 hour time; <code>24</code> signifies
     *                 end of the day and subsequently endMinute must be
     * 0.
     *                 <span class="constraint InRange">This field must be
     * between 0 and 24, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public java.lang.Integer getEndHour() {
        return endHour;
    }


    /**
     * Sets the endHour value for this FeedItemSchedule.
     * 
     * @param endHour   * Ending hour in 24 hour time; <code>24</code> signifies
     *                 end of the day and subsequently endMinute must be
     * 0.
     *                 <span class="constraint InRange">This field must be
     * between 0 and 24, inclusive.</span>
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setEndHour(java.lang.Integer endHour) {
        this.endHour = endHour;
    }


    /**
     * Gets the endMinute value for this FeedItemSchedule.
     * 
     * @return endMinute   * Interval ends these minutes after the ending hour.
     *                 The value can be 0, 15, 30, and 45.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public com.google.api.ads.adwords.axis.v201605.cm.MinuteOfHour getEndMinute() {
        return endMinute;
    }


    /**
     * Sets the endMinute value for this FeedItemSchedule.
     * 
     * @param endMinute   * Interval ends these minutes after the ending hour.
     *                 The value can be 0, 15, 30, and 45.
     *                 <span class="constraint Required">This field is required
     * and should not be {@code null}.</span>
     */
    public void setEndMinute(com.google.api.ads.adwords.axis.v201605.cm.MinuteOfHour endMinute) {
        this.endMinute = endMinute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeedItemSchedule)) return false;
        FeedItemSchedule other = (FeedItemSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              this.dayOfWeek.equals(other.getDayOfWeek()))) &&
            ((this.startHour==null && other.getStartHour()==null) || 
             (this.startHour!=null &&
              this.startHour.equals(other.getStartHour()))) &&
            ((this.startMinute==null && other.getStartMinute()==null) || 
             (this.startMinute!=null &&
              this.startMinute.equals(other.getStartMinute()))) &&
            ((this.endHour==null && other.getEndHour()==null) || 
             (this.endHour!=null &&
              this.endHour.equals(other.getEndHour()))) &&
            ((this.endMinute==null && other.getEndMinute()==null) || 
             (this.endMinute!=null &&
              this.endMinute.equals(other.getEndMinute())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDayOfWeek() != null) {
            _hashCode += getDayOfWeek().hashCode();
        }
        if (getStartHour() != null) {
            _hashCode += getStartHour().hashCode();
        }
        if (getStartMinute() != null) {
            _hashCode += getStartMinute().hashCode();
        }
        if (getEndHour() != null) {
            _hashCode += getEndHour().hashCode();
        }
        if (getEndMinute() != null) {
            _hashCode += getEndMinute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeedItemSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "FeedItemSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "DayOfWeek"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "startHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "startMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "MinuteOfHour"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "endHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "endMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "MinuteOfHour"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
