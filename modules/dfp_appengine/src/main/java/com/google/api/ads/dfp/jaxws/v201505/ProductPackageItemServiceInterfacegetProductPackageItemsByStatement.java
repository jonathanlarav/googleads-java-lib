
package com.google.api.ads.dfp.jaxws.v201505;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link ProductPackageItemPage} of {@code ProductPackageItem} objects
 *             that satisfy the filtering criteria specified by given {@link Statement#query}.
 *             The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link ProductPackageItem#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code productPackageId}</td>
 *             <td>{@link ProductPackageItem#productPackageId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code productId}</td>
 *             <td>{@link ProductPackageItem#productId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code productTemplateId}</td>
 *             <td>{@link ProductPackageItem#productTemplateId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code mandatory}</td>
 *             <td>{@link ProductPackageItem#mandatory}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code archived}</td>
 *             <td>{@link ProductPackageItem#archived}</td>
 *             </tr>
 *             </table>
 *             
 *             @param statement a Publisher Query Language statement which specifies the
 *             filtering criteria over product packages
 *             @return the product package items that match the given statement
 *           
 * 
 * <p>Java class for getProductPackageItemsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getProductPackageItemsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="statement" type="{https://www.google.com/apis/ads/publisher/v201505}Statement" minOccurs="0"/>
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
    "statement"
})
@XmlRootElement(name = "getProductPackageItemsByStatement")
public class ProductPackageItemServiceInterfacegetProductPackageItemsByStatement {

    protected Statement statement;

    /**
     * Gets the value of the statement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * Sets the value of the statement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setStatement(Statement value) {
        this.statement = value;
    }

}
