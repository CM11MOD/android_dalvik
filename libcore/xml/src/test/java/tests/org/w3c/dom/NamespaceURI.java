/*
 This Java source file was generated by test-to-java.xsl
 and is a derived work from the source document.
 The source document contained the following notice:



 Copyright (c) 2001-2003 World Wide Web Consortium, 
 (Massachusetts Institute of Technology, Institut National de
 Recherche en Informatique et en Automatique, Keio University).  All 
 Rights Reserved.  This program is distributed under the W3C's Software
 Intellectual Property License.  This program is distributed in the 
 hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR 
 PURPOSE.  

 See W3C License http://www.w3.org/Consortium/Legal/ for more details.


 */

package tests.org.w3c.dom;

import dalvik.annotation.TestTargets;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTargetNew;
import dalvik.annotation.TestTargetClass;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;

/**
 * The "getNamespaceURI()" method for an Attribute returns the namespace URI of
 * this node, or null if unspecified.
 * 
 * Retrieve the first "emp:address" node which has an attribute of
 * "emp:district" that is specified in the DTD. Invoke the "getNamespaceURI()"
 * method on the attribute. The method should return "http://www.nist.gov".
 * 
 * @author NIST
 * @author Mary Brady
 * @see <a
 *      href="http://www.w3.org/TR/DOM-Level-2-Core/core#ID-NodeNSname">http://www.w3.org/TR/DOM-Level-2-Core/core#ID-NodeNSname</a>
 * @see <a
 *      href="http://www.w3.org/Bugs/Public/show_bug.cgi?id=238">http://www.w3.org/Bugs/Public/show_bug.cgi?id=238</a>
 */
@TestTargetClass(Attr.class) 
public final class NamespaceURI extends DOMTestCase {

    DOMDocumentBuilderFactory factory;

    DocumentBuilder builder;

    protected void setUp() throws Exception {
        super.setUp();
        try {
            factory = new DOMDocumentBuilderFactory(DOMDocumentBuilderFactory
                    .getConfiguration2());
            builder = factory.getBuilder();
        } catch (Exception e) {
            fail("Unexpected exception" + e.getMessage());
        }
    }

    protected void tearDown() throws Exception {
        factory = null;
        builder = null;
        super.tearDown();
    }

    /**
     * Runs the test case.
     * 
     * @throws Throwable
     *             Any uncaught exception causes test to fail
     */
// Assumes validation.
//    public void testGetNamespaceURI1() throws Throwable {
//        Document doc;
//        NodeList elementList;
//        Element testAddr;
//        Attr addrAttr;
//        String attrNamespaceURI;
//        doc = (Document) load("staffNS", builder);
//        elementList = doc.getElementsByTagName("emp:address");
//        testAddr = (Element) elementList.item(0);
//        addrAttr = testAddr.getAttributeNodeNS("http://www.nist.gov",
//                "district");
//        attrNamespaceURI = addrAttr.getNamespaceURI();
//        assertEquals("namespaceURI", "http://www.nist.gov", attrNamespaceURI);
//    }
    @TestTargetNew(
        level = TestLevel.PARTIAL,
        notes = "Doesn't verify that getNamespaceURI method returns null.",
        method = "getNamespaceURI",
        args = {}
    )
    public void testGetNamespaceURI2() throws Throwable {
        Document doc;
        NodeList elementList;
        Element testAddr;
        Attr addrAttr;
        String attrNamespaceURI;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("emp:address");
        testAddr = (Element) elementList.item(0);
        assertNotNull("empAddressNotNull", testAddr);
        addrAttr = testAddr.getAttributeNodeNS("http://www.nist.gov",
                "domestic");
        attrNamespaceURI = addrAttr.getNamespaceURI();
        assertEquals("namespaceURI", "http://www.nist.gov", attrNamespaceURI);
    }
    @TestTargetNew(
        level = TestLevel.PARTIAL,
        notes = "Doesn't verify that getNamespaceURI method returns null.",
        method = "getNamespaceURI",
        args = {}
    )
    public void testGetNamespaceURI3() throws Throwable {
        Document doc;
        NodeList elementList;
        Node testEmployee;
        String employeeNamespace;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("employee");
        testEmployee = elementList.item(0);
        assertNotNull("employeeNotNull", testEmployee);
        employeeNamespace = testEmployee.getNamespaceURI();
        assertEquals("namespaceURI", "http://www.nist.gov", employeeNamespace);
    }
    @TestTargetNew(
        level = TestLevel.PARTIAL,
        notes = "Verifies that getNamespaceURI method returns null.",
        method = "getNamespaceURI",
        args = {}
    )
    public void testGetNamespaceURI4() throws Throwable {
        Document doc;
        NodeList elementList;
        Node testEmployee;
        String employeeNamespace;
        doc = (Document) load("staffNS", builder);
        elementList = doc.getElementsByTagName("employee");
        testEmployee = elementList.item(1);
        employeeNamespace = testEmployee.getNamespaceURI();
        assertNull("throw_Null", employeeNamespace);
    }
}
