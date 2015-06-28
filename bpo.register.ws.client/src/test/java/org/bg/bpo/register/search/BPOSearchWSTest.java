package org.bg.bpo.register.search;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.xml.namespace.QName;

import org.junit.BeforeClass;
import org.junit.Test;

import bg.egov.regix.patentdepartment.TradeMarkType;

public class BPOSearchWSTest {
    private static final QName SERVICE_NAME = new QName("http://bg.org/bpo/register/search/", "BPOSearchService");
    private static BPOSearchService ss;
    private static BPORegisterSearch port;
    
	@BeforeClass
	public static void setUp() {
        ss = new BPOSearchService(BPOSearchService.WSDL_LOCATION, SERVICE_NAME);
        port = ss.getBPOSearchServiceDefaultPort();  
	}
	
	@Test
	public void getMarkByAppNum() {
        String markAppNum = "1952120001N";
        List<TradeMarkType> foundMarks = port.getMarkByAppNum(markAppNum);
		
		assertEquals("Unexpected size of found marks !", 1, foundMarks.size());
		assertEquals("Unexpected application numbber found !", "1952120001N", foundMarks.get(0).getApplicationNumber());
		assertEquals("Unexpected registration number found !", "00000556", foundMarks.get(0).getRegistrationNumber());
		assertEquals("Unexpected description details found !", "NIMONIC", foundMarks.get(0).getWordMarkSpecification().getMarkVerbalElementText().getValue());
	}

	@Test
	public void getMarksByAppName() {
        List<TradeMarkType> foundMarks = port.getMarksByName("NIMONIC");
		
		assertEquals("Unexpected size of found marks !", 1, foundMarks.size());
		assertEquals("Unexpected application numbber found !", "1952120001N", foundMarks.get(0).getApplicationNumber());
		assertEquals("Unexpected registration number found !", "00000556", foundMarks.get(0).getRegistrationNumber());
		assertEquals("Unexpected description details found !", "NIMONIC", foundMarks.get(0).getWordMarkSpecification().getMarkVerbalElementText().getValue());
	}

	@Test
	public void getMarksByOwnerName() {
        List<TradeMarkType> foundMarks = port.getMarkByOwnersName("Ivan", "Ivanov", "Ivanov");
		
		assertEquals("Unexpected size of found marks !", 1, foundMarks.size());
		assertEquals("Unexpected application numbber found !", "2002061560N", foundMarks.get(0).getApplicationNumber());
		assertEquals("Unexpected registration number found !", "", foundMarks.get(0).getRegistrationNumber());
		assertEquals("Unexpected description details found !", "", foundMarks.get(0).getMarkDescriptionDetails().getMarkDescription().get(0));
	}

	@Test
	public void getMarksByRegNum() {
        List<TradeMarkType> foundMarks = port.getMarkByRegNum("00000556");
		
		assertEquals("Unexpected size of found marks !", 2, foundMarks.size());
		assertEquals("Unexpected application numbber found !", "1952120001N", foundMarks.get(0).getApplicationNumber());
		assertEquals("Unexpected registration number found !", "00000556", foundMarks.get(0).getRegistrationNumber());
		assertEquals("Unexpected description details found !", "NIMONIC", foundMarks.get(0).getWordMarkSpecification().getMarkVerbalElementText().getValue());
		assertEquals("Unexpected application numbber found !", "1989008065N", foundMarks.get(1).getApplicationNumber());
		assertEquals("Unexpected registration number found !", "00000556", foundMarks.get(1).getRegistrationNumber());
		assertEquals("Unexpected description details found !", "BC BULCON", foundMarks.get(1).getWordMarkSpecification().getMarkVerbalElementText().getValue());
	}
}
