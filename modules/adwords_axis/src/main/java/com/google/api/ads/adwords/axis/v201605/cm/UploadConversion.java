/**
 * UploadConversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201605.cm;


/**
 * A conversion type that receives conversions by having them uploaded
 * through the OfflineConversionFeedService.
 *             
 *             After successfully creating a new UploadConversion, send
 * the name of this conversion type
 *             along with your conversion details to the OfflineConversionFeedService
 * to attribute those conversions to this conversion type.
 */
public class UploadConversion  extends com.google.api.ads.adwords.axis.v201605.cm.ConversionTracker  implements java.io.Serializable {
    public UploadConversion() {
    }

    public UploadConversion(
           java.lang.Long id,
           java.lang.Long originalConversionTypeId,
           java.lang.String name,
           com.google.api.ads.adwords.axis.v201605.cm.ConversionTrackerStatus status,
           com.google.api.ads.adwords.axis.v201605.cm.ConversionTrackerCategory category,
           java.lang.Long conversionTypeOwnerCustomerId,
           java.lang.Integer viewthroughLookbackWindow,
           java.lang.Integer ctcLookbackWindow,
           com.google.api.ads.adwords.axis.v201605.cm.ConversionDeduplicationMode countingType,
           java.lang.Double defaultRevenueValue,
           java.lang.String defaultRevenueCurrencyCode,
           java.lang.Boolean alwaysUseDefaultRevenueValue,
           java.lang.Boolean excludeFromBidding,
           java.lang.String mostRecentConversionDate,
           java.lang.String lastReceivedRequestTime,
           java.lang.String conversionTrackerType) {
        super(
            id,
            originalConversionTypeId,
            name,
            status,
            category,
            conversionTypeOwnerCustomerId,
            viewthroughLookbackWindow,
            ctcLookbackWindow,
            countingType,
            defaultRevenueValue,
            defaultRevenueCurrencyCode,
            alwaysUseDefaultRevenueValue,
            excludeFromBidding,
            mostRecentConversionDate,
            lastReceivedRequestTime,
            conversionTrackerType);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UploadConversion)) return false;
        UploadConversion other = (UploadConversion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UploadConversion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201605", "UploadConversion"));
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
