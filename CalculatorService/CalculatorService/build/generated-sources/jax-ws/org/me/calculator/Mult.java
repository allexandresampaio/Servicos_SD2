
package org.me.calculator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de mult complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="mult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="i" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="j" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mult", propOrder = {
    "i",
    "j"
})
public class Mult {

    protected int i;
    protected int j;

    /**
     * Obtém o valor da propriedade i.
     * 
     */
    public int getI() {
        return i;
    }

    /**
     * Define o valor da propriedade i.
     * 
     */
    public void setI(int value) {
        this.i = value;
    }

    /**
     * Obtém o valor da propriedade j.
     * 
     */
    public int getJ() {
        return j;
    }

    /**
     * Define o valor da propriedade j.
     * 
     */
    public void setJ(int value) {
        this.j = value;
    }

}
