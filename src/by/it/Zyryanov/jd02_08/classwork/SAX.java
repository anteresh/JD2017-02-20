package by.it.Zyryanov.jd02_08.classwork;

import jdk.internal.org.xml.sax.Attributes;
import jdk.internal.org.xml.sax.SAXException;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;


public class SAX extends org.xml.sax.helpers.DefaultHandler {


    private StringBuilder text;
    private StringBuilder txtBuff;
    private String tab;


    @Override
    public void startDocument() throws org.xml.sax.SAXException {
        text = new StringBuilder();
        txtBuff = new StringBuilder();
        tab = "";
    }

    @Override
    public void endDocument() throws org.xml.sax.SAXException {
        System.out.println(text.toString());
    }

    @Override
    public void startElement(String uri, String localName, String qName, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
        System.out.println(qName);
        text.append(tab).append("<").append(qName);
        for (int i = 0; i < attributes.getLength(); i++) {
            String name = attributes.getLocalName(i);
            String value = attributes.getValue(i);
            text.append(" ").append(name).append("=\"").append(value).append("\"");
        }
        text.append(">\n");
        tab = tab + "\t";
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws org.xml.sax.SAXException {
        String tx = txtBuff.toString().trim();
        if (tx.length()>0)
            text.append(tab).append(tx).append("\n");
        System.out.println("/"+qName);
        text.append(tab).append(txtBuff.toString().trim()).append("\n");
        txtBuff.setLength(0);
        tab = tab.substring(1);
        text.append(tab).append("</").append(qName).append(">\n");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws org.xml.sax.SAXException {
        String part = new String(ch,start,length);
        txtBuff.append(part);
    }
}
