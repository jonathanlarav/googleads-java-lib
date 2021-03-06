
package com.google.api.ads.adwords.jaxws.v201509.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Represents a {@link TargetingIdea} returned by search criteria specified in
 *             the {@link TargetingIdeaSelector}. Targeting ideas are keywords or placements
 *             that are similar to those the user inputs.
 *           
 * 
 * <p>Java class for TargetingIdea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetingIdea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="data" type="{https://adwords.google.com/api/adwords/o/v201509}Type_AttributeMapEntry" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TargetingIdea", propOrder = {
    "data"
})
public class TargetingIdea {

    protected List<TypeAttributeMapEntry> data;

    /**
     * Gets the value of the data property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the data property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TypeAttributeMapEntry }
     * 
     * 
     */
    public List<TypeAttributeMapEntry> getData() {
        if (data == null) {
            data = new ArrayList<TypeAttributeMapEntry>();
        }
        return this.data;
    }

}
