
package com.google.api.ads.adwords.jaxws.v201605.cm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Returns a list of {@link AdGroupBidLandscape}s for the ad groups that match the query. In the
 *             result, the returned {@link LandscapePoint}s are grouped into {@link AdGroupBidLandscape}s
 *             by their ad groups, and numberResults of paging limits the total number of
 *             {@link LandscapePoint}s instead of number of {@link AdGroupBidLandscape}s.
 *             
 *             @param query The SQL-like AWQL query string.
 *             @return A list of bid landscapes.
 *             @throws ApiException if problems occur while parsing the query or fetching bid landscapes.
 *           
 * 
 * <p>Java class for queryAdGroupBidLandscape element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="queryAdGroupBidLandscape">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="query" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "query"
})
@XmlRootElement(name = "queryAdGroupBidLandscape")
public class DataServiceInterfacequeryAdGroupBidLandscape {

    protected String query;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuery(String value) {
        this.query = value;
    }

}
