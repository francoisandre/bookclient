
package fr.atatorus.bookservice.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="bookType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SCIENCE_FICTION"/>
 *     &lt;enumeration value="POLICIER"/>
 *     &lt;enumeration value="ROMAN_HISTORIQUE"/>
 *     &lt;enumeration value="HEROIC_FANTASY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "bookType")
@XmlEnum
public enum BookType {

    SCIENCE_FICTION,
    POLICIER,
    ROMAN_HISTORIQUE,
    HEROIC_FANTASY;

    public String value() {
        return name();
    }

    public static BookType fromValue(String v) {
        return valueOf(v);
    }

}
