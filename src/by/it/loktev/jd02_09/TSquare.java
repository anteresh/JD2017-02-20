//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.19 at 11:29:22 AM MSK 
//


package by.it.loktev.jd02_09;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TSquare complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSquare">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="left" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="top" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="width" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="height" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="fill" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="stroke" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSquare")
public class TSquare {

    @XmlAttribute(name = "left", required = true)
    protected BigInteger left;
    @XmlAttribute(name = "top", required = true)
    protected BigInteger top;
    @XmlAttribute(name = "width", required = true)
    protected BigInteger width;
    @XmlAttribute(name = "height", required = true)
    protected BigInteger height;
    @XmlAttribute(name = "fill")
    protected String fill;
    @XmlAttribute(name = "stroke")
    protected String stroke;

    /**
     * Gets the value of the left property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeft() {
        return left;
    }

    /**
     * Sets the value of the left property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeft(BigInteger value) {
        this.left = value;
    }

    /**
     * Gets the value of the top property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTop() {
        return top;
    }

    /**
     * Sets the value of the top property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTop(BigInteger value) {
        this.top = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWidth(BigInteger value) {
        this.width = value;
    }

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHeight(BigInteger value) {
        this.height = value;
    }

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFill(String value) {
        this.fill = value;
    }

    /**
     * Gets the value of the stroke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStroke() {
        return stroke;
    }

    /**
     * Sets the value of the stroke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStroke(String value) {
        this.stroke = value;
    }

}
